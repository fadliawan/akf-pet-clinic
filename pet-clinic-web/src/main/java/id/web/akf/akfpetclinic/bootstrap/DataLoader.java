package id.web.akf.akfpetclinic.bootstrap;

import id.web.akf.akfpetclinic.model.Owner;
import id.web.akf.akfpetclinic.model.Pet;
import id.web.akf.akfpetclinic.model.PetType;
import id.web.akf.akfpetclinic.model.Vet;
import id.web.akf.akfpetclinic.services.OwnerService;
import id.web.akf.akfpetclinic.services.PetTypeService;
import id.web.akf.akfpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

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
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Newyard");
        owner1.setCity("Miami");
        owner1.setTelephone("9012344123123");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner1.setAddress("456 Newyard");
        owner1.setCity("Miami");
        owner1.setTelephone("9012344123456");

        Pet fionasCat = new Pet();
        fionasCat.setName("Bubbly");
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setPetType(savedCatPetType);
        owner2.getPets().add(fionasCat);

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
