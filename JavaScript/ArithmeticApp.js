let name = prompt("Enter your name:");
console.log("Welcome " + name);

console.log("========== Subtraction Game ==========");

let score = 0;

for (let count = 0; count < 10; count++) {

    let firstNumber = Math.floor(Math.random() * 70) + 50; 
    let secondNumber = Math.floor(Math.random() * 50) + 1; 

    let correctAnswer = firstNumber - secondNumber;

    let result = Number(prompt(firstNumber + " - " + secondNumber + " = "));

    if (result !== correctAnswer) {
        result = Number(prompt("Wrong! Try again:"));

        if (result === correctAnswer) {
            console.log("Correct!");
            score++;
        } else {
            console.log("Wrong again. Answer is: " + correctAnswer);
        }
    } else {
        console.log("Correct!");
        score++;
    }
}

console.log("Your total score is " + score + " over 10");
