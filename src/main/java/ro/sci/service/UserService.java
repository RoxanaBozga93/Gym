package ro.sci.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.sci.model.Customer;
import ro.sci.model.User;
import ro.sci.repo.CustomerRepository;
import ro.sci.repo.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public long save(User user){
        return userRepository.save(user).getId();
    }
}

