package corp.fantastic.project.adapters.database.repository;

import corp.fantastic.project.domains.customer.model.Customer;

public interface CustomerRepository {
    void saveCustomer(Customer customer);
    void updateCustomer(Customer customer);
}
