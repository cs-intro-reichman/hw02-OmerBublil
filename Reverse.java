/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		//// Put your code here
		String word = args[0];
		int l = word.length() ;
		int i = l - 1;
		int middle = 0;
		while (i >= 0){
			System.out.print(word.charAt(i));
			i--;
		}
		if (l % 2 == 0){
			middle = l / 2 - 1;
		}
		else {
			middle = (l / 2);
		}
		System.out.println("");
		System.out.println ("The middle character is " + word.charAt(middle));
	}
}
