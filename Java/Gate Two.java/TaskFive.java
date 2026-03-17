import java.util.Scanner;
public class TaskFive{
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);


//        int number = 5;
        int factorial = 1;

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        for (int count = 1; count <= number; count++){
            factorial = factorial * count;
        }

        System.out.println(factorial);
    }
}


