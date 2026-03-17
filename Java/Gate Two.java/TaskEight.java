import java.util.Scanner;
public class TaskEight{
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

        int total = 0;

        for(int count = 0; count <= 10; count++){
            System.out.print("Enter a number: ");
                int number = input.nextInt();

                    if(count != 0){
                        total += count;
                    }
                        else if(count == 0){
                            break;
                    }

                }
    }
}

