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

import com.bezkoder.springjwt.models.Roles;
import com.bezkoder.springjwt.security.services.RolesService;

@RestController
@RequestMapping("/roles")
@CrossOrigin("http://localhost:4200")
public class RolesController {
		@Autowired
	    private RolesService rolesService;

	    @PostMapping("/create")
	    public Roles createRole(@RequestBody Roles roles) {
	        return rolesService.create(roles);
	    }

	    @GetMapping("/get/{id}")
	    public Roles getRoles(@PathVariable String id) {
	        return rolesService.getById(id);
	    }
	    @GetMapping("")
	    public List<Roles> getAllRoles() {
	        return rolesService.getAll();
	    }
	    @PutMapping("/update")
	    public Roles updateRoles(@RequestBody Roles roles) {
	        return rolesService.update(roles);
	    }

	    @DeleteMapping("/delete/{id}")
	    public void deleteRoles(@PathVariable String id) {
	        rolesService.deleteById(id);
	    }
	}

