import random

name = input("Enter your name: ")
print("Welcome " + name)
print("========== Subtraction Game ==========")

score = 0

for number in range(1, 11):

    first_number = random.randint(50, 119)
    second_number = random.randint(1, 50)

    correct_answer = first_number - second_number

    print(first_number, "-", second_number, "=")
    
    result = int(input("Enter your answer: "))

    if result != correct_answer:
        result = int(input("Wrong! You have one more attempt: "))
        
        if result == correct_answer:
            print("Correct!")
            score += 1
  
print("Your final score is:", score)
