/**
 * 
 */
package slideDeckChalenges;

/**
 * 
 */
public abstract class Employee {

	// Instance variables

	private String firstName;
	private String lastName;

	// Constructors

	/**
	 * Default constructor
	 */
	Employee() {

	}

	/**
	 * Constructor with args
	 * 
	 * @param firstName
	 * @param lastName
	 */
	public Employee(String firstName, String lastName) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}

	// Getters and setters

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// toString Method

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	// Methods

	public abstract void calculateSalary(double hours, double base);

}
