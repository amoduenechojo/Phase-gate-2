import java.util.Scanner;
public class TaskSix{
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

            for(int count = 0; count <=10; count++){
                number += count;
            }

            System.out.println(number);
    }
}
