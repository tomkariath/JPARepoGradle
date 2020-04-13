package springIO.JPARepoProj;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface PersonRepository extends CrudRepository<Person, Long>{

	List<Person> findByLastName(String lastName);
	
	Person findById(long id);
	
}
