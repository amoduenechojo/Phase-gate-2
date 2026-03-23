import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayFunctionTest{


    @Test
        public void testThatElementsCountedAreEven(){
            int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

            int [] actual = ArrayFunction.countEvens(numbers);
            int [] expected = {2, 4, 6, 8, 0};

            assertArrayEquals(expected,actual);
        }

    @Test
        public void testThatEvenElementsInTheArrayIsNotNegative(){
            int [] numbers = {-1, 8, -5, 34};

            int [] actual = ArrayFunction.countEvens(numbers);
            int [] expected = {8,34};

            assertArrayEquals(expected,actual);
        }

       @Test
            public void testThatArrayWithNoEvenReturnsAnEmptySpace(){
                int [] numbers = {1, 3, 5, 7};

                int [] actual = ArrayFunction.countEvens(numbers);
                int [] expected = {};

                assertArrayEquals(expected,actual);
            }


    @Test
        public void testThatNumberInLinearSearchIsTargeted(){

        int [] numbers = {1, 2, 3, 45, 6, 7, 18};

        int actual = ArrayFunction.linearSearch(numbers, 45);
        int expected = 3;

       assertEquals(expected, actual); ;
        }


    @Test
        public void testThatLengthOfArrayIsEqualToOneAnother(){

        int [] first = {18, 20, 22};
        int [] second = {18, 20, 22};
        
        boolean actual = ArrayFunction.arrayEqual(first, second);

        assertTrue(actual);
        }


    @Test
        public void testForTheSquareOfFirstPerfectSquare(){

        
        int [] numbers = {4, 3, 71};

        int [] actual = ArrayFunction.squares(numbers);
        int [] expected = {16};

       assertArrayEquals(expected,actual);

    }

}
