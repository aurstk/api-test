package org.test.services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.test.model.Gender;
import org.test.repository.GenderRepository;

import java.util.List;

@ApplicationScoped
public class GenderService {

    @Inject
    GenderRepository genderRepository;

    @Transactional
    public List<Gender> getAllGenders(){
        return genderRepository.listAll();
    }
    @Transactional
    public Gender saveGender(Gender gender){
        genderRepository.persist(gender);
        return gender;
    }
}
