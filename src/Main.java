import java.util.Scanner; //importing Scanner
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //naming Scanner
        String Player1 = ""; //defining Player1
        String Player2 = ""; //defining Player2
        String Playing = "Y"; //loop for if player is playing
        do {
            System.out.println("Player 1: Choose Rock (R), Paper(P) or Scissors (S)"); //asking player1 for their answer
            Player1 = in.nextLine(); //setting player1 variable
            System.out.println("Player 2: Choose Rock (R), Paper(P) or Scissors (S)"); //asking player2 for their answer
            Player2 = in.nextLine(); //setting player2 variable
            if (Player1.equals(Player2)) { //player tie
                System.out.println("It’s a tie! Play again? (Y or N)"); //showing players tie
                Playing = in.nextLine(); //seeing if user wants to play again
            }
            else if (Player1.equals("R") && Player2.equals("P")) {
                System.out.println("Paper covers rock. Player 2 wins! Play again ? (Y or N)");
                Playing = in.nextLine(); //seeing if user wants to play again
            }
			else if (Player1.equals("P") && Player2.equals("R")) {
                System.out.println("Paper covers rock. Player 1 wins! Play again ? (Y or N)");
                Playing = in.nextLine(); //seeing if user wants to play again
            }
			else if (Player1.equals("R") && Player2.equals("S")) {
                System.out.println("Rock breaks scissors. Player 1 wins! Play again ? (Y or N)");
                Playing = in.nextLine(); //seeing if user wants to play again
            }
			else if (Player1.equals("S") && Player2.equals("R")) {
                System.out.println("Rock breaks scissors. Player 2 wins! Play again ? (Y or N)");
                Playing = in.nextLine(); //seeing if user wants to play again
            }
            else if (Player1.equals("S")  && Player2.equals("P")) {
                System.out.println("Scissors cuts paper. Player 1 wins! Play again ? (Y or N)");
                Playing = in.nextLine(); //seeing if user wants to play again
            }
			else if (Player1.equals("P") && Player2.equals("S")) {
                System.out.println("Scissors cuts paper. Player 2 wins! Play again ? (Y or N)");
                Playing = in.nextLine(); //seeing if user wants to play again
            }
        }
        while (Playing.equals("Y")); //loops while player chooses 'Y'
        System.out.println("Thanks for playing!");

    }
}
