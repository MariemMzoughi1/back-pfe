package com.bezkoder.springjwt.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.springjwt.models.Autorisation;
import com.bezkoder.springjwt.security.services.AutorisationService;

@RestController
@RequestMapping("/autorisations")
@CrossOrigin("http://localhost:4200")
public class AutorisationController {
	
	    @Autowired
	    private AutorisationService AutorisationService;

	    @PostMapping("/create")
	    public Autorisation createAutorisation(@RequestBody Autorisation autorisation) {
	    	System.out.println(autorisation.toString());
	        return AutorisationService.create(autorisation);
	    }

	    @GetMapping("/get/{id}")
	    public Autorisation getAutorisation(@PathVariable String id) {
	        return AutorisationService.getById(id);
	    }
	    @GetMapping("")
	    public List<Autorisation> getAllAutorisation() {
	        return AutorisationService.getAll();
	    }
	    @PutMapping("/update")
	    public Autorisation updateAutorisation(@RequestBody Autorisation autorisation) {
	        return AutorisationService.update(autorisation);
	    }

	    @DeleteMapping("/delete/{id}")
	    public void deleteAutorisation(@PathVariable String id) {
	        AutorisationService.deleteById(id);
	    }
	}

