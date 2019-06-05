package ro.sci.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ro.sci.model.Trainer;

import java.util.List;

@Repository
public interface TrainerRepository extends CrudRepository<Trainer, Long> {

    List<Trainer> findByLastName(String lastName);
}

