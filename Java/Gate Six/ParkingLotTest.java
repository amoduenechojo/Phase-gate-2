//java -jar junit-platform-console-standalone-1.13.4.jar execute --class-path . --select-class ParkingLotTest --details=verbose

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class ParkingLotTest{

    @Test
        public void testThatNumberOfParkingSlotIsTwenty(){

        int [] noOfCarSpace = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        int [] actual = ParkingLot.parkingLotSlot(noOfCarSpace);
        int [] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        
        assertArrayEquals(actual, expected);
        }


    @Test
        public void testThatCarSpaceHasBeenChosen(){

        int [] carSlot = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        int [] actual = ParkingLot.chooseYourParkingSpace(carSlot);
        int [] expected = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        assertArrayEquals(actual, expected);

        }

    @Test
        public void testThatCarIsParkedAtChosenSlot(){

        int [] chosenSlot





        }








































}
