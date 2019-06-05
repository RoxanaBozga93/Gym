package ro.sci.repo;

import org.springframework.data.repository.CrudRepository;
import ro.sci.model.Admin;

import java.util.List;

public interface AdminRepository extends CrudRepository<Admin, Long> {


        List<Admin> findByLastName(String lastName);

}
