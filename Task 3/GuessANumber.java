
import java.util.Random;
import java.util.Scanner;  

public class GuessANumber {
    private static int rnd_number;
	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
	System.out.println( "Can you guess what it is?...");
        makeAGuess();
    }

    private static void makeAGuess(){
	// Create a Scanner object   
        Scanner scanner = new Scanner(System.in);	

     // use hasNextDouble to check if input is numeric, 
    if (scanner.hasNextDouble()){
     
     // if so...Read user input
    double guess = scanner.nextInt();

    // Compare it with the random number
    // Let the user know the result of the comparison
    if (guess == rnd_number){
        System.out.print("Correct! You guessed the number. Try again!");

    // Let the user try again by calling this method recursively
        makeAGuess();
    }
    // Help the user by revealing wether the guess was lower or higher than the target number
    else if (guess > rnd_number){
    System.out.print(guess + " Too high! Try again! ");
        makeAGuess();
    }
    else if (guess < rnd_number){
    System.out.print( " Too low! Try again! ");
        makeAGuess();
    }

    }
 // if input was not numeric show an error message and call this method recursively
    else{

        System.out.print("Error: Input is not numeric. Try again!");
        makeAGuess();
    }
    
        
    }
}
