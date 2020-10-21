import java.util.Scanner;

class Q7 {
    
    public static void main (String[] args) {
        Scanner sc  = new Scanner(System.in);
        int numdice = 0;     
        int side   = 0;   
        int diceroll = 0; 
        int total   = 0; 
        
        
            System.out.print("How many sides? ");
            side = sc.nextInt();      
            System.out.print("How many dice? ");
            numdice = sc.nextInt();
            
        
            System.out.println("");
            System.out.print("You rolled: ");
            
            total = 0;
            for (int i = 0; i < numdice; i++) {
                diceroll = rollDie(side);
                total = total + diceroll;
                System.out.print(diceroll + " ");
            }
            
            System.out.println("");
            System.out.println("Total: " + total);
            System.out.println("");
            
                    
        
    }
    
    public static int rollDie(int i) {
        return (int) (Math.random()*i)+1;
    }
}