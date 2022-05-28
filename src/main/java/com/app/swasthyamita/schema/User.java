package com.app.swasthyamita.schema;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "dob", nullable = false)
    private String dob;

    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "mobile", nullable = false)
    private String mobile;

    @Column(name = "user_type", nullable = false)
    private String userType;

    @Column(name = "is_verified", nullable = false)
    private boolean isVerified;

    // many-to-many relationship
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_fk", referencedColumnName = "user_id")
    @Fetch(value = FetchMode.SUBSELECT)
    private List<PatientPrescription> patientPrescriptions = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_fk", referencedColumnName = "user_id")
    @Fetch(value = FetchMode.SUBSELECT)
    private List<PatientReports> patientReports = new ArrayList<>();

    // one-to-one relationship
    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "patient_details_fk", insertable = false, updatable = false)
    private PatientDetails patientDetails;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "user_id_proof_fk", insertable = false, updatable = false)
    private UserDoc userDoc;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "user_img_fk", insertable = false, updatable = false)
    private UserImg userImg;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "user_address_fk", insertable = false, updatable = false)
    private UserAddress userAddress;
}
