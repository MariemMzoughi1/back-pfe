package com.bezkoder.springjwt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.Transactional;

import com.bezkoder.springjwt.models.Application;

@Transactional
@EnableJpaRepositories
public interface ApplicationRepository extends JpaRepository<Application,String> {
	List<Application> findAll();
}

