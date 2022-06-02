package com.app.swasthyamita.repository.patient;

import com.app.swasthyamita.schema.patient.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}