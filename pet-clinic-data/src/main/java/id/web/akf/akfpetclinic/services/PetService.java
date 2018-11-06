package id.web.akf.akfpetclinic.services;

import id.web.akf.akfpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
