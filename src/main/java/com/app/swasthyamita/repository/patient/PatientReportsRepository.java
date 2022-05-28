package com.app.swasthyamita.repository.patient;

import com.app.swasthyamita.schema.PatientReports;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientReportsRepository extends JpaRepository<PatientReports, Long> {
}