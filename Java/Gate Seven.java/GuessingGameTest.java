//javac -cp .:junit-platform-console-standalone-1.13.4.jar GuessingGameTest.java

//# 2. Run using the 'execute' subcommand and explicit class selection
//java -jar junit-platform-console-standalone-1.13.4.jar execute --class-path . --select-class GuessingGameTest --details=verbose


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class GuessingGameTest{

    @Test
        public void testThatRandomNumberBetweenOneAndHundredIsGenerated(){

        random = 0;

        Random random = new random();
        int numbers = random.nextInt(1, 100);

        int actual = GuessingGame.generateRandomNumber(numbers);
        int expected = numbers;
        
        assertEquals(actual, expected);
        }


    @Test
        public void testThatTheNumberOfQuestionsAttemptedIsFive(){
        
        









    }










































}
