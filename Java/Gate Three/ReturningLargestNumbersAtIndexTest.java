import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ReturningLargestNumbersAtIndexTest{


    @Test
        public void testForLargestNumber(){

            int actual = ReturningLargestNumbersAtIndex.findingLargestNumbersAtIndex(numbers);
            int expected = (actual, 7.7);

            assertEquals(actual,expected);
        }
}
