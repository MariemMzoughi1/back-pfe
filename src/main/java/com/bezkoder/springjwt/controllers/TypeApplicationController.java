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

import com.bezkoder.springjwt.models.TypeApplication;
import com.bezkoder.springjwt.security.services.TypeApplicationService;

@RestController
@RequestMapping("/typeApplications")
@CrossOrigin("http://localhost:4200")
public class TypeApplicationController {

	@Autowired
    private TypeApplicationService typeApplicationService;

    @PostMapping("/create")
    public TypeApplication createTypeApplication(@RequestBody TypeApplication typeApplication) {
    	System.out.println(typeApplication.toString());
        return typeApplicationService.create(typeApplication);
    }

    @GetMapping("/get/{id}")
    public TypeApplication getTypeApplication(@PathVariable String id) {
        return typeApplicationService.getById(id);
    }
    @GetMapping("")
    public List<TypeApplication> getAllTypeApplication() {
        return typeApplicationService.getAll();
    }
    @PutMapping("/update")
    public TypeApplication updateTypeApplication(@RequestBody TypeApplication typeApplication) {
        return typeApplicationService.update(typeApplication);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTypeApplication(@PathVariable String id) {
        typeApplicationService.deleteById(id);
    }
}

