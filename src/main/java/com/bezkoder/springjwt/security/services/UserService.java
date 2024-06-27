package com.bezkoder.springjwt.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.springjwt.models.API;
import com.bezkoder.springjwt.models.Application;
import com.bezkoder.springjwt.models.User;
import com.bezkoder.springjwt.repository.UserRepository;

@Service
public class UserService {
	@Autowired
    private UserRepository userRepository;

    public User create(User user) {
    	
        return userRepository.save(user);
        
    }

    public User getById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
    public List<User> getAll(){
    	return userRepository.findAll();
    }

    public User update(User user) {
        // Vérifier si l'API existe avant de mettre à jour
        if (userRepository.existsById(user.getId())) {
            return userRepository.save(user);
        }
        return null; // ou lancez une exception selon votre logique métier
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
