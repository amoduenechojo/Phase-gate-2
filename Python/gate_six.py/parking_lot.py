def parking_car_lot():
    parking_space = []

    for car_space in range(1, 21):
        parking_space.append(car_space)

    return parking_space

def choose_parking_space(parking_space):

    for count in range(1, 21):
        if parking_space[count] == 0:
            parking_space[count] = 1
            return parking_space

    return parking_space


def park_at_slot(parking_space, slot_number):

    if slot_number < 1 or slot_number > 20:
        return "Invalid input."


    if(parking_space[slot_number - 1] == 0):
      parking_space[slot_number - 1] = 1
      return f"Car parked at slot {slot_number}"

    else:
        return "Slot already occupied."

def cars_parked_leaving_slot(slot_number):

    if (slot_number < 1 || slot_number > 20){
        return "Invalid input"
    
    if (parking_space[slot_number - 1] == 1):
        parking_space[slot_number - 1] = 0; 
        return f"Car removed from slot {slot_number}"

    else:
        return "Slot is already empty"
     

def display_parking_status(slot):
    result = ""

    for count in range(20):
        if slot[count] == 0:
            result += f"Slot {count + 1} is empty\n"
        else:
            result += f"Slot {count + 1} is filled\n"

    return result
