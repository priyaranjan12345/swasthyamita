package com.app.swasthyamita.schema;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "patient_report")
public class PatientReports {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long patientReportId;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "file_path")
    private String filePath;
}
