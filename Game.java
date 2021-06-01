import java.util.*;
/*

A number-guessing game.

*/

public class Game {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Howdy, what's your name?");
    
    String name = input.nextLine();
    System.out.println(name + " ,I'm thinking of a number between 1 and 100.");
    
    System.out.println("Try to guess my number");
  
  }

}
