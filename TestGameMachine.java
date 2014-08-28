/*TestGameMachine.java
Simulate the guessing game:
1) Rules:
the coin is tossed but user always bets on faces (1 value of the random generator)
if the generator shows 1 then user wins the bet, otherwise looses
2) The inputs are:
        the amount of money the user is prepared to bet
if they want to continue palying, they will enter either "Y" or "N" 
3) Computations:
        use the random number generator to simulate a random number {1;2}
        compute the dollar amount for winning or losing the game
4) The outputs are:
  the resultiing amount after winning or loosing the bet
*/
import java.util.Scanner;
import java.io.*;

public class TestGameMachine {

public static void main (String [] args) throws IOException {

GameMachine game; //game mathod 
Scanner reader = new Scanner(System.in);
int amount, currentAccount, bank; // bet amount and resulting account value
char tryAgain;      // used to ask if they want to continue playing

tryAgain = 'Y';
game = new GameMachine (); //...

/* here is the program itself */

  while (tryAgain == 'Y'){ //loop; if users enter "Y", game will restart
System.out.print ("How much money would like to bet?: "); //output asking for an input
amount = reader.nextInt(); //input of the amount

game.setBet(amount); //setting bet for the game machine to manage the account
currentAccount=game.getWin(); //method
        System.out.println("You current account has " + currentAccount+" dollars"); //output
        System.out.print("Would you like to bank some of your winnings?");
       
        bank = reader.nextInt();
        currentAccount=game.setBank(bank);
        System.out.println("You saved " + bank + " You have " + currentAccount + " remaining");
System.out.print ("Do you want to continue? (Y/N): "); //output 
tryAgain = (char)System.in.read();
  }




} //closes main
} //closes class