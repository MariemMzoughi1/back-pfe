package com.bezkoder.springjwt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.Transactional;
import com.bezkoder.springjwt.models.Roles;

@Transactional
@EnableJpaRepositories
public interface RolesRepository extends JpaRepository<Roles,String> {
		List<Roles> findAll();
	}

