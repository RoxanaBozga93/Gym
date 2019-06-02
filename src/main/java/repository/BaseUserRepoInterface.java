package repository;

import java.util.List;
import java.util.Optional;

import domain.BaseUser;
import enums.ROLES;
import org.springframework.data.repository.CrudRepository;

public interface BaseUserRepoInterface extends CrudRepository<domain.BaseUser, Long> {

    List<domain.BaseUser> findByLastName(String lastName);
    List<domain.BaseUser> findByRole(ROLES roles);



}
