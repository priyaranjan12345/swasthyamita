package com.app.swasthyamita.schema;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "patient_details")
public class PatientDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long patientDetailsId;

    @Column(name = "blood_group")
    private String bloodGroupId;

    @Column(name = "body_weight")
    private String bodyWeight;

    @Column(name = "alcoholic")
    private boolean isAlcoholic;

    @Column(name = "smoking")
    private boolean isSmoking;

    @Column(name = "tobacco")
    private boolean isConsumingTobacco;

    @Column(name = "other_bad_habits")
    private String otherBadHabits;
}
