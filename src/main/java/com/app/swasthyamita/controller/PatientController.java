package com.app.swasthyamita.controller;

import com.app.swasthyamita.model.ResponseStatusDto;
import com.app.swasthyamita.model.patientdto.PatientRegDto;
import com.app.swasthyamita.service.patientservice.IPetientRepo;
import com.app.swasthyamita.service.patientservice.PatientRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient")
public class PatientController {
    private final IPetientRepo iPetientRepo;

    public PatientController(PatientRepo patientRepo) {
        super();
        this.iPetientRepo = patientRepo;
    }

    @PostMapping(value = "/registration", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<ResponseStatusDto> registerPatient(@ModelAttribute PatientRegDto patientRegDto) {
        ResponseStatusDto responseStatusDto = new ResponseStatusDto();
        try {
            responseStatusDto = iPetientRepo.savePatient(patientRegDto);
        } catch (Exception e) {
            responseStatusDto.setMessage("Error : During Registration");
            responseStatusDto.setSuccess(false);
        }
        return new ResponseEntity<ResponseStatusDto>(responseStatusDto, HttpStatus.OK);
    }


}
