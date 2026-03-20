from unittest import TestCase
import level_six

class LevelSix(TestCase):

    def test_that_negative_numbers_ae_replaced_with_zero(self):
        number = [1, -7, 34, -5]

        actual = level_six.replacing_negative_numbers_with_zero(number)
        expected = [1, 0, 34, 0]

        self.assertEqual(actual, expected)

    def test_that_number_is_prime(self):
        number = [12, 3, 5, 89]
        
        actual = level_six.sorting_list_of_prime_number(number)
        expected = [3, 5]

        self.assertEqual(actual,expected)
