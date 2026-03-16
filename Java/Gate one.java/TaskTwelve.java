import java.util.Scanner;
public class TaskTwelve{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

          System.out.print("Enter your score: ");
           int studentsScore = input.nextInt();

                if(studentsScore <= 50){
                    System.out.println("You failed");
                } 

                    else{
                        System.out.println("You passed");
                    }
    }
}


