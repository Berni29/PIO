
package kostka;

import java.util.Random;

public class DiceGame1 {

    public static void main(String[] args) {
        Random dice = new Random();
        Player player = new Player("Ziutek");
        int number, guess;                      
        
        do {
            number = dice.nextInt(6) + 1;
            System.out.println("Wylosowane: " + number);

            guess = player.guess();
            System.out.println("Strzela " + player.getName() + ": " + guess);

            if (number == guess) {
                System.out.println("BRAWO!");
            } else {
                System.out.println("PUDŁO!");
            }
            
            System.out.println("---------------------------------------------");
        
        } while (number != guess);
    }
    
}
