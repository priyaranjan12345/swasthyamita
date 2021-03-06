package com.app.swasthyamita.schema.patient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "patient_habit")
public class PatientHabit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_habit_id")
    private long id;

    @Column(name = "blood_group")
    private String bloodGroupId;

    @Column(name = "body_weight")
    private String bodyWeight;

    @Column(name = "is_alcoholic")
    private boolean isAlcoholic;

    @Column(name = "is_smoking")
    private boolean isSmoking;

    @Column(name = "is_consuming_tobacco")
    private boolean isConsumingTobacco;

    @Column(name = "other_bad_habits")
    private String otherBadHabits;

}
