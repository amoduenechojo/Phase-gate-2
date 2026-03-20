public class LevelFive{


        public static int numberIsPrime(int number) {

          if (number < 2) {
                return 0;
            }

            for (int divisor = 2; divisor < number; divisor++) {
                if (number % divisor == 0) {
                    return 0;
                }
            }

            return number;
        }
//    }

    public static int[] numberIsPrime(int[] numbers) {

        int count = 0;

        for (int index = 0; index < numbers.length; index++) {
            if (numberIsPrime(numbers[index]) != 0) {
                count++;
            }
        }

        int[] primeNumbers = new int[count];
        int index = 0;

        for (int value = 0; value < numbers.length; value++) {
            if (numberIsPrime(numbers[value]) != 0) {
                primeNumbers[index] = numbers[value];
                index++;
            }
        }

        return primeNumbers;
    }


        public static int[] descendingNumberSorting(int[] scores) {

            for (int index = 0; index < scores.length; index++) {

                int largest = scores[index];

                for (int inIndex = index; inIndex < scores.length; inIndex++) {

                    if (scores[inIndex] > largest) {
                        largest = scores[inIndex];
                        scores[inIndex] = scores[index];
                        scores[index] = largest;
                    }
                }
            }

            return scores;
        }

        public static int[] sortedArraysOfPrimeNumbers(int[] numbers) {

            int count = 0;

            for (int index = 0; index < numbers.length; index++) {
                if (numberIsPrime(numbers[index]) != 0) {
                    count++;
                }
            }

            int[] primeNumbers = new int[count];
            int index = 0;

            for (int value = 0; value < numbers.length; value++) {
                if (numberIsPrime(numbers[value]) != 0) {
                    primeNumbers[index] = numbers[value];
                    index++;
                }
            }

            return primeNumbers;
        }



    public static int [] fillingNegativeIndexesWithZero(int [] numbers){

        for(int index = 0; index < numbers.length; index++){
            if(numbers[index] < 0){
                numbers[index] = 0;
            }
        }
           return numbers;
    }


    public static int [] movingZeroesToTheEndOfTheArray(int [] numbers){

    int numbersThatAreNotZero = 0;

        for(int index = 0; index < numbers.length; index++){
            if(numbers[index] != 0){
                numbers[numbersThatAreNotZero] = numbers[index];
                    numbersThatAreNotZero++;
            }
        }

            for(int count = numbersThatAreNotZero; count < numbers.length; count++){
                numbers[count] = 0;
             }
            return numbers;
        }
       

  public static int[] returningTheCommonAndDuplicateNumbersInAnArray(int[] numbers) {

    int[] newArray = new int[numbers.length];
    int ene = 0;

    for (int count = 0; count < numbers.length; count++) {

        for (int index = count + 1; index < numbers.length; index++) {

            if (numbers[count] == numbers[index]) {

                newArray[ene] = numbers[count];
                ene++;
            }
        }
    }

        int[] result = new int[ene];

        for (int count = 0; count < ene; count++) {
            result[count] = newArray[count];
        }

        return result;
        }   
}
