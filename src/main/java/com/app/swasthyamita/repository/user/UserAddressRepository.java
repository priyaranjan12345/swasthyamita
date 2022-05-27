package com.app.swasthyamita.repository.user;

import com.app.swasthyamita.schema.UserAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAddressRepository extends JpaRepository<UserAddress, Long> {
}