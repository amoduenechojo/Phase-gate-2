import java.util.Scanner;
public class TaskSeven{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

            System.out.print("Enter the radius of a given circle: ");
            double radiusOfACircle = input.nextInt();

            radiusOfACircle = 3.14 * radiusOfACircle * radiusOfACircle;
            System.out.println(radiusOfACircle);
    }
}

