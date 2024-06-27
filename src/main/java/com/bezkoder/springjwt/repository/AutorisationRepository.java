package com.bezkoder.springjwt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.Transactional;

import com.bezkoder.springjwt.models.Autorisation;

@Transactional
@EnableJpaRepositories
public interface AutorisationRepository extends JpaRepository<Autorisation,String> {
	List<Autorisation> findAll();
}

