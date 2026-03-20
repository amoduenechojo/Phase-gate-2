def replacing_negative_numbers_with_zero(numbers):
    index = 0
    for number in numbers:
        if number < 0:
            numbers[index] =0
        index +=1

    return numbers



def sorting_list_of_prime_number(numbers):
    new_list_of_prime_numbers = []

    index = 0

    for number in numbers:
        for divisor in range(2, number):
            if number % divisor ==0:
                index +=1
        if index == 0:
            new_list_of_prime_numbers.append(number)
        index = 0

    return new_list_of_prime_numbers
