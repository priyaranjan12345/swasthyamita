package com.app.swasthyamita.repository.user;

import com.app.swasthyamita.schema.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userJpaRepo extends JpaRepository<User, Long> {
}
