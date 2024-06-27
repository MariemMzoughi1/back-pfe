package com.bezkoder.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.Transactional;

import com.bezkoder.springjwt.models.TypeApplication;

@Transactional
@EnableJpaRepositories
public interface TypeApplicationRepository extends JpaRepository<TypeApplication,String> {
		public TypeApplication findByCodetypeapp(String codetypeapp);
	}

