package com.app.swasthyamita.schema;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "patient_prescription")
public class PatientPrescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prescription_id")
    private long id;

    @Column(name = "prescription_name")
    private String prescriptionFileName;

    @Column(name = "prescription_path")
    private String prescriptionFilePath;
}
