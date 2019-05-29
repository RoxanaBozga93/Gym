package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public CommandLineRunner demo(CustomerRepository repository) {
		return (args) -> {
			// save a couple of customers
			repository.save(new BaseUser("Jack", "Bauer"));
			repository.save(new BaseUser("Chloe", "O'Brian"));
			repository.save(new BaseUser("Kim", "Bauer"));
			repository.save(new BaseUser("David", "Palmer"));
			repository.save(new BaseUser("Michelle", "Dessler"));

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (BaseUser baseUser : repository.findAll()) {
				log.info(baseUser.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			repository.findById(1L)
				.ifPresent(baseUser -> {
					log.info("BaseUser found with findById(1L):");
					log.info("--------------------------------");
					log.info(baseUser.toString());
					log.info("");
				});

			// fetch customers by last name
			log.info("BaseUser found with findByLastName('Bauer'):");
			log.info("--------------------------------------------");
			repository.findByLastName("Bauer").forEach(bauer -> {
				log.info(bauer.toString());
			});
			// for (BaseUser bauer : repository.findByLastName("Bauer")) {
			// 	log.info(bauer.toString());
			// }
			log.info("");
		};
	}

}
