import java.util.Random;
import java.util.Scanner;

public class GuessingGame{

    public static int generateRandomNumber(int targetNumber){

        Random random = new Random();

        targetNumber = random.nextInt(1, 100);
            return targetNumber;
    }

    public static String controlOfAttempts(int usersAttempt, int maximumNumberOfAttempts, int usersAnswer){

       generateRandomNumber(targetNumber);    

        usersAttempt = 0;
        maximumNumberOfAttempts = 5;
        usersAnswer = 0;

            while (usersAttempt < maximumNumberOfAttempts){
                return userAttempt;
//                }

                if(usersAnswer < targetNumber){
                    System.out.print("Guess number is low.");
                }
                    if(usersAnswer > targetNumber){
                        System.out.print("Guess number is high.");
                    }

                        if(usersAnswer == targetNumber){
            break;
                        }

            
                else {
                System.out.println("Congratulations! You guessed the correct number.");
                break;
            }
        }
    }

    public static String ValidateUsersInput(int userAnswer){
        controlOfAttempts(usersAttempt, numberOfAttempt);

         Scanner input = new Scanner(System.in);

            if (input.hasNextInt()){
                usersAnswer = scanner.nextInt();
                }
                
                if (usersAnswer < 1 || usersAnswer > 100){
                    System.out.println("Your guess is out of bounds.");
                    continue;
            }
    }
  
   public static displayUsersRating(int usersAttempt){ 

            if (usersAttempt == 1){
                usersRating = "Legendary";
            } 

                else if (usersAttempt == 2){
                usersRating = "Excellent";
                 } 

                else if (usersAttempt <= 4){
                usersRating = "Good";
                } 

            else if (usersAttempt == 5){
                usersRating = "Close!";
                }
//        return usersRating;
        }
      return usersRating;



} 
