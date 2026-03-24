//I'll have to import random and create an object for random numbers.
//I will need to collect input from the user to know their names.
//Use my print out statement to get their names from the terminal since I will not be using a return statement.
//I will make use of a for loop to generate 10 questions for different users.
//Under the loop I'll make use of two numbers(14 - 5);
//When I collect input using random I'll pass in a parameter into it. 
//Let's make the first parameter passed biiger than the second number parameter that I will pass into it.
//
//But first handle edge cases(no negative numbers)
//I will make use of my if statement to handle my edge case. 
//No negative numbers
//
//
//And my else statement to repeat the number if the user gets it wrong.
//Make use of an increment to make the numbers work over and over again.

import java.util.Random;
import java.util.Scanner;
public class SImpleArithmeticApp{
    public static void main(String [] args){

    Scanner input = new Scanner(System.in);
    Random random = new Random();
    
    System.out.print("Enter your name: ");
    String name = input.nextLine();

    
    System.out.println("Welcome " + name);

    System.out.println("========== Subtraction Game ==========");

      int eneCount = 0;

    for(int count = 0; count < 10; count++){

        int firstNumber = random.nextInt(50 , 119);
        int secondNumber = random.nextInt(1, 50);

    
        System.out.println(firstNumber + " - " + secondNumber + " = ");
        System.out.print("Enter your answer: ");
        int result = input.nextInt();

        if(result != (firstNumber - secondNumber)){
        System.out.println("You have one more attempt.");

        System.out.println(firstNumber + " - " + secondNumber + " = ");
        result = input.nextInt();
        }

        else if(result == firstNumber - secondNumber){
            System.out.println(firstNumber - secondNumber);
                eneCount++;
        }       

    }  

























    }
} 
