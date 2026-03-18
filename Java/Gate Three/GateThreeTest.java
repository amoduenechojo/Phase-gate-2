import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GateThreeTest{
   
        @Test
            public void testThatNegativeNumberCanBeFilledInTheArray(){

                int [] actual = DayThree.fillArrays(10, 11, 12);
                int [] expected = (10, 11, 12, -1, -1);

               assertArrayEquals(actual, expected);
        }  


        @Test
            public void testThatNumbersCanBeRemovedFromTheArray(){

                int [] actual =  DayThree.removeNumbersFromArray(10, 11, 12, 13, 14, 15);
                int [] expected = {10,11};

                assertArrayEquals(actual, expected);
            }


        @Test
            public void testForEmptyArraysAndFillIt(){

                int [] actual = DayThree.addNegativeNumbersInTheEmptyBrace();
                int [] expected = {-1, -1, -1, -1};

                assertArrayEquals(actual, expected);
        }
    
    }
