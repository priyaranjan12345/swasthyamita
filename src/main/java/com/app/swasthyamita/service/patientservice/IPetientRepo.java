package com.app.swasthyamita.service.patientservice;

import com.app.swasthyamita.model.ResponseStatusDto;
import com.app.swasthyamita.model.patientdto.PatientRegDto;

import java.io.IOException;
import java.net.URISyntaxException;

public interface IPetientRepo {
    ResponseStatusDto savePatient(PatientRegDto patientRegDto) throws IOException, URISyntaxException;

}
