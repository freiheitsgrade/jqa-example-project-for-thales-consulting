package corp.fantastic.project.services.customercreation.service.implentation;

import corp.fantastic.project.services.customercreation.model.exception.CustomerNotAcceptedException;
import corp.fantastic.project.services.customercreation.service.CreateCustomerService;
import corp.fantastic.project.domains.customer.model.Customer;
import corp.fantastic.project.domains.customer.service.CustomerService;
import corp.fantastic.project.domains.scoring.model.RiscScore;
import corp.fantastic.project.domains.scoring.service.ScoringService;
import org.springframework.stereotype.Service;

@Service
public class CreateCustomerServiceImpl implements CreateCustomerService {

    private final CustomerService customerService;
    private final ScoringService scoringService;

    public CreateCustomerServiceImpl(CustomerService customerService, ScoringService scoringService) {
        this.customerService = customerService;
        this.scoringService = scoringService;
    }

    @Override
    public Customer createCustomer(String name) {
        RiscScore riscScore = scoringService.getScoringForPerson(name);

        if (RiscScore.NOT_ACCEPTABLE == riscScore) {
            throw new CustomerNotAcceptedException(name);
        }

        Customer customer = customerService.createCustomer(name, riscScore);

        return customer;
    }
}
