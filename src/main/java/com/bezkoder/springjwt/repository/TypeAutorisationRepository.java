package com.bezkoder.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.Transactional;

import com.bezkoder.springjwt.models.TypeAutorisation;


@Transactional
@EnableJpaRepositories
public interface TypeAutorisationRepository extends JpaRepository<TypeAutorisation, String> {
		TypeAutorisation findByCodetypeautorisation(String codetypeautorisation);
}


