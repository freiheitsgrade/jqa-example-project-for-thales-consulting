package corp.fantastic.project.adapters.rest.controllers.input;

import corp.fantastic.project.adapters.common.model.Pet;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetController {

    @PutMapping(name = "/pet")
    public Pet updatePet(Pet updatedPet) {
        return new Pet(updatedPet);
    }
}
