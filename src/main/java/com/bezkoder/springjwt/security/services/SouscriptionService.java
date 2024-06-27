package com.bezkoder.springjwt.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.springjwt.models.Souscription;
import com.bezkoder.springjwt.repository.SouscriptionRepository;

@Service
public class SouscriptionService {
	 @Autowired
	    private SouscriptionRepository souscriptionRepository;

		// Method to find all entities
		 public List<Souscription> findAllEntities() {
		     return souscriptionRepository.findAll();
		 }
		

		    public Souscription create(Souscription souscription) {
		    	System.out.println(souscription.toString());
		        return souscriptionRepository.save(souscription);
		    }

		    public Souscription getById(long id) {
		        return souscriptionRepository.findById(id).orElse(null);
		    }

		    public Souscription update(Souscription souscription) {
		        // Vérifier si la souscription existe avant de mettre à jour
		        if (souscriptionRepository.existsById(souscription.getCode_souscription())) {
		            return souscriptionRepository.save(souscription);
		        }
		        return null; // ou lancez une exception selon votre logique métier
		    }

		    public void deleteById(long id) {
		        souscriptionRepository.deleteById(id);
		    }
		    public List<Souscription> getAll() {
				// TODO Auto-generated method stub
		    	List<Souscription> response=souscriptionRepository.findAll();
		    	response.forEach(s->System.out.println(s.toString()));
				return souscriptionRepository.findAll();
			}
		}