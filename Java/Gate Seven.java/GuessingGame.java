import java.util.Random;
import java.util.Scanner;

public class GuessingGame{

    public static int generateRandomNumber(int targetNumber){

        Random random = new Random();

        targetNumber = random.nextInt(100) + 1;
            return targetNumber;
    }

    public static String controlOfAttempts(int targetNumber){

       generateRandomNumber(targetNumber);    

        int usersAttempt = 0;
        int maximumNumberOfAttempts = 5;
       

            while (usersAttempt < maximumNumberOfAttempts){

                int userAnswer = getValidInput(input);
                userAttempts++;


                if(usersAnswer < targetNumber){
                    System.out.print("Too low.");
                }
                    if(usersAnswer > targetNumber){
                        System.out.print("Too high");
                    }

            
                else {
                System.out.println("corrrect.");
                return userAttempts;
            }
        }
        return userAttempts;
    }

    public static int getValidInput(Scanner input){
        boolean isValid = false;
        int usersAnswer = 0;
    
        while(!isValid){

            System.out.print("Enter your guess: ");

            if (!input.hasNextInt()){
                System.out.println("Invalid input. Enter a number: ");
                input.next();
                continue;
                }
                
            usersAnswer = input.nextInt();


                if(usersAnswer >= 1 && usersAnswer <= 100){
                    isValid = true;
                }
                    if (usersAnswer < 1 && usersAnswer > 100){
                        System.out.println("Your guess is out of bounds.");                      
                     }
        }
        
        return usersAnswer;                    
    }
  
  public static String displayUsersRating(int usersAttempt, boolean hasWon){
    String usersRating; 

        if(!hasWon){
            usersRating = "Better luck next time!";
        }

            else if (usersAttempt == 1){
            usersRating = "Legendary";
            } 

            else if (usersAttempt == 2){
            usersRating = "Excellent";
            } 

            else if (usersAttempt <= 4){
            usersRating = "Good";
            } 

        else(usersAttempt == 5){
        usersRating = "Close!";
        }

            }   
            return usersRating;



} 
