/**
 * 
 */
package slideDeckChalenges;

/**
 * 
 */
public class StaffRoom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lecturer lect1 = new Lecturer("Aidan", "McG", "EEECS");
		lect1.calculateSalary(10, 40);

		Employee emp1 = new Lecturer("Albert", "Einstein", "Science");
		emp1.calculateSalary(10, 40);
		
		Reader r = new Reader("John", "Henry", "String Theory");
		r.calculateSalary(10, 40);
	}

}
