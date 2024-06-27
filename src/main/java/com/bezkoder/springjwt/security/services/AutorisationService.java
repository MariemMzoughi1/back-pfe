package com.bezkoder.springjwt.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.springjwt.models.Autorisation;
import com.bezkoder.springjwt.repository.AutorisationRepository;

@Service
public class AutorisationService {
	
	    @Autowired
	    private AutorisationRepository autorisationRepository;

	    public Autorisation create(Autorisation autorisation) {
	        return autorisationRepository.save(autorisation);
	    }

	    public Autorisation getById(String id) {
	        return autorisationRepository.findById(id).orElse(null);
	    }

	    public Autorisation update(Autorisation autorisation) {
	        // Vérifier si l'autorisation existe avant de mettre à jour
	        if (autorisationRepository.existsById(autorisation.getCode_autorisation())) {
	            return autorisationRepository.save(autorisation);
	        }
	        return null; // ou lancez une exception selon votre logique métier
	    }

	    public void deleteById(String id) {
	        autorisationRepository.deleteById(id);
	    }
	    public List<Autorisation> getAll() {
			// TODO Auto-generated method stub
			return autorisationRepository.findAll();
		}
	}
