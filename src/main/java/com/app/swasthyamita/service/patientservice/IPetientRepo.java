package com.app.swasthyamita.service.patientservice;

import com.app.swasthyamita.model.patientdto.PatientRegDto;
import com.app.swasthyamita.schema.User;

import java.io.IOException;

public interface IPetientRepo {
    User registerPatient(PatientRegDto patientRegDto) throws IOException;

}
