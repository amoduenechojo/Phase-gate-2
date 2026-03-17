import java.util.Scanner;
public class TaskFour{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = input.nextInt();

            int timesTable = 0;
            int result = 0;

                for(int count = 0; count <=12; count++){

                    timesTable = number * count;
                    System.out.printf("\t%d X %d = %d\t" , number, count, timesTable);
                }
    }
}
            
