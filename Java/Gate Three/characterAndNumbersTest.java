import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class characterAndNumbersTest{


    @Test
        public void testThatStringsCanBeMixedWithIntegers(){
    
            String actualValue = characterAndNumbers.replacingLettersWithNumbers("AaaBBc");
            String expectedValue = "A1a2B2c1";

            assertEquals(actualValue,expectedValue);
        }

        
}
