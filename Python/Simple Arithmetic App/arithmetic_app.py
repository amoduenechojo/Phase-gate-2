import random

name = input(("Enter your name: "))
print(name)
print("Welcome " + name)
print("========== Subtraction Game ==========")

eneCount = 0
result = 0
attempt = 0

for number in range(1, 11):
   
        first_number = random.randint(50 , 119)
        second_number = random.randint(1, 50)

        print(first_number , " - " , second_number , " = ")
        result = input(("Enter your answer: "))

#    while (attempt < 3):         
        if first_number - second_number is not result:
            result = input("Re enter your answer, you have one more attempt: ")
            print(first_number - second_number)

        else:
            result == first_number - second_number
            print(first_number - second_number)
               eneCount++
