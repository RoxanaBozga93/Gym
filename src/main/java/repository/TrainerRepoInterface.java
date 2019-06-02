package repository;

import domain.BaseUser;
import domain.Trainer;
import enums.ROLES;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TrainerRepoInterface extends CrudRepository<Trainer, Long> {

    List<Trainer> findByLastName(String lastName);
    List<Trainer> findBySpeciality(String speciality);
}
