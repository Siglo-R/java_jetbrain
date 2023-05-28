package GCashPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class gCashShareALoad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, User> userID = new HashMap<>();

        userID.put("09175861661", new User("BOB", 100.0f));
        userID.put("09175861662", new User("MARLEY", 100.0f));
        userID.put("09175861663", new User("SETH", 100.0f));
        userID.put("09175861664", new User("RYAN", 100.0f));
        userID.put("09175861665", new User("FRITZ", 100.0f));
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("**Hi Welcome to Gcash! Please Register your account**");

        String userNumber;
        while (true) {
            System.out.print("Input your Number:");
            userNumber = scanner.nextLine();

            if (userNumber.length() != 11) {
                System.out.println("Invalid number. Please try again");
                continue;
            }

            if (userID.containsKey(userNumber)) {
                System.out.println("Number already exists. Please try again");
                continue;
            }

            break;
        }

        String userName;
        while (true) {
            System.out.print("Input Name: ");
            userName = scanner.nextLine();

            if (userName == null || userName.isEmpty()) {
                System.out.println("Name must not be empty!");
                continue;
            }

            break;
        }

        float userBalance = 100.0f;
        System.out.println("Hi " + userName + "! Thanks for registering with Gcash\nDefault balance of " + userBalance + " is added to your account!");
        userID.put(userNumber, new User(userName, userBalance));
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("**Share a load**");
        String senderNumber;
        while (true) {
            System.out.print("Please Enter Sender mobile number:");
            senderNumber = scanner.nextLine();

            if (!userID.containsKey(senderNumber)) {
                System.out.println("Number " + senderNumber + " not found. Please try again.");
                continue;
            }

            break;
        }

        String getSenderName = userID.get(senderNumber).getName();
        System.out.println("User Found!\n" + getSenderName + ": " + senderNumber);

        String recipientNumber;
        while (true) {
            System.out.print("Please Enter Recipient mobile number:");
            recipientNumber = scanner.nextLine();

            if (recipientNumber.equals(senderNumber)) {
                System.out.println("Sender and Recipient Number shouldn't be the same. Please try again.");
                continue;

            }
            else if (!userID.containsKey(recipientNumber)) {
                System.out.println("Number " + recipientNumber + " not found. Please try again.");
                continue;
            }

            break;
        }

        String getRecipientName = userID.get(recipientNumber).getName();
        System.out.println("User Found!\n" + getRecipientName + ":" + recipientNumber);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Processing Transaction...");
        float senderBalance = userID.get(senderNumber).getBalance();
        float recipientBalance = userID.get(recipientNumber).getBalance();

        System.out.println("Sender balance: " + senderBalance);
        System.out.println("Recipient balance: " + recipientBalance);

        boolean validBalance = false;
        while (!validBalance) {
            System.out.print("Enter amount (enter a valid number):");
            float amountEntered = scanner.nextFloat();

            if (amountEntered > senderBalance) {
                System.out.println("Low Balance. Please try again.");
            } else {
                senderBalance -= amountEntered;  // Update sender's balance by subtracting the amount
                recipientBalance += amountEntered;  // Update recipient's balance by adding the amount
                System.out.println("Amount transferred successfully!\nThank you for using Gcash!");

                // Update the balances in the user objects
                userID.get(senderNumber).setBalance(senderBalance);
                userID.get(recipientNumber).setBalance(recipientBalance);
                validBalance = true;
            }
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("**Updated Balances**");
        for (Map.Entry<String, User> entry : userID.entrySet()) {
            String number = entry.getKey();
            User user = entry.getValue();
            System.out.println(user.getName() + ": " + number + " - Balance: " + user.getBalance());
        }
    }
}