import java.util.Scanner;
import java.util.Random;

public class guessinggame {
  public static void main(String[] args) {
    Random ranNum =  new Random();
    System.out.println("Welcome to the Guessing Game!\n1.Easy Mode\n2.Medium Mode\n3.Hard Mode");
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter a number:");

    int gameMode = myObj.nextInt();  // Read user input
    
switch (gameMode) {
  case 1:
    int easyMin = 1;
    int easyMax = 10;
    int easytargetNumber = ranNum.nextInt(easyMax - easyMin + 1) + easyMin;
    int attempts = 0;
    int guess;
    boolean correctGuess = false;
    System.out.println("Guess the number between " + easyMin + " to " + easyMax);
    while (!correctGuess) {
      System.out.print("Enter your guess: ");
      Scanner scanner = new Scanner(System.in);
      guess = scanner.nextInt();
      attempts++;
      
      if (guess == easytargetNumber) {
          correctGuess = true;
          System.out.println("Congratulations! You've guessed the correct number in " + attempts + " attempts.");
      } else if (guess < easytargetNumber) {
          System.out.println("Too low! Try again.");
      } else {
          System.out.println("Too high! Try again.");
      }
  }
    break;
  case 2:
  int mediumMin = 1;
  int mediumMax = 100;
  int mediumtargetNumber = ranNum.nextInt(mediumMax - mediumMin + 1) + mediumMin;
  int mediumattempts = 0;
  int mediumguess;
  boolean mediumcorrectGuess = false;
  System.out.println("Guess the number between " + mediumMin + " to " + mediumMax);
  while (!mediumcorrectGuess) {
    System.out.print("Enter your guess: ");
    Scanner scanner = new Scanner(System.in);
    mediumguess = scanner.nextInt();
    mediumattempts++;
    
    if (mediumguess == mediumtargetNumber) {
        mediumcorrectGuess = true;
        System.out.println("Congratulations! You've guessed the correct number in " + mediumattempts + " attempts.");
    } else if (mediumguess < mediumtargetNumber) {
        System.out.println("Too low! Try again.");
    } else {
        System.out.println("Too high! Try again.");
    }
}
    break;
  case 3:
    int hardMin = 1;
    int hardMax = 1000;
    int hardtargetNumber = ranNum.nextInt(hardMax - hardMin + 1) + hardMin;
    int hardattempts = 0;
    int hardguess;
    boolean hardcorrectGuess = false;
    System.out.println("Guess the number between " + hardMin + " to " + hardMax);
    while (!hardcorrectGuess) {
      System.out.println("Enter your guess:");
      Scanner scanner = new Scanner(System.in);
      hardguess = scanner.nextInt();
      hardattempts++;

      if (hardguess == hardtargetNumber) {
        hardcorrectGuess = true;
        System.out.println("Congratulations! You've guessed the correct number in " + hardattempts + " attempts. ");
      }
      else if (hardguess < hardtargetNumber){
        System.out.println("Too low! Try again.");
      }
      else {
        System.out.println("Too high! Try again.");
      }
    }
    break;
}
  }}
