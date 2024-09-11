/**
 * 
 */
package slideDeckChalenges;

/**
 * 
 */
public class Reader extends Employee {

	// Instance variables

	private String research;

	/**
	 * 
	 */
	public Reader() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param research
	 */
	public Reader(String firstName, String lastName, String research) {
		super(firstName, lastName);
		this.setResearch(research);
		// TODO Auto-generated constructor stub
	}

	// Getters and setters

	/**
	 * @return the research
	 */
	public String getResearch() {
		return research;
	}

	/**
	 * @param research the research to set
	 */
	public void setResearch(String research) {
		this.research = research;
	}

	// toString method

	@Override
	public String toString() {
		return "Reader [research=" + research + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + "]";
	}

	@Override
	public void calculateSalary(double hours, double base) {
		System.out.println("Salary for reader\t: " +(base * hours * 4));
		
	}

}
