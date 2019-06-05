package ro.sci.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.sci.model.Customer;
import ro.sci.repo.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    public long save(Customer cust){
        return customerRepository.save(cust).getId();
    }
}
