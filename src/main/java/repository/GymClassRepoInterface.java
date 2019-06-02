package repository;

import domain.GymClass;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GymClassRepoInterface extends CrudRepository<GymClass, Long> {

    List<GymClass> findByName(String name);

}

