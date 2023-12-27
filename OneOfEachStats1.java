/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		//// Put your code here
		int T = Integer.parseInt (args[0]);
		double p = Math.random();
		int numBoys = 0;
		int numGirls = 0;
		int totalChild = 0;
		int twoChild = 0;
		int threeChild = 0;
		int fourplusChild = 0;

		for (int i = 0 ; i < T ; i++){
		while (numBoys == 0 || numGirls == 0){
			if (p > 0.5){
				numGirls++;
			}
			if (p < 0.5){
				numBoys++;
			}
			p = Math.random();
		}
		int child = numBoys + numGirls;
		if (child == 2){
			twoChild++;
		}
		if (child == 3){
			threeChild++;
		}
		if (child > 3) {
			fourplusChild++;
		}

		totalChild = totalChild + child;
		child = 0;
		numBoys = 0;
		numGirls = 0;
		}

		String mostCommon = "";
		if (twoChild >= threeChild && twoChild >= fourplusChild){
			mostCommon = "2.";
		}
		if (threeChild >= twoChild && threeChild >= fourplusChild){
			mostCommon = "3.";
		}
		if (fourplusChild >= twoChild && fourplusChild >= threeChild){
			mostCommon = "4 or more.";
		}

		double eve = (double)totalChild / T ;
		System.out.println ("Avarage : " + eve + " children to get at least one of each gender.");
		System.out.println ("Number of families with 2 children: " + twoChild);
		System.out.println ("Number of families with 3 children: " + threeChild);
		System.out.println ("Number of families with 4 or more children: " + fourplusChild);
		System.out.println ("The most common number of children is " + mostCommon);


	}
}
