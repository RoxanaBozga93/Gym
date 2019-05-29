package hello;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<BaseUser, Long> {

    List<BaseUser> findByLastName(String lastName);
}
