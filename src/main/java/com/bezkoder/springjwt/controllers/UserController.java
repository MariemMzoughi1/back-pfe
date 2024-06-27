package com.bezkoder.springjwt.controllers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.springjwt.models.ERole;
import com.bezkoder.springjwt.models.Role;
import com.bezkoder.springjwt.models.User;
import com.bezkoder.springjwt.repository.RoleRepository;
import com.bezkoder.springjwt.security.services.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin("http://localhost:4200")
public class UserController {
	 @Autowired
	    private UserService userService;
	 @Autowired
		PasswordEncoder encoder;
	 @Autowired
	 private RoleRepository roleRepository;
	 

	    @PostMapping("/create")
	    public  User createUser(@RequestBody User user) {
	    	System.out.println(user.toString());
	         // Assurez-vous de hacher le mot de passe avant de sauvegarder
	         user.setPassword(encoder.encode(user.getPassword()));
	         
	         // Récupérez les rôles supplémentaires depuis la base de données
	         /*Role roleUser = roleRepository.findByName(ERole.ROLE_USER)
	                 .orElseThrow(() -> new RuntimeException("Erreur: Rôle ROLE_USER non trouvé."));
	         Role roleAdmin = roleRepository.findByName(ERole.ROLE_ADMIN)
	                 .orElseThrow(() -> new RuntimeException("Erreur: Rôle ROLE_ADMIN non trouvé."));
	         Role roleGestion = roleRepository.findByName(ERole.ROLE_SUPERADMIN)
	                 .orElseThrow(() -> new RuntimeException("Erreur: Rôle ROLE_GESTION non trouvé."));
	         Role roleInfo = roleRepository.findByName(ERole.ROLE_INGENIEUR)
	                 .orElseThrow(() -> new RuntimeException("Erreur: Rôle ROLE_INFO non trouvé."));
	         Role roleRh = roleRepository.findByName(ERole.ROLE_ANALYSTE)
	                 .orElseThrow(() -> new RuntimeException("Erreur: Rôle ROLE_RH non trouvé."));
	         Role roleEm = roleRepository.findByName(ERole.ROLE_EMPLOYE)
	                 .orElseThrow(() -> new RuntimeException("Erreur: Rôle ROLE_RH non trouvé."));*/

	         // Ajoutez les rôles à l'utilisateur
	         //user.setRoles(new HashSet<>(Arrays.asList(roleUser, roleAdmin, roleGestion, roleInfo, roleRh,roleEm)));

	         // Enregistrez l'utilisateur dans la base de données
	        

	         return userService.create(user);
	     }
	    

	    @GetMapping("/get/{id}")
	    public User getUser(@PathVariable Long id) {
	        return userService.getById(id);
	    }
	    @GetMapping("")
	    public List<User> getAllUser() {
	        return userService.getAll();
	    }

	    @PutMapping("/update")
	    public User updateUser(@RequestBody User user) {
	        return userService.update(user);
	    }

	    @DeleteMapping("/delete/{id}")
	    public void deleteUser(@PathVariable Long id) {
	        userService.deleteById(id);
	    }
	}
