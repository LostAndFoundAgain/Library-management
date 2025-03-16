import Common.AdminOperationsEnum;
import User.Admin;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, Welcome to the Library");
        System.out.println("Enter your name");
        String userName = sc.nextLine();
        System.out.println("Please select your persona from below");
        System.out.println("1. Admin");
        System.out.println("2. Member");
        String userSelection = sc.nextLine();

        // Admin area
        if (Objects.equals(userSelection, "1")) {
            Admin user = new Admin(userName);
            System.out.println("Select any operation");
            System.out.println(Arrays.toString(AdminOperationsEnum.values()));
            String operation = sc.nextLine();
            if (Objects.equals(operation, "1")) {
                user.addItem();
            } else if (Objects.equals(operation, "2")) {
                user.removeItem();
            } else if (Objects.equals(operation, "3")) {
                user.updateItem();
            } else if (Objects.equals(operation, "4")) {
                user.viewItems();
            }

        }
        // Member area
        else if (Objects.equals(userSelection, "2")) {
            System.out.println("Select membership");
            System.out.println("1. Premium");
            System.out.println("2. Regular");
            String membership = sc.nextLine();
            if (Objects.equals(membership, "1")) {

            }
        } else {
            System.out.println("Wrong selection. Please select again......");
        }

    }
}