import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        final String ROCK = "Rock";
        final String PAPER = "Paper";
        final String SCISSORS = "Scissors";
        System.out.print("Choose [r]ock, [p]aper or [s]cissors: ");
        Scanner in = new Scanner(System.in);
        String playerMove = in.nextLine();

        if(playerMove.equals("r") || playerMove.equals("rock")){
            playerMove="Rock";
        }
        else if(playerMove.equals("p") || playerMove.equals("paper")){
            playerMove="Paper";
        }
       else if(playerMove.equals("s") || playerMove.equals("scissors")){
            playerMove="Scissors";
        }
       else {
            System.out.println("Invalid Input. Try Again...");
           return;
        }

        Random random = new Random();
       int compRandomNum = random.nextInt(4);

       String compMove = "";

       switch (compRandomNum){

           case 1:
               compMove = "Rock";
               break;
           case 2:
               compMove = "Paper";
               break;
           case 3:
               compMove = "Scissors";
               break;
           default:
               System.out.println("Invalid Input from the computer. Try Again...");
               return;

       }

        System.out.printf("The computer choose %s%n",compMove);

       if(playerMove.equals("Rock") && compMove.equals("Scissors") ||
               playerMove.equals("Scissors") && compMove.equals("Paper")||
        playerMove.equals("Paper") && compMove.equals("Rock")){
           System.out.println("You win.");
       }
       else if (playerMove.equals("Scissors") && compMove.equals("Rock") ||
                playerMove.equals("Paper") && compMove.equals("Scissors")||
                playerMove.equals("Rock") && compMove.equals("Paper")){
            System.out.println("You lose.");
        }
       else {
           System.out.println("This game is draw!");
       }
    }
}
