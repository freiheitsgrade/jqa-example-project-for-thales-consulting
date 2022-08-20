package corp.fantastic.project.adapters.database.repository.implementation;

import corp.fantastic.project.adapters.database.repository.CustomerRepository;
import corp.fantastic.project.domains.customer.model.Customer;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepositoryImplementation
    implements CustomerRepository {
    @Override
    public void saveCustomer(Customer customer) {

    }

    @Override
    public void updateCustomer(Customer customer) {

    }
}
