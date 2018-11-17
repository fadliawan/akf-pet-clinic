package id.web.akf.akfpetclinic.repositories;

import id.web.akf.akfpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
