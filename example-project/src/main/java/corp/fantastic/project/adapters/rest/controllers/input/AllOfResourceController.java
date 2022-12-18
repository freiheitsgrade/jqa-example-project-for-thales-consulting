package corp.fantastic.project.adapters.rest.controllers.input;

import corp.fantastic.project.adapters.common.model.Pet;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AllOfResourceController {

    @PutMapping(name = "/allofresources")
    public Ressource updateResource(Ressource input) {
        return new Ressource(input);
    }
}
