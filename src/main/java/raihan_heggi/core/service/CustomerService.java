package raihan_heggi.core.service;

import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
public class CustomerService {

    @Getter
    @Autowired
    private CustomerRepository customerRepository;

}
