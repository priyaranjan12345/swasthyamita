package com.app.swasthyamita.repository.patient;

import com.app.swasthyamita.schema.patient.PatientPrescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientPrescriptionRepository extends JpaRepository<PatientPrescription, Long> {
}