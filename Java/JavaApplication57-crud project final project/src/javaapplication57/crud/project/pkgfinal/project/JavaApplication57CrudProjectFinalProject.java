/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication57.crud.project.pkgfinal.project;

/**
 *
 * @author PROGRAMMER
 */
import javax.swing.JOptionPane;

public class JavaApplication57CrudProjectFinalProject {

    /**
     * @param args the command line arguments
     */
    private static final int MAX_BILLS = 100;
    private static String[] foodNames = new String[MAX_BILLS];
    private static double[] billAmounts = new double[MAX_BILLS];
    private static double[] vatAmounts = new double[MAX_BILLS];
    private static String[] timestamps = new String[MAX_BILLS];
    private static int billCount = 0;

    public static void main(String[] args) {

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
                    JOptionPane.showMessageDialog(null, "Thank you for using the Restaurant CRUD!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    private static int showMenu() {
        String menu = "Restaurant CRUD\n\n"
                + "1. Add Bill\n"
                + "2. Edit Bill\n"
                + "3. Delete Bill\n"
                + "4. Display Receipt\n"
                + "5. Exit\n\n"
                + "Enter your choice (1-5): ";

        while (true) {
            String choiceStr = JOptionPane.showInputDialog(null, menu);

            // Handle the case where the user cancels or closes the input dialog
            if (choiceStr == null) {
                JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
                continue;
            }

            try {
                int choice = Integer.parseInt(choiceStr);
                if (choice >= 1 && choice <= 5) {
                    return choice;
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid choice. Please enter a valid number.");
            }
        }
    }

    private static void addBill() {
        if (billCount >= MAX_BILLS) {
            JOptionPane.showMessageDialog(null, "The restaurant is full. Cannot add more bills.");
            return;
        }

        String foodName = JOptionPane.showInputDialog(null, "Enter the name of the food:");
        String billAmountStr = JOptionPane.showInputDialog(null, "Enter the bill amount:");
        double billAmount = Double.parseDouble(billAmountStr);
        String vatAmountStr = JOptionPane.showInputDialog(null, "Enter the VAT amount:");
        double vatAmount = Double.parseDouble(vatAmountStr);
        String timestamp = JOptionPane.showInputDialog(null, "Enter the time when the food was added:");

        foodNames[billCount] = foodName;
        billAmounts[billCount] = billAmount;
        vatAmounts[billCount] = vatAmount;
        timestamps[billCount] = timestamp;
        billCount++;

        JOptionPane.showMessageDialog(null, "Bill added successfully!");
    }

    private static void editBill() {
        String indexStr = JOptionPane.showInputDialog(null, "Enter the index of the bill to edit (0-" + (billCount - 1) + "):");
        int index = Integer.parseInt(indexStr);

        if (index >= 0 && index < billCount) {
            String foodName = JOptionPane.showInputDialog(null, "Enter the new name of the food:");
            String billAmountStr = JOptionPane.showInputDialog(null, "Enter the new bill amount:");
            double billAmount = Double.parseDouble(billAmountStr);
            String vatAmountStr = JOptionPane.showInputDialog(null, "Enter the new VAT amount:");
            double vatAmount = Double.parseDouble(vatAmountStr);
            String timestamp = JOptionPane.showInputDialog(null, "Enter the new time when the food was added:");

            foodNames[index] = foodName;
            billAmounts[index] = billAmount;
            vatAmounts[index] = vatAmount;
            timestamps[index] = timestamp;

            JOptionPane.showMessageDialog(null, "Bill edited successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Invalid index. Please try again.");
        }
    }

    private static void deleteBill() {
        String indexStr = JOptionPane.showInputDialog(null, "Enter the index of the bill to delete (0-" + (billCount - 1) + "):");
        int index = Integer.parseInt(indexStr);

        if (index >= 0 && index < billCount) {
            // Shift the elements to delete the bill
            for (int i = index; i < billCount - 1; i++) {
                foodNames[i] = foodNames[i + 1];
                billAmounts[i] = billAmounts[i + 1];
                vatAmounts[i] = vatAmounts[i + 1];
                timestamps[i] = timestamps[i + 1];
            }
            billCount--;

            JOptionPane.showMessageDialog(null, "Bill deleted successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Invalid index. Please try again.");
        }
    }

    private static void displayReceipt() {
        StringBuilder receipt = new StringBuilder("Restaurant Receipt\n\n");
        for (int i = 0; i < billCount; i++) {
            receipt.append("Food Name: ").append(foodNames[i]).append("\n")
                    .append("Bill Amount: ").append(billAmounts[i]).append("\n")
                    .append("VAT Amount: ").append(vatAmounts[i]).append("\n")
                    .append("Time Added: ").append(timestamps[i]).append("\n\n");
        }
        JOptionPane.showMessageDialog(null, receipt.toString());
    }
}
