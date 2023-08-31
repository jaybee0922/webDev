/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30.work.pkg5.pkg9;

/**
 *
 * @author PROGRAMMER
 */
import java.util.Scanner;

public class JavaApplication30Work59 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username = "Samantha";
        String password = "Java<3";

        while (true) {
            System.out.println("Username: ");
            username = scanner.nextLine();
            System.out.println("Password: ");
            password = scanner.nextLine();
            if(!username.equals("Samantha") || (!password.equals("Java<3"))){
                System.out.println("Username incorrect");
                System.out.println("Password incorrect");
                continue;
            }else if(username.equals("Samantha") || (password.equals("Java<3"))){
                System.out.println("Sign in successful. Welcome!");
                break;
            }
        }
    }

}
