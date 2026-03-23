public class ArrayFunction{

    public static int [] countEvens(int [] numbers){
        int evenCount = 0;

        for(int count = 0; count < numbers.length; count++){
            if (numbers[count] % 2 == 0){
                evenCount++;
            }
        }

        int [] evens = new int[evenCount];

        int index = 0;   

        for(int number : numbers){
            if(number % 2 == 0){
                evens[index] = number;
                    index++;
            }
        }
        return evens;

    }

    public static int linearSearch(int [] numbers, int target){

        for(int count = 0; count < numbers.length; count++){
            if(numbers[count] == target){
                return count;
            }
        }
        return -1;
    }

    public static boolean arrayEqual(int [] firstElement, int [] secondElement){

        if(firstElement.length != secondElement.length){
            return false;
        }

        for(int count = 0; count < firstElement.length; count++){
            if(firstElement[count] != secondElement[count]){
                return false;
            }
        }

        return true;
    }


    public static int[] squares(int[] numbers){
        for(int count = 0; count < numbers.length; count++){
            for(int eneCount = 1; eneCount * eneCount <= count; eneCount++){
                if(eneCount * eneCount == count){
                    return new int []{count * count};
                }
            }

        }
        
        return new int[]{};
    }
}




































