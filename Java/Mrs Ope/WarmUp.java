public class WarmUp{

    public static int [] removingDuplicateNumbers(int [] numbers){

        int [] oldArray = {9, 2, 3, 2, 1};
        int [] newArray = new int [numbers.length];

            for(int index = 0; index < numbers.length; index++){
                for(int count = 0; count < index; count++){
                    if(numbers[index] == oldArray){
                        return newArray;
                    }
                }
                return newArray;
            }
//    return numbers;
    }



}
















