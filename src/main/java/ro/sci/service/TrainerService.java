package ro.sci.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.sci.model.Trainer;
import ro.sci.repo.TrainerRepository;


@Service
public class TrainerService {

    @Autowired
    private TrainerRepository trainerRepository;


    public void save(Trainer trainer){
        trainerRepository.save(trainer);
    }
}
