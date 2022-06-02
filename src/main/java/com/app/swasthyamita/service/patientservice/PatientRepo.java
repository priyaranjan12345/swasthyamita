package com.app.swasthyamita.service.patientservice;

import com.app.swasthyamita.model.ResponseStatusDto;
import com.app.swasthyamita.model.patientdto.PatientPrescriptionDto;
import com.app.swasthyamita.model.patientdto.PatientRegDto;
import com.app.swasthyamita.model.patientdto.PatientReportsDto;
import com.app.swasthyamita.repository.patient.PatientRepository;
import com.app.swasthyamita.schema.patient.Patient;
import com.app.swasthyamita.schema.patient.PatientPrescription;
import com.app.swasthyamita.schema.patient.PatientReports;
import com.app.swasthyamita.schema.user.UserDoc;
import com.app.swasthyamita.schema.user.UserImg;
import com.app.swasthyamita.service.SaveFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PatientRepo implements IPetientRepo {

    @Autowired
    PatientRepository patientRepository;

    @Override
    public ResponseStatusDto savePatient(PatientRegDto patientRegDto) throws IOException {


        // save user details
        Patient patient = new Patient();
        patient.setUser(patientRegDto.getUser());
        patient.setUserAddress(patientRegDto.getUserAddress());
        patient.setPatientHabit(patientRegDto.getPatientHabit());

        // get file location
        Resource resource = new ClassPathResource("files/");
        File content = new File(resource.getURI().getPath());
        String fileLocation = content.getPath();
        String uploadDir = fileLocation + patientRegDto.getUser().getEmail();

        // Save user's profile image in directory and save path in database
        MultipartFile multipartFileUserImg = patientRegDto.getUserImgDto().getImgFile();
        String dirUserImg = SaveFile.saveFile(uploadDir, multipartFileUserImg.getOriginalFilename(), multipartFileUserImg);

        UserImg userImg = new UserImg();
        userImg.setImgFileName(patientRegDto.getUserImgDto().getFileName()); // type user profile image
        userImg.setImgFilePath(dirUserImg);

        patient.setUserImg(userImg);

        // Save user's profile image in directory and save path in database
        MultipartFile multipartFileUserDoc = patientRegDto.getUserDocDto().getIdProofFile();
        String dirUserDoc = SaveFile.saveFile(uploadDir, multipartFileUserDoc.getOriginalFilename(), multipartFileUserDoc);

        UserDoc userDoc = new UserDoc();
        userDoc.setDocumentName(patientRegDto.getUserDocDto().getDocumentName());// document name
        userDoc.setFilePath(dirUserDoc);

        patient.setUserDoc(userDoc);

        // Save patient's prescription in directory and save path in database
        List<PatientPrescription> patientPrescriptions = new ArrayList<>();
        for (PatientPrescriptionDto file : patientRegDto.getPatientPrescriptions()) {
            // save files to directory
            String fileName = file.getPrescriptionName();
            MultipartFile multipartFile = file.getFile();
            String filepath = SaveFile.saveFile(uploadDir, fileName, multipartFile);

            // add directories to user for save in database
            PatientPrescription patientPrescription = new PatientPrescription();
            patientPrescription.setPrescriptionName(fileName); // prescription type/name
            patientPrescription.setPrescriptionFilePath(uploadDir);

            patientPrescriptions.add(patientPrescription);
        }
        patient.setPatientPrescriptions(patientPrescriptions);

        // Save patient's reports in directory and save path in database
        List<PatientReports> patientReports = new ArrayList<>();
        for (PatientReportsDto file : patientRegDto.getPatientReports()) {
            // save files to directory
            String fileName = file.getReportName();
            MultipartFile multipartFile = file.getFile();
            String filepath = SaveFile.saveFile(uploadDir, fileName, multipartFile);

            // add directories to user for save in database
            PatientReports patientPrescription = new PatientReports();
            patientPrescription.setReportName(fileName); // report type/name
            patientPrescription.setReportFilePath(filepath);

            patientReports.add(patientPrescription);
        }
        patient.setPatientReports(patientReports);

        Patient p = patientRepository.save(patient);

        ResponseStatusDto responseStatusDto = new ResponseStatusDto();
        responseStatusDto.setMessage("User created successfully with user Id : " + p.getId());
        responseStatusDto.setSuccess(true);

        return responseStatusDto;
    }
}
