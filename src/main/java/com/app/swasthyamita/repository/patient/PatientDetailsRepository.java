package com.app.swasthyamita.repository.patient;

import com.app.swasthyamita.schema.PatientDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientDetailsRepository extends JpaRepository<PatientDetails, Long> {
}