/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication61.pkgfinal.project;

/**
 *
 * @author PROGRAMMER
 */
import java.util.Scanner;

public class SubClass {

    private final int MAX_BILLS = 100;
    private String[] foodNames = new String[MAX_BILLS];
    private double[] billAmounts = new double[MAX_BILLS];
    private double[] vatAmounts = new double[MAX_BILLS];
    private String[] timeStamps = new String[MAX_BILLS];
    private int billCount = 0;

    //Add bill method variables
    private String foodName;
    private String billAmountStr;
    private double billAmount;
    private String vatAmountStr;
    private double vatAmount;
    private String timeStamp;

    //edit bill method variables
    private String foodNameToEdit;

    //delete bill method variables
    private String foodNameToDelete;

    public Scanner scanner = new Scanner(System.in);

    public void choices() {

        int choice;
        do {
            choice = showMenu();
            switch (choice) {
                case 1:
                    addBill();
                    break;
                case 2:
                    editBill();
                    break;
                case 3:
                    deleteBill();
                    break;
                case 4:
                    displayReceipt();
                    break;
                case 5:
                    System.out.println("Thank you for using the Restaurant CRUD!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again!");
                    break;
            }
        } while (choice != 5);
    }

    public int showMenu() {

        String menu = "Restaurant CRUD\n\n"
                + "1. Add Bill\n"
                + "2. Edit Bill\n"
                + "3. Delete Bill\n"
                + "4. Display Receipt\n"
                + "5. Exit\n\n"
                + "Enter your choice (1-5): ";

        while (true) {

            System.out.print(menu);
            String choiceStr = scanner.nextLine();

            if (choiceStr == null) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            try {
                int choice = Integer.parseInt(choiceStr);
                if (choice >= 1 && choice <= 5) {
                    return choice;
                } else {
                    System.out.println("Invalid choice. Please try again.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid choice. Please enter a valid number.");
            }
        }
    }

    public void addBill() {
        if (billCount >= MAX_BILLS) {
            System.out.println("The restaurant is full. Cannot add more details.");
            return;
        }

        System.out.println("Enter the name of the food: ");
        foodName = scanner.nextLine();
        System.out.println("Enter the bill amount: ");
        billAmountStr = scanner.nextLine();
        billAmount = Double.parseDouble(billAmountStr);
        System.out.println("Enter the VAT amount: ");
        vatAmountStr = scanner.nextLine();
        vatAmount = Double.parseDouble(vatAmountStr);
        System.out.println("Enter the time when the food was added: ");
        timeStamp = scanner.nextLine();

        foodNames[billCount] = foodName;
        billAmounts[billCount] = billAmount;
        vatAmounts[billCount] = vatAmount;
        timeStamps[billCount] = timeStamp;
        billCount++;

        System.out.println("Bill added successfully");

    }

    public void editBill() {
        System.out.println("Enter the name of the food to edit:");
        foodNameToEdit = scanner.nextLine();

        int index = -1;
        for (int i = 0; i < billCount; i++) {
            if (foodNames[i].equals(foodNameToEdit)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Enter the new name of the food: ");
            foodName = scanner.nextLine();
            System.out.println("Enter the new bill amount: ");
            billAmountStr = scanner.nextLine();
            billAmount = Double.parseDouble(billAmountStr);
            System.out.println("Enter the new VAT amount: ");
            vatAmountStr = scanner.nextLine();
            vatAmount = Double.parseDouble(vatAmountStr);
            System.out.println("Enter the new time when the food was added: ");
            timeStamp = scanner.nextLine();

            foodNames[index] = foodName;
            billAmounts[index] = billAmount;
            vatAmounts[index] = vatAmount;
            timeStamps[index] = timeStamp;

            System.out.println("Bill edited successfully!");
        } else {
            System.out.println("Food not found in the bill.");
        }
    }

    public void deleteBill() {

        System.out.println("Enter the name of the food to delete:");
        foodNameToDelete = scanner.nextLine();

        int index = -1;
        for (int i = 0; i < billCount; i++) {
            if (foodNames[i].equals(foodNameToDelete)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < billCount - 1; i++) {
                foodNames[i] = foodNames[i + 1];
                billAmounts[i] = billAmounts[i + 1];
                vatAmounts[i] = vatAmounts[i + 1];
                timeStamps[i] = timeStamps[i + 1];
            }
            billCount--;
            System.out.println("Bill for " + foodNameToDelete + " deleted successfully!");
        } else {
            System.out.println("Food not found in the bill.");
        }

    }

    public void displayReceipt() {

        if (billCount == 0) {
            System.out.println("Restaurant Receipt is empty. No items found");
            return;
        }

        StringBuilder receipt = new StringBuilder("Restaurant Receipt\n\n");
        for (int i = 0; i < billCount; i++) {
            receipt.append("Food Name: ").append(foodNames[i]).append("\n")
                    .append("Bill Amount: ").append(billAmounts[i]).append("\n")
                    .append("VAT Amount: ").append(vatAmounts[i]).append("\n")
                    .append("Time Added: ").append(timeStamps[i]).append("\n\n");
        }
        System.out.println(receipt.toString());
    }
}
