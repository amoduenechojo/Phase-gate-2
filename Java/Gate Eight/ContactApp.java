import java.util.Scanner;
public class ContactApp{


    public static String contactAppMenu(String menu){

        menu = """
            
            1. Contact Needs
            2. Remove contact
            3. Find Contact by Phone Number
            4. Find Contact by First Name
            5. Find Contact by Last Name
            6. Edit Contact
                """;

    return menu;             
    }

    public static String contactNeedMenu(String contactNeeds){

        contactNeeds = """
            
            1. FirstName
            2. LastName
            3. Phone Number
                """;
    
    System.out.print(contactNeeds);
        }

    public static String contactNeeds(String contactInformations){        
    
        Scanner input = new Scanner(System.in);
         
            System.out.print("Enter your first name: ");
            String firstName = input.nextLine();

            System.out.println("Enter your last name: ");
            String LastName = input.nextLine();

                 for(int count = 0; count < 11; count++){
                        if(phoneNumber != count){
                            System.out.println("Invalid phoneNumber");
                        }
                        else{
                        System.out.println("Enter your phone number: ");
                        String phoneNumber = input.nextLine();

                        System.out.println("Contact Added Successfully");
                    }
                }
                return contactNeeds;
            }


    public static String removeContact(String phoneNumber){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the phone number you want to remove: ");
        phoneNumber = input.nextLine();
        
            for(int count = 0; count < 11; count++){
                if(phoneNumber != count){
                    }
            System.out.print("Contact successfully removed.");
        return removeContact;
    }


















































}
