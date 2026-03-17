import java.util.Scanner;
public class TaskSeven{
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

        for(int count = 0; count <=5; count++){
            System.out.print("Enter a number: ");
            int number = input.nextInt();

                number += count;
        }
             System.out.println(number);
    }
}

