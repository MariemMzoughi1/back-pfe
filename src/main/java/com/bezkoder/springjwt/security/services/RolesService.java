package com.bezkoder.springjwt.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.springjwt.models.Roles;
import com.bezkoder.springjwt.repository.RolesRepository;

@Service
public class RolesService {


private final RolesRepository RolesRepository;
    
    public RolesService(RolesRepository RolesRepository) {
    this.RolesRepository = RolesRepository;
}

//Method to find all entities
public List<Roles> findAllEntities() {
 return RolesRepository.findAll();
}
@Autowired
private RolesRepository rolesRepository;

public Roles create(Roles roles) {
    return rolesRepository.save(roles);
}

public Roles getById(String id) {
    return rolesRepository.findById(id).orElse(null);
}

public Roles update(Roles roles) {
    // Vérifier si le rôle existe avant de mettre à jour
    if (rolesRepository.existsById(roles.getId_role())) {
        return rolesRepository.save(roles);
    }
    return null; // ou lancez une exception selon votre logique métier
}

public void deleteById(String id) {
    rolesRepository.deleteById(id);
}
public List<Roles> getAll() {
	// TODO Auto-generated method stub
	return rolesRepository.findAll();
}
}
