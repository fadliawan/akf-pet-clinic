package id.web.akf.akfpetclinic.services;

import id.web.akf.akfpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
