// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {

		int n =  Integer.parseInt(args[0]);
		String moode = args[1];

		if (moode.equals("v")) {
			for (int i =1; i <= n; i++ ) {
				int j = i;
				int count = 1;
				System.out.print(j);
				do{ 
					if(j%2 == 0){
						j= j/2;
					}
					else{
						j=j*3+1;
					}
					System.out.print(" "+j);
					count++;
				} while(j!=1);
				System.out.println(" ("+ count +")");
			}
		System.out.println("Every one of the first "+ n +" hailstone sequences reached 1."); 
		}
		if (moode.equals("c")) {
			for (int i =1; i <= n; i++ ) {
				int j = i;
				do{ 
					if(j%2 == 0){
						j= j/2;
					}
					else{
						j=j*3+1;
					}
				} while(j!=1);
			}
		System.out.println("Every one of the first "+ n +" hailstone sequences reached 1."); 

		}
	}



		
	
}
