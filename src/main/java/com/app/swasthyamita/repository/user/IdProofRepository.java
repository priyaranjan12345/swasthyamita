package com.app.swasthyamita.repository.user;

import com.app.swasthyamita.schema.UserDoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdProofRepository extends JpaRepository<UserDoc, Long> {
}