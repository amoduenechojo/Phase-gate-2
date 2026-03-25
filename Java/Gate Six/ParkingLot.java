public class ParkingLot{

    public static int [] parkingLotSlot(int [] parkingLotSpace){

        int [] parkingSpace = new int [20];

        for(int carSpace = 0; carSpace < 20; carSpace++){
            if(parkingSpace[carSpace] >= 0){
                parkingSpace[carSpace] = carSpace + 1;
                    return parkingSpace;
            }

            else if(parkingSpace[carSpace] < 0){
                return parkingSpace[carSpace] = -1;
             }
        }
        return parkingSpace;
    }


    public static int [] chooseYourParkingSpace(int [] parkingSpace){

        for(int count = 0; count < 20; count++){
                if (parkingSpace[count] == 0){
                    parkingSpace[count] = 1;
                    return parkingSpace;
                }
            }
        return parkingSpace;
        }

    
    public static String parkAtSlot(int [] parkingSpace, int slotNumber){

        if(slotNumber < 1 || slotNumber > 20){
            return "Invalid input.";
        }

        if(parkingSpace[slotNumber - 1] == 0){
          parkingSpace[slotNumber - 1] = 1;
            return "Car parked at slot" + slotNumber;
        }

        else{
            return "Slot already occupied.";
        }    
    }


    public static String carsParkedLeavingSlot(int [] slotNumber, int[] parkingSpace){
        if (slotNumber < 1 || slotNumber > 20){
            return "";
        }

        if (parkingSpace[slotNumber - 1] == 1){ 
            parkingSpace[slotNumber - 1] = 0; 
            return "Car removed from slot " + slotNumber;
        } 

        else{
            return "Slot is already empty";
        }
    }


    public static int [] displayParkingStatus(int [] slots){

        for(int count = 0; count < 20; count++){
            if(slot[count] == 0){
                return "The slot is" + count + slot + "is empty";
            } 
            else if(slot[count] == 1){
                return "The slot is" + count + slot + "is filled.";
            }
        }             
    }

}
