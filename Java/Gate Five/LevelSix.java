public class LevelSix{

        public static int  splitEvenAndOddNumber(int  numbers){

//        int spaceForEven = 0;
//        int spaceForOdd = numbers.length-1;
//
//        int [] result = new int[numbers.length];
//
//        for(int count = 0; count < numbers.length; count++){
//            
//            if(numbers[count] % 2 == 0){
//                result[spaceForEven] = numbers[count];
//                    spaceForEven++;
//            }
//        
//            else{
//                result[spaceForOdd] = numbers[count];
//                    spaceForOdd--;
//                }
//        }
//        return result;
//       }

        int NumbrOfEvenNumber = 0;
        int NumbrOfOddNumber = 0;
        for (int count = 0; count < numbers.length; count++){
            if (numbers[count] % 2 == 0) {
                NumbrOfEvenNumber++;
            } 
            
            else {
                NumbrOfOddNumber++;
            }
        }


        int[] evenNumber = new int[NumbrOfEvenNumber];
        int[] oddNumber = new int[NumbrOfOddNumber];


        int evenIndex = 0;
        int oddIndex = 0;

        for (int index = 0; index < numbers.length; index++){
            if (numbers[index] % 2 == 0){
                evenNumber[evenIndex] = numbers[index];
                evenIndex++;
            } 

            else {
                oddNumber[oddIndex] = numbers[index];
                oddIndex++;
            }
        }


        int[] result = new int[numbers.length];
        int index = 0;


        for (int count = 0; count < evenNumber.length; count++){
            result[index] = evenNumber[count];
            index++;
        }


        for (int count = 0; count < oddNumber.length; count++){
            result[index] = oddNumber[count];
            index++;
        }

        return result;
        }

    }





    public static String checkForPalindrome(number.length){
        
        int orignalNumber = number.length;
        int temp = originalNumber;
        

        while(number.length > 0){

            int digit = temp % 10;
            int reversedNumber = (temp * 100) + 10;

            int reversedNumber /= 10; 

                if(orignalNumber == digit){
                    reversedNumber == digit;
                return ("Number is Palindrome");                }

    }
        
    }






















