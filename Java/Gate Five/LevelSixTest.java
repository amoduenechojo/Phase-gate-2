import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LevelSixTest{

    @Test
        public void testThatNumbersAreSplitIntoEvenAndOdd() {

            int[] number = {1, 2, 3, 4, 5, 6};

            int[] actual = LevelSix.splitEvenAndOddNumber(number);
            int[] expected = {2, 4, 6, 1, 3, 5}; 

            assertArrayEquals(expected, actual);
        }

     @Test
        public void testThatNumberIsPalindrome(){

        int [] number = {45, 0, 8, 0, 45};

        boolean actual = LevelSix.checkForPalindrome(number);
        assertTrue(actual);
        }


}
