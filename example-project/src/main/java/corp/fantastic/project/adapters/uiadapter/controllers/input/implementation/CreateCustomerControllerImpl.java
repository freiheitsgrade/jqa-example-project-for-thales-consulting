package corp.fantastic.project.adapters.uiadapter.controllers.input.implementation;

import corp.fantastic.project.adapters.uiadapter.controllers.input.CreateCustomerController;
import corp.fantastic.project.services.customercreation.service.CreateCustomerService;

public class CreateCustomerControllerImpl
        implements CreateCustomerController {
    private final CreateCustomerService createCustomerService;

    public CreateCustomerControllerImpl(CreateCustomerService createService) {
        this.createCustomerService = createService;
    }

    @Override
    public void createCustomer(String name) {
        createCustomerService.createCustomer(name);
    }
}
