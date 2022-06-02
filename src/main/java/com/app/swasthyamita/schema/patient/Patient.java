package com.app.swasthyamita.schema.patient;

import com.app.swasthyamita.schema.user.User;
import com.app.swasthyamita.schema.user.UserAddress;
import com.app.swasthyamita.schema.user.UserDoc;
import com.app.swasthyamita.schema.user.UserImg;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id")
    private long id;

    // user
    @OneToOne(targetEntity = User.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_fk", referencedColumnName = "user_id")
    private User user;

    // user address
    @OneToOne(targetEntity = UserAddress.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "address_fk", referencedColumnName = "address_id")
    private UserAddress userAddress;

    // user profile image
    @OneToOne(targetEntity = UserImg.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "img_fk", referencedColumnName = "img_id")
    private UserImg userImg;

    // user document (id proof)
    @OneToOne(targetEntity = UserDoc.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "doc_fk", referencedColumnName = "doc_id")
    private UserDoc userDoc;

    // patient habits
    @OneToOne(targetEntity = PatientHabit.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "patient_habit_fk", referencedColumnName = "patient_habit_id")
    private PatientHabit patientHabit;

    // patient previous prescriptions
    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "user_fk", referencedColumnName = "patient_id")
    private List<PatientPrescription> patientPrescriptions = new ArrayList<>();

    // patient previous reports
    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "user_fk", referencedColumnName = "patient_id")
    private List<PatientReports> patientReports = new ArrayList<>();
}
