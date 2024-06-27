package com.bezkoder.springjwt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bezkoder.springjwt.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByMatricule(String Matricule);
	Optional<User> findByEmail(String email);

	Boolean existsByUsername(String Username);

	Boolean existsByEmail(String email);
}
