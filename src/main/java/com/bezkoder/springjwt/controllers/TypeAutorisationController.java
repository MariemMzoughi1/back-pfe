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

import com.bezkoder.springjwt.models.TypeAutorisation;
import com.bezkoder.springjwt.security.services.TypeAutorisationService;

@RestController
@RequestMapping("/typeAutorisations")
@CrossOrigin("http://localhost:4200")
public class TypeAutorisationController {
		@Autowired
	    private TypeAutorisationService typeAutorisationService;

	    @PostMapping("/create")
	    public TypeAutorisation createTypeAutorisation(@RequestBody TypeAutorisation typeAutorisation) {
	    	System.out.println(typeAutorisation.toString());
	        return typeAutorisationService.create(typeAutorisation);
	    }

	    @GetMapping("/get/{id}")
	    public TypeAutorisation getTypeAutorisation(@PathVariable String id) {
	        return typeAutorisationService.getById(id);
	    }
	    @GetMapping("")
	    public List<TypeAutorisation> getAllTypeAutorisation() {
	        return typeAutorisationService.getAll();
	    }
	    @PutMapping("/update")
	    public TypeAutorisation updateTypeAutorisation(@RequestBody TypeAutorisation typeAutorisation) {
	        return typeAutorisationService.update(typeAutorisation);
	    }

	    @DeleteMapping("/delete/{id}")
	    public void deleteTypeAutorisation(@PathVariable String id) {
	        typeAutorisationService.deleteById(id);
	    }
	}
