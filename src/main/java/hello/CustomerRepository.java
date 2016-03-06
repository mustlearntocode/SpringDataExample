package hello;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
/*
 * The type of entity and id are Customer and long seperately 
 */
public interface CustomerRepository extends CrudRepository<Customer, Long>{
//	no implementation is needed
	List<Customer> findByLastName(String lastName);
}
