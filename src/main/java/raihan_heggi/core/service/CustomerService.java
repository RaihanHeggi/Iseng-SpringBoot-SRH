package raihan_heggi.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Getter;
import raihan_heggi.core.repository.CustomerRepository;

@Component
public class CustomerService {

    // Field Based Dependency Injection Currently not Recommended for Spring
    @Getter
    @Autowired
    private CustomerRepository customerRepository;

    //Qualifier Implementation
    @Getter
    @Autowired
    @Qualifier("normalCustomerRepository")
    private CustomerRepository normalCustomerRepository;

    @Getter
    @Autowired
    @Qualifier("premiumCustomerRepository")
    private CustomerRepository premiumCustomerRepository;
}
  