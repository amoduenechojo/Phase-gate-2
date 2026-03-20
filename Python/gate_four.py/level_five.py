def moving_zeroes_to_te_end_of_the_array(numbers):
    numbers_that_are_not_zero = 0

    for index in range(len(numbers)):
        if numbers[index] != 0:
            numbers[numbers_that_are_not_zero] = numbers[index]
            numbers_that_are_not_zero += 1

    for ene in range(numbers_that_are_not_zero,len(numbers)):
        numbers[ene] = 0
    return numbers

nums = [0, 1, 2, 9, 0, 7]
new_moved_number = moving_zeroes_to_te_end_of_the_array(nums)
print(new_moved_number)



def negative_index_are_replaced_with_zero(numbers):

    for index in range(len(numbers)):
        if numbers[index] < 0:
            numbers[index] = 0

    return numbers

nums = [0, 1, 2, -9, -8, 12]
new_replaced_number = negative_index_are_replaced_with_zero(nums)
print(new_replaced_number)
    



def removing_duplicated_number(numbers):
    ene = 0
    new_list = []

    for count in range(len(numbers)):
        number_is_duplicate = False
        for index in range(len(new_list)):
            if numbers[count] == numbers[index]:
                number_is_duplicate = True

            if not number_is_duplicate:
                new_list.append(numbers[coun])
                    
    return new_list;

nums = [11, 11, 23, 45, 5, 6, 45]
replaced_number = removing_duplicated_number(nums)
print(replaced_number)







