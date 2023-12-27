/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		//// Write your code here
		int number = (int) (Math.random() * 10);
		int oldNumber = number;
		System.out.println (number);
		number = (int) (Math.random() * 10);
		while (number >= oldNumber) {
			System.out.println (number);
			oldNumber = number;
			number = (int) (Math.random() * 10);
		}

	}
}
