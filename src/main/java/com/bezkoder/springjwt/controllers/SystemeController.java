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

import com.bezkoder.springjwt.models.Systeme;
import com.bezkoder.springjwt.security.services.SystemeService;

@RestController
@RequestMapping("/systemes")
@CrossOrigin("http://localhost:4200")
public class SystemeController {
		@Autowired
	    private SystemeService systemeService;

	    @PostMapping("/create")
	    public Systeme createSysteme(@RequestBody Systeme systeme) {
	    	System.out.println(systeme.toString());
	        return systemeService.create(systeme);
	    }

	    @GetMapping("/get/{id}")
	    public Systeme getSysteme(@PathVariable String id) {
	        return systemeService.getById(id);
	    }
	    @GetMapping("")
	    public List<Systeme> getAllSysteme() {
	        return systemeService.getAll();
	    }
	    @PutMapping("/update")
	    public Systeme updateSysteme(@RequestBody Systeme systeme) {
	        return systemeService.update(systeme);
	    }

	    @DeleteMapping("/delete/{id}")
	    public void deleteSysteme(@PathVariable String id) {
	        systemeService.deleteById(id);
	    }
	}

