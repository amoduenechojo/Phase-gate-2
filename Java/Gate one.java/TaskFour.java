import java.util.Scanner;
public class TaskFour{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

            System.out.print("Enter first number: ");
            int firstNumber = input.nextInt();


            System.out.print("Enter second number: ");
            int secondNumber = input.nextInt();

    
            int productOfNumbers = firstNumber * secondNumber;
            System.out.println(productOfNumbers);

    }
}
