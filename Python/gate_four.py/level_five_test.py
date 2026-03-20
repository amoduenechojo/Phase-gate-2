from unittest import TestCase
import level_five

class LevelFiveTest(TestCase):

    def test_that_number_at_zero_is_moved_backwards(self):
        number = [0, 0, 5, 78, 9, 0]
        expected = [5,78,9,0,0,0]

        actual = level_five.moving_zeroes_to_te_end_of_the_array(number)
        self.assertEqual(actual,expected)

    def test_that_negative_numbers_are_replaced_with_zero(self):
        number = [12, -9, -7, 34]
        expected = [12, 0, 0, 34]

        actual = level_five.negative_index_are_replaced_with_zero(number)
        self.assertEqual(actual,expected)

    def test_tat_duplcated_number_is_removed(self):
        number = [45, 45 , 11, 11, 4, 5, 6]
        expected = [45, 11, 4, 5, 6]

        actual = level_five.removing_duplicated_number(number)
        self.assertEqual(actual,expected)
