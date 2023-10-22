package codsoft;

import java.util.Random;
import java.util.Scanner;

public class Random_Numbers
{
	 int minRange;
     int maxRange;
     int maxAttempts;
     int score;

    public Random_Numbers(int minRange, int maxRange, int maxAttempts) {
        this.minRange = minRange;
        this.maxRange = maxRange;
        this.maxAttempts = maxAttempts;
        
    }

    public void playRound() {
        Random random = new Random();
        int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        int attempts = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Guess a number between " + minRange + " and " + maxRange + ".");

        while (attempts < maxAttempts)
        {
            System.out.print("Enter your guess: ");
            int userGuess = s.nextInt();
            attempts++;

            if (userGuess == targetNumber) 
            {
                System.out.println("Congratulations! You guessed the correct number " + targetNumber + " in " + attempts + " attempts.");
                score++;
                break;
            } 
            else if (userGuess < targetNumber) 
            {
                System.out.println("Too low. Try again.");
            }
            else 
            {
                System.out.println("Too high. Try again.");
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + targetNumber + ".");
            this.score=attempts;
        }
    }

    public void startGame() {
        Scanner s = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            playRound();
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = s.next().toLowerCase();
            playAgain = playAgainInput.equals("yes");
        }

        System.out.println("Your total score is " + score + ".");
    }


	public static void main(String[] args) {

		int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 5;
        
        Random_Numbers game = new Random_Numbers(minRange, maxRange, maxAttempts);
        game.startGame();
		
	}

}
