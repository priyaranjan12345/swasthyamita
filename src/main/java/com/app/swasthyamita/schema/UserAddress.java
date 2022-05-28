package com.app.swasthyamita.schema;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_address")
public class UserAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private long id;

    @Column(name = "country_id", nullable = false)
    private int countryId;

    @Column(name = "state_id", nullable = false)
    private int stateId;

    @Column(name = "district_id", nullable = false)
    private int districtId;

    @Column(name = "full_address", nullable = false)
    private String fullAddress;

    @Column(name = "locality", nullable = false)
    private String locality;

    @Column(name = "pin", nullable = false)
    private String pinCode;


}
