package com.bezkoder.springjwt.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.springjwt.models.Application;
import com.bezkoder.springjwt.repository.ApplicationRepository;
@Service
public class ApplicationService {
	
	    private final ApplicationRepository ApplicationRepository;
	    
	        public ApplicationService(ApplicationRepository ApplicationRepository) {
	        this.ApplicationRepository = ApplicationRepository;
	 }

	// Method to find all entities
	 //public List<Application> findAllEntities() {
	  //   return ApplicationRepository.findAll();
	 //}
	     @Autowired
	     private ApplicationRepository applicationRepository;

	     public Application create(Application application) {
	    	 System.out.println(application.toString());
	         return applicationRepository.save(application);
	     }

	     public Application getById(String id) {
	         return applicationRepository.findById(id).orElse(null);
	     }

	     public Application update(Application application) {
	         // Vérifier si l'application existe avant de mettre à jour
	         if (applicationRepository.existsById(application.getCode_application())) {
	             return applicationRepository.save(application);
	         }
	         return null; // ou lancez une exception selon votre logique métier
	     }

	     public void deleteById(String id) {
	         applicationRepository.deleteById(id);
	     }

		public List<Application> getAll() {
			// TODO Auto-generated method stub
			return applicationRepository.findAll();
		}
	 }

