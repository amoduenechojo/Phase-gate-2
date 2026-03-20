import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class LevelFiveTest{

    @Test
        public void testThatNegativeNumbersAreFilledWithZero(){

        int [] number = {12, -9, -1};
            
        int [] actual = LevelFive.fillingNegativeIndexesWithZero(number);
        int [] expected = {12, 0, 0};

        assertArrayEquals(expected, actual); 
        }


    @Test
        public void testThatZeroNumbersAreMovedToTheBackOfTheArray(){

        int [] number = {12, 0, 0, 15, 0, 1};
            
        int [] actual = LevelFive.movingZeroesToTheEndOfTheArray(number);
        int [] expected = {12, 15, 1, 0, 0, 0};

        assertArrayEquals(expected, actual); 
        }


    @Test
        public void testThatNumberIsPrime(){

        int [] numbers = {12, 7, 0, 15, 5, 1};

        int [] actual = LevelFive.numberIsPrime(numbers);
        int [] expected = {7,5};

        assertArrayEquals(expected, actual);
    }

       @Test
            public void testThatNumbersAreSortedInDescendingOrder(){

            int [] numbers = {15, 7, 0, 12, 5, 1};

            int [] actual = LevelFive.descendingNumberSorting(numbers);
            int [] expected = {15, 12, 7, 5, 1, 0};

            assertArrayEquals(expected, actual);
        }
}
