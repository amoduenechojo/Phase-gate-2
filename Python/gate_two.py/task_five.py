factorial_number = int(input("Enter a number: "))

count = 2
for number in range(1, factorial_number):
    factorial_number = factorial_number * count
print(factorial_number)
