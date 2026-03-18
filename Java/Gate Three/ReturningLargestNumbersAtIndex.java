public class ReturningLargestNumbersAtIndex{

  
    public static int [][] findingLargestNumbersAtIndex(int [][] numbers){

            for (int index = 0; index < numbers.length; index++){
			    int largest = numbers[index];

			    for (int inIndex = index; inIndex < numbers.length; inIndex++){
				    if (numbers[inIndex] > largest){
					    largest = numbers[inIndex];
					    numbers[inIndex] = numbers[index];
					    numbers[index] = largest;
				    }
			    }

            
		    }

		    return numbers;
	    }























}
