import java.util.Scanner;
public class TaskSixteen{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        
           System.out.print("Enter first number: ");
           int firstNumber = input.nextInt();

           System.out.print("Enter second number: ");
           int secondNumber = input.nextInt();

           System.out.print("Enter third number: ");
           int thirdNumber = input.nextInt();

            if(firstNumber > secondNumber){
                int largestNumber = firstNumber;
                    System.out.println("The largest numer is: " + largestNumber);
            }

            else if(secondNumber > firstNumber){
                int largestNumber = secondNumber;
                    System.out.println("The largest number is: " + largestNumber);
             }

        
            else if(thirdNumber > secondNumber){
                int largestNumber = thirdNumber;
                    System.out.println("The largest number is: " + largestNumber);
            }


            else{
                System.out.println("Null.");
            }

//
//            else if(secondNumber > firstNumber){
//                int largestNumber = secondNumber;
//                    System.out.println("The largest number is: " + largestNumber);
//                }
//
//            else if(thirdNumber > secondNumber){
//                int largestNumber = t}
//

   } 
}           

