package springIO.JPARepoProj;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Person {

	@Id
	@GenericGenerator(name = "incremental", strategy = "increment")
	@GeneratedValue(generator = "incremental")
	@Column(name = "Id")
	private long id;
	@Column(name = "First_Name")
	private String firstName;
	@Column(name = "Last_Name")
	private String lastName;
	@Column(name = "Age")
	private int age;
	
	public Person() {}
	
	public Person(String firstName, String lastName, int age) {
		this.firstName=firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return String.format("Person[id=%d, firstName='%s', lastName='%s', age=%d]", id, firstName, lastName, age);
	}
	
	public long getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	
}
