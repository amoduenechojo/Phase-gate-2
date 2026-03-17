from unittest import TestCase
import level_four_functions

class LevelFourFunctions(TestCase):

    def test_for_the_sum_of_two_numbers(self):

        result = level_four_functions.sum_of_two_numbers(12, 45)

        self.assertEqual(result, 57)

    def test_that_sum_of_number_is_not_negative(self):
        result = level_four_functions.sum_of_two_numbers(-23, -34)

        self.assertTrue(result,8)

    def test_that_the_number_is_even(self):

        result = level_four_functions.even_numbers(58)
        self.assertEqual(result, 1)

    def test_that_the_number_is_not_odd(self):

        result = level_four_functions.even_numbers(16)
        self.assertEqual(result, 1)

    def test_for_the_square_of_numbers(self):

        result = level_four_functions.square_of_numbers(8)
        self.assertEqual(result, 64)

    def test_that_the_square_of_number_is_correct(self):

        result = level_four_functions.square_of_numbers(81)
        self.assertTrue(result, 10)

    def test_that_celsius_is_converted_to_Fahrenheit(self):
        
       result = level_four_functions.celsius_to_fahrenheit(45)
       self.assertEqual(result, 113)

    def test_that_degree_celsius_is_not_negative(self):

       result = level_four_functions.celsius_to_fahrenheit(-273)
       self.assertEqual(result, -459.4)

    def test_that_number_is_prime(self):
    
        result = level_four_functions.number_is_prime(47)
        self.assertTrue(result, 47)

    def test_that_prime_number_is_even(self):
        result = level_four_functions.number_is_prime(20)
        self.assertEqual(result, 1)

    def test_for_thr_largest_number(self):
        
        result = level_four_functions.largest_of_three_numbers(23, 56, 17)
        self.assertEqual(result, 17)

    def test_that_simple_interest_is_calculated(self):

        result = level_four_functions.calculation_of_simple_interest(12, 45, 89)
        self.assertEqual(result, 480.6)

    def test_that_simple_interest_is_not_negative(self):
    
        result = level_four_functions.calculation_of_simple_interest(-12, -45, -89)
        self.assertEqual(result, -480.6)

#    def test_that_number_can_be_multiplied(self):
#
#        result = level_four_functions.multiplication_table(5)
#        self.assertEqual(result, 120)

    def test_that_for_the_area_of_rectangle(self):

        result = level_four_functions.area_of_rectangle(4, 6)
        self.assertEqual(result, 24)

    def test_that_the_area_of_the_rectangle_can_also_multiplied_by_another_three_digit_numbers(self):
    
        result = result = level_four_functions.area_of_rectangle(127, 101)
        self.assertEqual(result, 12827)
