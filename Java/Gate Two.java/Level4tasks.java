public class Level4tasks{


    public static int SumOfNumbers(int firstNumber, int secondNumber){
            return firstNumber + secondNumber;
        }

    public static boolean evenNumber(int number){
        if (number % 2 == 0){
            return true;
        }

        return false;

    }

   public static int squareOfNumbers(int number){
        return number * number;

    }

     public static double celsiusToFahrenheit(double celsius){
        return (1.8 * celsius + 32);

    }

//        public static void findPrimeNumber() {
//
//        for (int count = 2; count <= 100; count++) {
//
//            boolean numberIsPrime = true;
//
//            for (int divisor = 2; divisor < count; divisor++) {
//
//                if (count % divisor == 0) {
//                    numberIsPrime = false;
//                 }
//                else if (count % divisor != 0) {
//                    numberIsPrime = true;
//                 }
//            }
//        return numberIsPrime;         
//    }

     public static double simpleInterest(int firstNumber, int secondNumber, int thirdNumber){
        return (firstNumber * secondNumber * thirdNumber)/100;

    }
    

   




























}

//java -jar junit-platform-console-standalone-1.13.4.jar execte --class-path . --select-class TaskOneTest --details=verbose
