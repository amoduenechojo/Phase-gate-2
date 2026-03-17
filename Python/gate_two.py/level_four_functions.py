def sum_of_two_numbers(first_number, second_number):

    total = first_number + second_number;
    return total

def even_numbers(number):
    if number % 2 == 0:
        return 1
    else: 
        return 0

def square_of_numbers(number):
    total = number * number
    return total

def celsius_to_fahrenheit(celsius):
    celsius = (celsius * 9/5) + 32
    return celsius

def number_is_prime(number):
    if number % 2 != 0:
        return 2
    else:
        return 1

def largest_of_three_numbers(first_number, second_number, third_number):
    if first_number > second_number:
        largest_number = first_number

        if second_number > first_number:
            largest_number = second_number

    else third_number > second_number:
        largest_number = third_number

        return largest_number

def calculation_of_simple_interest(first_number, second_number, third_number):
    simple_interest = first_number * second_number * third_number/100

    return simple_interest

#def multiplication_table(multiplier, number):
#    number = 5
#    multiplier
#    return multiplication_table = {multiplier} * {number} = {multipler * number}

def area_of_rectangle(first_number, second_number):
    area_of_rectangle = 0
    area_of_rectangle = first_number * second_number
    return area_of_rectangle
