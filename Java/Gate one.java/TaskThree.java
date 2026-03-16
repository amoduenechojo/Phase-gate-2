import java.util.Scanner;
public class TaskThree{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

            System.out.print("Enter first number: ");
            int firstNumber = input.nextInt();


            System.out.print("Enter second number: ");
            int secondNumber = input.nextInt();

    
            int sumOfNumbers = firstNumber + secondNumber;
            System.out.println(sumOfNumbers);

    }
}
