package com.bezkoder.springjwt.repository;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.Transactional;
import com.bezkoder.springjwt.models.API;

@Transactional
@EnableJpaRepositories
public interface APIRepository extends JpaRepository<API,String> {
	List<API> findAll();
}

