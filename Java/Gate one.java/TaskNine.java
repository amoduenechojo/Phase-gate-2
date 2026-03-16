import java.util.Scanner;
public class TaskNine{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

            System.out.print("Enter the price of the item bought: ");
            double itemBought = input.nextInt();


            double taxOfItemBought = itemBought * 0.1;
            System.out.println(taxOfItemBought);
    }
}
