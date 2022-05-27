package com.app.swasthyamita.schema;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long u_id;

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

    @OneToMany(targetEntity = PatientPrescription.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_fk", referencedColumnName = "u_id")
    private List<PatientPrescription> userPrescriptions;

    @OneToMany(targetEntity = PatientReports.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_fk", referencedColumnName = "u_id")
    private List<PatientReports> userReports;

    @OneToOne(targetEntity = IdProof.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_fk", referencedColumnName = "u_id")
    private IdProof idProof;

    @OneToOne(targetEntity = UserImg.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_fk", referencedColumnName = "u_id")
    private UserImg userImg;
}
