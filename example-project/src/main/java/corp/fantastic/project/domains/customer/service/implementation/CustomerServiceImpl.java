package corp.fantastic.project.domains.customer.service.implementation;

import corp.fantastic.project.adapters.database.repository.CustomerRepository;
import corp.fantastic.project.domains.customer.model.Customer;
import corp.fantastic.project.domains.customer.service.CustomerService;
import corp.fantastic.project.domains.scoring.model.RiscScore;
import java.util.UUID;

public class CustomerServiceImpl
    implements CustomerService  {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository repository) {
        this.customerRepository = repository;
    }

    @Override
    public Customer createCustomer(String name, RiscScore score) {
        Customer customer = new Customer();
        customer.setId(UUID.randomUUID());
        customer.setName(name);
        customer.setRiscScore(score);

        customerRepository.saveCustomer(customer);

        return customer;
    }

    @Override
    public void disableCustomer(UUID customerId) {
        
    }

    @Override
    public void enableCustomer(UUID customerId) {

    }
}
