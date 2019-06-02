package repository;



import domain.BaseUser;
import domain.GymClass;
import enums.ROLES;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

import java.util.*;

@SpringBootApplication
@EntityScan("src.main.java.domain.GymClass")
public class GymClassRepository {
    List<BaseUser> users = new ArrayList<>();

    private static final Logger log = LoggerFactory.getLogger(BaseUserRepository.class);



    @Bean
    public CommandLineRunner demo(GymClassRepoInterface gymClassRepository) {
        return (args) -> {
            // save a couple of base users

            BaseUserRepoInterface baseUserRepoInterface = null;
            baseUserRepoInterface.findByRole(ROLES.TRAINER).addAll(users);
            List<BaseUser> userList = new ArrayList<BaseUser>(users);


            gymClassRepository.save(new GymClass("Aerobic", users.get(0), 60, 100, 20));
            gymClassRepository.save(new GymClass("Karate", users.get(1), 60, 100, 5));
            gymClassRepository.save(new GymClass("Pilates", users.get(1), 60, 50, 60));
            gymClassRepository.save(new GymClass("Swim", users.get(1), 90, 90, 40));


            // fetch all customers
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (GymClass gymClass : gymClassRepository.findAll()) {
                log.info(gymClass.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            gymClassRepository.findById(1L)
                    .ifPresent(gymClass -> {
                        log.info("BaseUserRepoInterface found with findById(1L):");
                        log.info("--------------------------------");
                        log.info(gymClass.toString());
                        log.info("");
                    });

            // fetch customers by last name
            log.info("BaseUserRepoInterface found with findByLastName('Bauer'):");
            log.info("--------------------------------------------");
            gymClassRepository.findByName("Pilate").forEach(pilate -> {
                log.info(pilate.toString());
            });
            // for (BaseUserRepoInterface bauer : repository.findByLastName("Bauer")) {
            // 	log.info(bauer.toString());
            // }
            log.info("");
        };
    }


}
