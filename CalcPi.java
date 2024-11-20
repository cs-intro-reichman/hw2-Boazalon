// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		double approximated = 1;
		double denominator = 3;

		for (int i = 1 ; i < Integer.parseInt(args[0]); i++ ){

			if (i%2 != 0) {

				approximated = approximated - (1/denominator) ;
				
			}
			else {
				approximated = approximated + (1/denominator) ;
			}
			denominator = denominator + 2;
		}


		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + 4 * approximated);
	}
}
