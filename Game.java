import java.util.*;
import java.util.Random;
import java.util.InputMismatchException;
/*

A number-guessing game.

*/

public class Game {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Howdy, what's your name?"); // Asking user name
    
    String name = input.nextLine(); //Getting user input
    System.out.println(name + ", I'm thinking of a number between 1 and 100."); 
    
    //Getting random number
    Random rand = new Random();

    int number = rand.nextInt(100);
    
    //starting the counter at 0
    int attempts = 0 ;
    while(true) { //getting user's guess

      try {
        System.out.println("Try to guess my number."); 
       
      } catch(InputMismatchException e) {
          String bad_input = input.next();   
          System.out.println("That's not an integer, try again");
          continue;
      }

      int guess = input.nextInt(); //converting string input into an integer

      if (guess < 1 || guess > 100) {  //confirming input is not a negative number
          System.out.println("Your guess " + guess + " is invalid, try again.");
          continue; //continues through loop after validation
      } 
          
      attempts = attempts + 1;    //counter
      if (guess < number) { //determines whether guess is lower than number
         System.out.println("Your guess is too low, try again");
            //i += 1; //counter
      } else if (guess > number) { //determines if guess is higher than number
          System.out.println("Your guess is too high, try again");
      } else {  //lets user know there guess is correct and in how many tries
          System.out.println("Congratulations " + name +", you guessed my number in " + attempts + " tries!"); 
          break; //breaks from loop
      }  

    }
    
  }    

}
