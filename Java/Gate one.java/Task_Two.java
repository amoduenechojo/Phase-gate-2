import java.util.Scanner;
public class TaskTwo{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

            System.out.print("Enter your age: ");
            int userAge = input.nextLine();


            userAge = userAge * 5;
            System.out.println(userAge);

    }
}
