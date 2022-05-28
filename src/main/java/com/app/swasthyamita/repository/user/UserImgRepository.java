package com.app.swasthyamita.repository.user;

import com.app.swasthyamita.schema.UserImg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserImgRepository extends JpaRepository<UserImg, Long> {
}