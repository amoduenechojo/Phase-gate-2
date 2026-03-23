function let evenCount = 0;

    for(let count = 0; count < numbers.length; count++)
        if (numbers[count] % 2 == 0){
            evenCount++;
   
//    int [] evens = new int[evenCount];

    int index = 0;   

    for(let number : numbers)
        if(number % 2 == 0)
            evens[index] = number;
                index++;

    return evens;

