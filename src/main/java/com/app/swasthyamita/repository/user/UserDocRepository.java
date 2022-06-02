package com.app.swasthyamita.repository.user;

import com.app.swasthyamita.schema.user.UserDoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDocRepository extends JpaRepository<UserDoc, Long> {
}