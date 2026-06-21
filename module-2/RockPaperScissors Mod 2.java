// Frederick Costello
// CSD-402 Mod 2.2
// 21 June 2026
// Resources: Engineering Toolbox, OpenStax, Microsoft Word, Copilot

// Assignment Formula: 
// Q (Joules) = (Final temp - Initial Temp) X 4184
// Using user input and Scanner object
// Creates random object (rand.) to generate random numbers


import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
       String playAgain; 
       do { 
        int computer = rand.nextInt(3) + 1; // 1-3
        System.out.println("Enter 1 for Rock, 2 for Paper, or 3 for Scissors:");
        int user = input.nextInt();
        String compChoice = (computer ==1) ? "Rock":
                            (computer ==2) ? "Paper" : "Scissors";
        String userChoice = (user ==1) ? "Rock" :
                            (user ==2) ? "Paper" : "Scissors";
        System.out.println("Computer chose: " + compChoice);
        System.out.println("You chose: " + userChoice);
        
      if (computer == user) {
          System.out.println("Result: It's a Tie!!!");
      }else if ((user == 1 && computer == 3) ||
                (user == 2 && computer == 1) ||
                (user == 3 && computer == 2)) {
        System.out.println("Result: You win!!!");
      } else {
        System.out.println("Result: Computer wins!");
      }
      System.out.print("Play again? (Y/N): ");
      playAgain = input.next();
     } while (playAgain.equalsIgnoreCase("Y"));
       System.out.println("Thanks for playing!");
    }
}