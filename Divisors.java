/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		//// Put your code here
		int num = Integer.parseInt (args[0]);
		int i = 1;
		while (i <= num){
			if (num % i == 0){
			System.out.println (i);
		}
			i++; // #feedback - please note the indentation here.

					}
	}
}
