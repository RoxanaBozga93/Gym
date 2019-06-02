package repository;

import domain.BaseUser;
import domain.Role;
import domain.Trainer;
import enums.ROLES;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

public class TrainerRepository {

    private static final Logger log = LoggerFactory.getLogger(BaseUserRepository.class);

    List<Trainer> trainers = new ArrayList<>();

    @Bean
    public CommandLineRunner demo(TrainerRepoInterface trainerRepoInterface) {
        return (args) -> {
            // save a couple of base users

            trainerRepoInterface.save(new domain.Trainer("Jack", "Bauer", "rt@gg.com", "fff", "", ROLES.TRAINER, "Pilates", 100));
            trainerRepoInterface.save(new domain.Trainer("Cucu", "Mucu", "rt@gg.com", "fff", "", ROLES.TRAINER, "Swim", 200));
            trainerRepoInterface.save(new domain.Trainer("Bum", "Bum", "rt@gg.com", "fff", "", ROLES.TRAINER, "Aerobic", 100));
            trainerRepoInterface.save(new domain.Trainer("Suzie", "Mark", "rt@gg.com", "fff", "", ROLES.TRAINER, "Karate", 100));

            trainerRepoInterface.saveAll(trainers);
            // fetch all customers
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (domain.BaseUser baseUser : trainerRepoInterface.findAll()) {
                log.info(baseUser.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            trainerRepoInterface.findById(1L)
                    .ifPresent(trainer -> {
                        log.info("BaseUserRepoInterface found with findById(1L):");
                        log.info("--------------------------------");
                        log.info(trainer.toString());
                        log.info("");
                    });

            // fetch customers by last name
            log.info("BaseUserRepoInterface found with findByLastName('Bauer'):");
            log.info("--------------------------------------------");
            trainerRepoInterface.findByLastName("Bauer").forEach(bauer -> {
                log.info(bauer.toString());
            });
            // for (BaseUserRepoInterface bauer : repository.findByLastName("Bauer")) {
            // 	log.info(bauer.toString());
            // }
            log.info("");
        };
    }
}
