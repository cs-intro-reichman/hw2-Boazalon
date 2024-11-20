// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {

                String input = args[0].toUpperCase();
                
                for(int i = 0 ; i < input.length(); i++)
                {
                        
                        System.out.print("Give me ");

                        char letter = input.charAt(i);

                        if (letter == 'A' || letter == 'E'|| letter == 'F' || letter == 'H' || letter == 'I' || letter == 'L' || letter == 'M' || letter == 'N'|| letter == 'O'|| letter == 'R'|| letter == 'S'|| letter == 'X') {
                        
                           System.out.print("an ");
                        }    

                         else {
                        
                            System.out.print("a  ");
    
                        }

                        System.out.println(letter + ": " + letter + "!");
                  
                
                }

                System.out.println("What does that spell?");

                for(int i =0; i < Integer.parseInt(args[1]); i++)
                {
                        System.out.println(input + "!!!");
                }




        }
}
