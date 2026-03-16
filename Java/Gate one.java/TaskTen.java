import java.util.Scanner;
public class TaskTen{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

            System.out.print("Enter first number: ");
            int firstNumber = input.nextInt();


            System.out.print("Enter second number: ");
            int secondNumber = input.nextInt();
    
            System.out.print("Enter third number: ");
            int thirdNumber = input.nextInt();

            double sumOfNumbers = firstNumber + secondNumber + thirdNumber;
            System.out.println(sumOfNumbers);

            double averageOfNumbers = sumOfNumbers/3;
            System.out.println(averageOfNumbers);
    }
}

