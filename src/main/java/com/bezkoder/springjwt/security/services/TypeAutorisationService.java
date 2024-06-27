package com.bezkoder.springjwt.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.springjwt.models.TypeAutorisation;
import com.bezkoder.springjwt.repository.TypeAutorisationRepository;

@Service
public class TypeAutorisationService {


private final TypeAutorisationRepository TypeAutorisationRepository;
    
    public TypeAutorisationService(TypeAutorisationRepository TypeAutorisationRepository) {
    this.TypeAutorisationRepository = TypeAutorisationRepository;
}

//Method to find all entities
public List<TypeAutorisation> findAllEntities() {
 return TypeAutorisationRepository.findAll();
}
@Autowired
private TypeAutorisationRepository typeAutorisationRepository;

public TypeAutorisation create(TypeAutorisation typeAutorisation) {
    return typeAutorisationRepository.save(typeAutorisation);
}

public TypeAutorisation getById(String id) {
    return typeAutorisationRepository.findById(id).orElse(null);
}

public TypeAutorisation update(TypeAutorisation typeAutorisation) {
    // Vérifier si le type d'autorisation existe avant de mettre à jour
    if (typeAutorisationRepository.existsById(typeAutorisation.getCodetypeautorisation())) {
        return typeAutorisationRepository.save(typeAutorisation);
    }
    return null; // ou lancez une exception selon votre logique métier
}

public void deleteById(String id) {
    typeAutorisationRepository.deleteById(id);
}
public List<TypeAutorisation> getAll() {
	// TODO Auto-generated method stub
	return typeAutorisationRepository.findAll();
}
}
