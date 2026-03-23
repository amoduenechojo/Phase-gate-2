console.log("Enter your name: ");


 console.log("Welcome " + name);

    console.log("========== Subtraction Game ==========");

      let eneCount = 0;

    for(let count = 0; count < 10; count++){

        let firstNumber = Math.floor(Math.random(1,200);
//        let secondNumber = Math.floor(Math.random(1, 50)

    
        console.log(firstNumber + " - " + secondNumber + " = ");
        console.log("Enter your answer: ");
       
        if(result != (firstNumber - secondNumber)){
        console.log("You have one more attempt.");

        console.log(firstNumber + " - " + secondNumber + " = ");
        result = input.nextInt();
        }

        else if(result == firstNumber - secondNumber){
            console.log(firstNumber - secondNumber);
                eneCount++;
        }       

    console.log("Your total score is " , result "over ten");
    }  



