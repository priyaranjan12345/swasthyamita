//package com.app.swasthyamita.schema;
//
//import com.app.swasthyamita.schema.user.User;
//import com.app.swasthyamita.schema.user.UserAddress;
//import com.app.swasthyamita.schema.user.UserDoc;
//import com.app.swasthyamita.schema.user.UserImg;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@Table(name = "doctor")
//public class Doctor {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "doctor_id")
//    private long id;
//
//    //one-to-one
//    // user
//    @OneToOne(targetEntity = User.class, cascade = CascadeType.ALL)
//    @JoinColumn(name = "user_fk", referencedColumnName = "user_id")
//    private User user;
//
//    // user address
//    @OneToOne(targetEntity = UserAddress.class, cascade = CascadeType.ALL)
//    @JoinColumn(name = "address_fk", referencedColumnName = "address_id")
//    private UserAddress userAddress;
//
//    // user profile image
//    @OneToOne(targetEntity = UserImg.class, cascade = CascadeType.ALL)
//    @JoinColumn(name = "img_fk", referencedColumnName = "img_id")
//    private UserImg userImg;
//
//    // user document (id proof)
//    @OneToOne(targetEntity = UserDoc.class, cascade = CascadeType.ALL)
//    @JoinColumn(name = "doc_fk", referencedColumnName = "doc_id")
//    private UserDoc userDoc;
//
//    // doctor certificate
//
//    // other details
//}
