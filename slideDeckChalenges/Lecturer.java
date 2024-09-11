/**
 * 
 */
package slideDeckChalenges;

/**
 * 
 */
public class Lecturer extends Employee {
	
	// Instance Variables
	
	private String school;

	/**
	 *  This is the default constructor
	 */
	public Lecturer() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * This is the constructor with args
	 * @param firstName
	 * @param lastName
	 * @param school
	 */
	public Lecturer(String firstName, String lastName, String school) {
		super(firstName, lastName);
		this.setSchool(school);
		
		// TODO Auto-generated constructor stub
	}

	// Getters and setters
	
	/**
	 * @return the school
	 */
	public String getSchool() {
		return school;
	}

	/**
	 * @param school the school to set
	 */
	public void setSchool(String school) {
		this.school = school;
	}

	// to String method
	
	@Override
	public String toString() {
		return "Lecturer [school=" + school + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ "]";
	}
	
	public void calculateSalary(double hours, double base){
		System.out.println("Salary for lecturer\t: " + (base * hours * 2));
	}
	
	

	
	
}
