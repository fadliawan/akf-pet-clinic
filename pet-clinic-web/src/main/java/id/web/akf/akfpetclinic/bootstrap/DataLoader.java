package id.web.akf.akfpetclinic.bootstrap;

import id.web.akf.akfpetclinic.model.Owner;
import id.web.akf.akfpetclinic.model.PetType;
import id.web.akf.akfpetclinic.model.Vet;
import id.web.akf.akfpetclinic.services.OwnerService;
import id.web.akf.akfpetclinic.services.PetTypeService;
import id.web.akf.akfpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        PetType dog = new PetType();
        dog.setName("Dog");
        petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Samuel");
        vet2.setLastName("Axelrod");
        vetService.save(vet2);

        System.out.println("Loaded vets...");
    }

}
