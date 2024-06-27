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

import com.bezkoder.springjwt.models.API;
import com.bezkoder.springjwt.security.services.APIService;


@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class APIController {
	
	    @Autowired
	    private APIService apiService;

	    @PostMapping("/create")
	    public API createAPI(@RequestBody API api) {
	    	System.out.println(api.toString());
	        return apiService.create(api);
	    }

	    @GetMapping("/get/{id}")
	    public API getAPI(@PathVariable String id) {
	        return apiService.getById(id);
	    }
	    @GetMapping("")
	    public List<API> getAllAPI() {
	        return apiService.getAll();
	    }

	    @PutMapping("/update")
	    public API updateAPI(@RequestBody API api) {
	        return apiService.update(api);
	    }

	    @DeleteMapping("/delete/{id}")
	    public void deleteAPI(@PathVariable String id) {
	        apiService.deleteById(id);
	    }
	}


