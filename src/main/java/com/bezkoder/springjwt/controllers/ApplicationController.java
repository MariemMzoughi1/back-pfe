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

import com.bezkoder.springjwt.models.Application;
import com.bezkoder.springjwt.security.services.ApplicationService;

@RestController
@RequestMapping("/applications")
@CrossOrigin(origins = {"http://localhost:4200"})
public class ApplicationController {
	
	    @Autowired
	    private ApplicationService applicationService;

	    @PostMapping("/create")
	    public Application createApplication(@RequestBody Application application) {
	    	System.out.println(application.toString());
	        return applicationService.create(application);
	    }

	    @GetMapping("/get/{id}")
	    public Application getApplication(@PathVariable String id) {
	        return applicationService.getById(id);
	    }
	    @GetMapping("")
	    public List<Application> getAllApplication() {
	        return applicationService.getAll();
	    }

	    @PutMapping("/update")
	    public Application updateApplication(@RequestBody Application application) {
	        return applicationService.update(application);
	    }

	    @DeleteMapping("/delete/{id}")
	    public void deleteApplication(@PathVariable String id) {
	        applicationService.deleteById(id);
	    }
	}