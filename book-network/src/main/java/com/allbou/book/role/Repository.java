package com.allbou.book.role;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Repository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(String role);
}
