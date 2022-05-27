package com.app.swasthyamita.repository.patient;

import com.app.swasthyamita.schema.PatientPrescription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientPrescriptionRepository extends JpaRepository<PatientPrescription, Long> {
}