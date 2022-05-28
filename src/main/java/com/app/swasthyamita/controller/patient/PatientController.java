package com.app.swasthyamita.controller.patient;

import com.app.swasthyamita.model.patientdto.PatientRegDto;
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
    @PostMapping(value = "/patient-reg", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public ResponseEntity<PatientRegDto> registerPatient(@ModelAttribute PatientRegDto patientRegDto) {
        return new ResponseEntity<PatientRegDto>((PatientRegDto) null, HttpStatus.OK);
    }
}
