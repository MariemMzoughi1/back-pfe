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

import com.bezkoder.springjwt.models.Souscription;
import com.bezkoder.springjwt.security.services.SouscriptionService;

@RestController
@RequestMapping("/souscriptions")
@CrossOrigin("http://localhost:4200")
public class SouscriptionController {
		@Autowired
	    private SouscriptionService souscriptionService;

	    @PostMapping("/create")
	    public Souscription createSouscription(@RequestBody Souscription souscription) {
	    	System.out.println(souscription.toString());
	        return souscriptionService.create(souscription);
	        
	    }

	    @GetMapping("/get/{id}")
	    public Souscription getSouscription(@PathVariable int id) {
	        return souscriptionService.getById(id);
	    }
	    @GetMapping("")
	    public List<Souscription> getAllSouscription() {
	        return souscriptionService.getAll();
	    }
	    @PutMapping("/update")
	    public Souscription updateSouscription(@RequestBody Souscription souscription) {
	        return souscriptionService.update(souscription);
	    }

	    @DeleteMapping("/delete/{id}")
	    public void deleteSouscription(@PathVariable int id) {
	        souscriptionService.deleteById(id);
	    }
	}
