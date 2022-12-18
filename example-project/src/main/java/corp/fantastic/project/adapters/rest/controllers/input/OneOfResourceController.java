package corp.fantastic.project.adapters.rest.controllers.input;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OneOfResourceController {

    @PutMapping(name = "/oneofresources")
    public OneOfRessource updateResource(OneOfRessource input) {
        return new OneOfRessource(input);
    }
}
