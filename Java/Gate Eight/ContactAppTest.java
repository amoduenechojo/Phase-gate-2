//javac -cp .:junit-platform-console-standalone-1.13.4.jar ContactAppTest.java
//java -jar junit-platform-console-standalone-1.13.4.jar execute --class-path . --select-class ContactAppTest --details=verbose

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ContactAppTest{

//testThatTwoContactsCannotHaveTheSamePhoneNumber
//testThatNumberCanBeFoundByLastName
//testThatNumberCanBeFoundByLastName
//testThat

    @Test
        public void testThatContactMenuIsComplete(){

            String actual = ContactApp.contactAppMenu(menu);
            String expected = "1";
            
            assertEquals(actual, expected);
        }


    @Test
        public void testThatContactInformationsAreAdded(){

        
            String actual = ContactApp.contactNeeds()
            String expected = "Successfully added";

            assertEquals(actual, expected);
    }


    @Test
        public void testThatContactHasBeenRemoved(){

            String phoneNumber = "09029282937";

            String actual = ContactApp.removeContact(phoneNumber);
            String expected = "";

            assertEquals(actual, expected);

    }








    }
































}
