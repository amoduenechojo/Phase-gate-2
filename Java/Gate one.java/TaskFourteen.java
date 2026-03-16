import java.util.Scanner;
public class TaskFourteen{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        
           System.out.print("Enter first number: ");
           int firstNumber = input.nextInt();

           System.out.print("Enter second number: ");
           int secondNumber = input.nextInt();

            if(firstNumber > secondNumber){
                int largestNumber = firstNumber;
                    System.out.println("The largest numer is: " + largestNumber);
            }
            
            else if(secondNumber > firstNumber){
                int largestNumber = secondNumber;
                    System.out.println("The largest numer is: " + largestNumber);
             }
    }
}
