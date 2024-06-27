package com.bezkoder.springjwt.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bezkoder.springjwt.models.TypeApplication;
import com.bezkoder.springjwt.repository.TypeApplicationRepository;

@Service
public class TypeApplicationService {
private final TypeApplicationRepository TypeApplicationRepository;
    
    public TypeApplicationService(TypeApplicationRepository TypeApplicationRepository) {
    this.TypeApplicationRepository = TypeApplicationRepository;
}

//Method to find all entities
public List<TypeApplication> findAllEntities() {
 return TypeApplicationRepository.findAll();
}
@Autowired
private TypeApplicationRepository typeApplicationRepository;

public TypeApplication create(TypeApplication typeApplication) {
    return TypeApplicationRepository.save(typeApplication);
}

public TypeApplication getById(String id) {
    return TypeApplicationRepository.findById(id).orElse(null);
}

public TypeApplication update(TypeApplication typeApplication) {
    // Vérifier si le type d'application existe avant de mettre à jour
    if (typeApplicationRepository.existsById(typeApplication.getCodetypeapp())) {
        return TypeApplicationRepository.save(typeApplication);
    }
    return null; // ou lancez une exception selon votre logique métier
}

public void deleteById(String id) {
    TypeApplicationRepository.deleteById(id);
}
public List<TypeApplication> getAll() {
	// TODO Auto-generated method stub
	return TypeApplicationRepository.findAll();
}
}

