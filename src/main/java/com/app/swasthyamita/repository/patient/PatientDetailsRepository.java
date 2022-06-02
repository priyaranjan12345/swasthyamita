package com.app.swasthyamita.repository.patient;

import com.app.swasthyamita.schema.patient.PatientHabit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientDetailsRepository extends JpaRepository<PatientHabit, Long> {
}