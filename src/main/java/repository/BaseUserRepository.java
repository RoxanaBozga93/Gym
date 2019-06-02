package repository;

import domain.BaseUser;
import enums.ROLES;
import domain.Role;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
@EntityScan("src.main.java.domain.BaseUser")
public class BaseUserRepository  {

    private static final Logger log = LoggerFactory.getLogger(BaseUserRepository.class);

    public static void main(String[] args) {
        SpringApplication.run(BaseUserRepository.class);
    }


    List<BaseUser> users = new ArrayList<>();

    public List<domain.BaseUser> findByLastName(String lastName){
        return users;
    }

    public List<domain.BaseUser> findByRole(ROLES roles){
        List<BaseUser> userByRoles = new ArrayList<>();
        for (BaseUser baseUser : users) {
            if(baseUser.getIdRole().equals(roles))
                userByRoles.add(baseUser);
        }
        return userByRoles;
    }




//    @Bean
//    public void save(BaseUserRepoInterface repository){
//        Role admin = new Role(ROLES.ADMIN);
//        Role user = new Role(ROLES.USER);
//        Role trainer = new Role(ROLES.TRAINER);
//        repository.save(new domain.BaseUser("Jack", "Bauer", "rt@gg.com", "fff", "", admin));
//        repository.save(new domain.BaseUser("Chloe", "O'Brian", "rt@gg.com", "fff", "", trainer));
//        repository.save(new domain.BaseUser("Kim", "Bauer", "rt@gg.com", "fff", "", user));
//        repository.save(new domain.BaseUser("David", "Palmer", "rt@gg.com", "fff", "", user));
//        repository.save(new domain.BaseUser("Michelle", "Dessler", "rt@gg.com", "fff", "", user));
//    }
//
//    public void findById(BaseUserRepoInterface repository){
//        repository.findById(1L)
//                .ifPresent(baseUser -> {
//                    log.info("BaseUserRepoInterface found with findById(1L):");
//                    log.info("--------------------------------");
//                    log.info(baseUser.toString());
//                    log.info("");
//                });
//    }


    @Bean
    public CommandLineRunner demo(BaseUserRepoInterface baseUserRepoInterface) {
        return (args) -> {
            // save a couple of base users
            Role admin = new Role(ROLES.ADMIN);
            Role user = new Role(ROLES.USER);
            Role trainer = new Role(ROLES.TRAINER);
            baseUserRepoInterface.save(new domain.BaseUser("Jack", "Bauer", "rt@gg.com", "fff", "", ROLES.ADMIN));
            baseUserRepoInterface.save(new domain.BaseUser("Chloe", "O'Brian", "rt@gg.com", "fff", "", ROLES.TRAINER));
            baseUserRepoInterface.save(new domain.BaseUser("Kim", "Bauer", "rt@gg.com", "fff", "", ROLES.USER));
            baseUserRepoInterface.save(new domain.BaseUser("David", "Palmer", "rt@gg.com", "fff", "", ROLES.USER));
            baseUserRepoInterface.save(new domain.BaseUser("Michelle", "Dessler", "rt@gg.com", "fff", "", ROLES.USER));

            baseUserRepoInterface.saveAll(users);
            // fetch all customers
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (domain.BaseUser baseUser : baseUserRepoInterface.findAll()) {
                log.info(baseUser.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            baseUserRepoInterface.findById(1L)
                    .ifPresent(baseUser -> {
                        log.info("BaseUserRepoInterface found with findById(1L):");
                        log.info("--------------------------------");
                        log.info(baseUser.toString());
                        log.info("");
                    });

            // fetch customers by last name
            log.info("BaseUserRepoInterface found with findByLastName('Bauer'):");
            log.info("--------------------------------------------");
            baseUserRepoInterface.findByLastName("Bauer").forEach(bauer -> {
                log.info(bauer.toString());
            });
            // for (BaseUserRepoInterface bauer : repository.findByLastName("Bauer")) {
            // 	log.info(bauer.toString());
            // }
            log.info("");
        };
    }
}
