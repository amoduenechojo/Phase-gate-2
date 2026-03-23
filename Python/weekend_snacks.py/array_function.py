def count_evens(numbers):
    count = 0
    for number in numbers:
        if number % 2 == 0:
            count +=1
    return count

def linear_search(numbers, target):
    for index in range(len(numbers)):
        if numbers[index] == target:
            return index

    return -1

def list_equal(first_element, second_element):

    if len(first_element) != len(second_element):
        return False

    for number in range(len(first_element)):
        if first_element[number] != second_element[number]:
            return False

    return True

def square(number):
    if number < 0:
        return []
    
    result = []
    for value in range(1, number + 1):
        result.append(value * value)
    return result

def remove_duplicate(number):
    result = []

    for value in number: 
        number_is_duplicate = False

        for number in result:
            if value == number:
                number_is_duplicate = True

        if number_is_not_duplicate:
            result.append(value)

    return result
































