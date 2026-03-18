from unittest import TestCase
import filling_arrays

class FillingArrays(TestCase):

    def test_that_negative_numbers_can_fill_the_list(self):
        list_of_numbers = [10, 11, 12]

        actual = filling_arrays.list()
        expected = (10, 11, 12, -1, -1)

        self.assertEquals(actual, expected)

    def test_that_index_can_be_removed_from_a_list(self):
        list = [10, 11, 12, 13, 14]

        actual = filling_arrays.taking_two_indexes()
        expected = (10, 11)

    def test_that_empty_list_can_be_filled(self):
        list = []

        actual = filling_arrays.taking_two_indexes()
        expected = (10, 11)


