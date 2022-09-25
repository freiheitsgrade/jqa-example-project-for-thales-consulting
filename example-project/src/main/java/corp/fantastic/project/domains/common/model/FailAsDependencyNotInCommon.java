package corp.fantastic.project.domains.common.model;

import java.util.List;

import corp.fantastic.project.domains.customer.model.Customer;

public class FailAsDependencyNotInCommon {
    // we should not have any dependecy outside common
    private List<Customer> customers;
    
}
