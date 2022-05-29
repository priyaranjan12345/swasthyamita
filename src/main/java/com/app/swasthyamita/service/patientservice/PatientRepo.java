package com.app.swasthyamita.service.patientservice;

import com.app.swasthyamita.model.patientdto.PatientPrescriptionDto;
import com.app.swasthyamita.model.patientdto.PatientRegDto;
import com.app.swasthyamita.model.patientdto.PatientReportsDto;
import com.app.swasthyamita.repository.patient.PatientDetailsRepository;
import com.app.swasthyamita.repository.user.UserJpaRepo;
import com.app.swasthyamita.schema.*;
import com.app.swasthyamita.service.SaveImage;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PatientRepo implements IPetientRepo {

    UserJpaRepo userJpaRepo;
    PatientDetailsRepository patientDetailsRepository;

    void PatientRepo(UserJpaRepo userJpaRepo) {
        this.userJpaRepo = userJpaRepo;
    }

    @Override
    public User registerPatient(PatientRegDto patientRegDto) throws IOException {
        // save user details
        User user = new User();
        user.setName(patientRegDto.getName());
        user.setDob(patientRegDto.getDob());
        user.setEmail(patientRegDto.getEmail());
        user.setMobile(patientRegDto.getMobile());
        user.setGender(patientRegDto.getGender());
        // need to encrypt the password
        user.setPassword(patientRegDto.getPassword());
        user.setUserType(patientRegDto.getUserType());
        user.setVerified(patientRegDto.isVerified());

        // Save patient's prescription in directory and save path in database
        List<PatientPrescription> patientPrescriptions = new ArrayList<>();
        for (PatientPrescriptionDto file : patientRegDto.getPatientPrescriptions()) {
            // save files to directory
            String uploadDir = "user-photos/" + patientRegDto.getEmail();
            String fileName = file.getFileName();
            MultipartFile multipartFile = file.getFile();
            SaveImage.saveFile(uploadDir, fileName, multipartFile);

            // add directories to user for save in database
            PatientPrescription patientPrescription = new PatientPrescription();
            patientPrescription.setPrescriptionFileName(fileName);
            patientPrescription.setPrescriptionFilePath(uploadDir);

            patientPrescriptions.add(patientPrescription);
        }
        user.setPatientPrescriptions(patientPrescriptions);

        // Save patient's reports in directory and save path in database
        List<PatientReports> patientReports = new ArrayList<>();
        for (PatientReportsDto file : patientRegDto.getPatientReports()) {
            // save files to directory
            String uploadDir = "user-photos/" + patientRegDto.getEmail();
            String fileName = file.getFileName();
            MultipartFile multipartFile = file.getFile();
            SaveImage.saveFile(uploadDir, fileName, multipartFile);

            // add directories to user for save in database
            PatientReports patientPrescription = new PatientReports();
            patientPrescription.setReportFileName(fileName);
            patientPrescription.setReportFilePath(uploadDir);

            patientReports.add(patientPrescription);
        }
        user.setPatientReports(patientReports);

        // Save user's profile image in directory and save path in database
        String uploadDir = "user-photos/" + patientRegDto.getEmail();
        String fileName = patientRegDto.getUserImg().getFileName();
        MultipartFile multipartFile = patientRegDto.getUserImg().getImgFile();
        SaveImage.saveFile(uploadDir, fileName, multipartFile);

        UserImg userImg = new UserImg();
        userImg.setImgFileName(fileName);
        userImg.setImgFilePath(uploadDir);
        user.setUserImg(userImg);

        // save user
        User savedUser = userJpaRepo.save(user);

        // save patient details
        if(savedUser != null) {
            PatientDetails patientDetails = patientRegDto.getPatientDetails();
            patientDetails.setUser(savedUser);
            patientDetailsRepository.save(patientDetails);
        }

        // save address
        user.setUserAddress(patientRegDto.getUserAddress());

        return savedUser;
    }
}
