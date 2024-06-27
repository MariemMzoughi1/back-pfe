package com.bezkoder.springjwt.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.springjwt.models.API;
import com.bezkoder.springjwt.repository.APIRepository;


@Service
public class APIService {
	    @Autowired
	    private APIRepository apiRepository;

	    public API create(API api) {
	    	System.out.println(api.toString());
	        return apiRepository.save(api);
	    }

	    public API getById(String id) {
	        return apiRepository.findById(id).orElse(null);
	    }
	    public List<API> getAll(){
	    	return apiRepository.findAll();
	    }

	    public API update(API api) {
	        // Vérifier si l'API existe avant de mettre à jour
	        if (apiRepository.existsById(api.getCode_API())) {
	            return apiRepository.save(api);
	        }
	        return null; // ou lancez une exception selon votre logique métier
	    }

	    public void deleteById(String id) {
	        apiRepository.deleteById(id);
	    }
	}

