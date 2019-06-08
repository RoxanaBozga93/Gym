package ro.sci.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.sci.model.Admin;
import ro.sci.repo.AdminRepository;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public void save(Admin admin){
        adminRepository.save(admin);
    }
}
