package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/*
 * @Entity indicatin that it is JPA entity
 * The @Table is missed because it assumes that this entity will be mapped to a table named Customer.
 */
@Entity
public class Customer {
	/*
	 * @Id indicates the object's ID
	 * @eneratedValue to indicates that the ID should be generated automatically.
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String firstName;
	private String lastName;
	
	protected Customer() {
	}

	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
	
	
	

}
