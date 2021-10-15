package com.example.jwtAuothorization.repository;

import com.example.jwtAuothorization.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String name);
}
