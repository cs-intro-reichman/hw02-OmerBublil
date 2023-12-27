/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		//// Put your code here
		int N = Integer.parseInt(args [0]);
		String end = N + " is a perfect number since " + N + " = 1";
		int sum = 1;
		for (int i = 2 ; i < N ; i++){
			if (N % i == 0){
				end = end + (" + " + i);
				sum = sum + i;
			}
		}
		if (sum == N){
			System.out.println (end);
		}
		else {
			System.out.println (N + " is not a perfect number");
		}
	}
}
