package com.app.swasthyamita.schema;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.security.PrivateKey;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "patient_details")
public class PatientDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_details_id")
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

    @OneToOne(targetEntity = User.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "uid", referencedColumnName = "user_id")
    @NotFound(action = NotFoundAction.IGNORE)
    private User user;
}
