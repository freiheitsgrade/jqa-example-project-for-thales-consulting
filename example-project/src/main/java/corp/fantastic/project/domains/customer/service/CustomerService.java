package corp.fantastic.project.domains.customer.service;

import corp.fantastic.project.domains.customer.model.Customer;
import corp.fantastic.project.domains.scoring.model.RiscScore;
import java.util.UUID;

public interface CustomerService {

    Customer createCustomer(String name, RiscScore score);

    void disableCustomer(UUID customerId);

    void enableCustomer(UUID customerId);
}
