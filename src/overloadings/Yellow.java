package overloadings;

import java.util.Random;

public class Yellow {

    public static void main(String[] args) {
        login("1-773 347 2513", true);
        login("608-234-3223", true);
        login("248 035 2323", true);
        login("james234", "James2022!");
        login("s@gmail.com", true);

    }

    public static void login(String phoneNumber, boolean isPhoneNumber) {

        if (isPhoneNumber){
            // if true then it's phone number
            phoneNumber = phoneNumber.replace("-", "");
            phoneNumber = phoneNumber.replace(" ", "");
            System.out.println(phoneNumber);

            if (phoneNumber.length() == 10 || phoneNumber.length() == 11){
                // valid phone number
                // Generate here random pass code up to 1000
                // Then print "%passcode is sent to %phoneNumber"
                Random random = new Random();
                int passCode = random.nextInt(1000);
                System.out.println("Passcode: " + passCode + " is sent to Phone number: " + phoneNumber);

            }else {
                // phone number is invalid
                System.out.println("Invalid phone number");
            }
        }else{
            // Gmail
            System.out.println("Redirecting to Gmail for login");
        }
    }

    public static void login(String username, String password){
        if(username.isEmpty() || password.isEmpty()){
            System.out.println("Invalid credentials. Try again");
        }
        else{
            System.out.println("Login successful!");
        }
    }
}
