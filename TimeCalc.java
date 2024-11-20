public class TimeCalc {
    public static void main(String[] args) {

        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));

		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        
		int moreminutes = Integer.parseInt(args[1]);
		

        int Totalminutes = ( hours * 60) + minutes + moreminutes;

        int Totalhours = Totalminutes / 60;
        
        int Newhours = Totalhours % 24; 
        
        int Newminutes = Totalminutes - (Totalhours * 60);

        
        if (Newhours<10) {
            System.out.print("0" + Newhours );
            
        }
        else {
            System.out.print( Newhours );
        }
        if (Newminutes<10) {
            System.out.print( ":0" + Newminutes );
            
        }
        else {
            System.out.print(":" + Newminutes );
        }

        

    }
}
