import java.util.Scanner;
import java.util.Random;

public class GameMachine {

Random generator = new Random();
Scanner reader = new Scanner(System.in);
private int account, randomNum, guessNumber, dollar, bank, saved; //varibales 

public GameMachine (){
randomNum = 0;
guessNumber = 1; // always the same user's guess of 1 (faces)	
dollar = 0;
        account=100; // initial amount on the account
        bank = 0;
}

public void setBet (int amount){ //mathod
dollar = amount;
while (dollar > account){
System.out.println("You don't have enough money for that bet!");
System.out.print("Please enter your bet: ");
dollar = reader.nextInt();
}
}

public int setBank (int bank){
    saved = bank;
    account = account- saved;
    return account; 
}

public int getWin (){ //method
randomNum = generator.nextInt (2) + 1; // ganarates a random number from 1-100
     
if (guessNumber == randomNum)
account = account+dollar;
else 
account = account-dollar;


return account;

}



}

