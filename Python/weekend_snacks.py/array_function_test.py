from unittest import TestCase
import array_function

class ArrayFunction(TestCase):


    def test_for_even_count(self):
        number = (1, 2, 3, 45, 6, 7, 18)

        actual = array_function.count_evens(number)
        expected = (3)

        self.assertEqual(expected, actual)  


    def test_for_linear_search(self):
        number = (1, 2, 3, 4)
        target = 3

        actual = array_function.linear_search(number, target)


        self.assertEqual(2, actual)  


    def test_if_list_is_equal(self):
        first_element = [1, 2, 3]
        second_element = [1, 2, 3]

        actual = array_function.list_equal(first_element, second_element)

        self.assertTrue(actual)

    def test_that_the_perfect_square_of_the_first_index_is_correct(self):
        number = 5
        expected = [1, 4, 9, 16, 25]

        actual = array_function.square(number)

        self.assertEqual(expected, actual)


    def test_for_removal_of_duplicate(self):
        number = [1, 2, 3, 4, 2, 1]

        actual = array_function.remove_duplicate(number)
        expected = [1, 2, 3, 4]

        self.assertEqual(expected, actual)










