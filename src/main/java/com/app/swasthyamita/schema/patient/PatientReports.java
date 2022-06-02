package com.app.swasthyamita.schema.patient;

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
    @Column(name = "report_id")
    private long id;

    @Column(name = "report_name")
    private String reportName;

    @Column(name = "report_path")
    private String reportFilePath;


}
