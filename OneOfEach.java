
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		//// Put your code here
		double p = Math.random();
		int numBoys = 0;
		int numGirls = 0;
		while (numBoys == 0 || numGirls == 0){
			if (p > 0.5){
				System.out.print ("g ");
				numGirls++;
			}
			if (p < 0.5){
				System.out.print ("b ");
				numBoys++;
			}
			p = Math.random();
		}
		int child = numBoys + numGirls;
		System.out.println ("");
		System.out.println ("You made it... and you now have " + child + " children.");
	}
}
