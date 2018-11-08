package id.web.akf.akfpetclinic.services;

import id.web.akf.akfpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
