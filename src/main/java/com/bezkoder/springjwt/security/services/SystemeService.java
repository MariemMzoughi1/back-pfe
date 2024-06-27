package com.bezkoder.springjwt.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.springjwt.models.Systeme;
import com.bezkoder.springjwt.repository.SystemeRepository;

@Service
public class SystemeService {
	@Autowired
    private  SystemeRepository SystemeRepository;
		    
	
		// Method to find all entities
		 public List<Systeme> findAllEntities() {
		     return SystemeRepository.findAll();
		 }
		 @Autowired
		    private SystemeRepository systemeRepository;

		    public Systeme create(Systeme systeme) {
		        return systemeRepository.save(systeme);
		    }

		    public Systeme getById(String id) {
		        return systemeRepository.findById(id).orElse(null);
		    }

		    public Systeme update(Systeme systeme) {
		        // Vérifier si le système existe avant de mettre à jour
		        if (systemeRepository.existsById(systeme.getCodesysteme())) {
		            return systemeRepository.save(systeme);
		        }
		        return null; // ou lancez une exception selon votre logique métier
		    }

		    public void deleteById(String id) {
		        systemeRepository.deleteById(id);
		    }
		    public List<Systeme> getAll() {
				// TODO Auto-generated method stub
				return systemeRepository.findAll();
			}
		}
