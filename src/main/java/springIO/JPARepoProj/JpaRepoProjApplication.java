package springIO.JPARepoProj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaRepoProjApplication {

	private static final Logger log = LoggerFactory.getLogger(JpaRepoProjApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(JpaRepoProjApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner sample (PersonRepository personRepo) {
		return (args) -> {
			personRepo.save(new Person("Sara", "Haider", 56));
			
			log.info("Values returned by findAll");
			for (Person person : personRepo.findAll()) {
				log.info(person.toString());
			}
			log.info("");
			
			log.info("Values returned by findById");
			Person person = personRepo.findById(3);
			log.info(person.toString());
			log.info("");
			
			log.info("Values returned by findByLastName");
			for (Person persons : personRepo.findByLastName("Kariath")) {
				log.info(persons.toString());
			}
		};
	}
}
