import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Level4Test{

    @Test
        public void testNumberIsEqual(){
            int actual = Level4tasks.SumOfNumbers(5, 7);
            int expected = 12;

            assertEquals(actual, expected);
        }

    @Test
         public void testThatNumberWillAddNegativeNumbers(){
            int actual = Level4tasks.SumOfNumbers(-5, -187);
            int expected = -192;

            assertEquals(actual, expected);
        }


     @Test
        public void testNumberIsEven(){
            boolean actual = Level4tasks.evenNumber(12);

            assertTrue(actual);

        }

    @Test
        public void testNumberIsNotEven(){
            boolean actual = Level4tasks.evenNumber(13);

            assertFalse(actual);

        }

    
    @Test
        public void testForTheSquareOfOneNumber(){
            int actual = Level4tasks.squareOfNumbers(13);
            int expected = 169;

            assertEquals(actual, expected);
        }

    @Test
        public void testForTheSquareOfNegativeNumber(){
            int actual = Level4tasks.squareOfNumbers(-156);
            int expected = 24336;

            assertEquals(actual, expected);
        }

    
        @Test
        public void testThatCelsiusIsConvertedToFahrenheit(){
            double actual = Level4tasks.squareOfNumbers(273);
            double expected = 74529.0;

            assertEquals(actual, expected);
        }

     @Test
        public void testThatCelsiusCanSolveNegativeNumbers(){
            double actual = Level4tasks.squareOfNumbers(-103);
            double expected = 10609.0;

            assertEquals(actual, expected);
        }

//        @Test
//        public void testThatNumberIsPrime(){
//            boolean actual = Level4tasks.findPrimeNumbers(10);
//        
//            assertFalse(actual);
//        }
//
//         @Test
//        public void testThatNumberIsPrimeIsNotNegative(){
//            boolean actual = Level4tasks.findPrimeNumbers(-15);
//        
//            assertFalse(actual);
//        }
//
//    

     @Test
        public void testForSimpleInterest(){
            double actual = Level4tasks.simpleInterest(12, 23, 45);
            double expected = -124.2;

            assertEquals(actual, expected);
        }

        @Test
        public void testForNegativeSimpleInterest(){
            double actual = Level4tasks.simpleInterest(-12, -23, -45);
            double expected = -124.2;

            assertEquals(actual, expected);
        }


    
    











}
