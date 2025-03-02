import User.Admin;
import User.User;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //hhhh
        System.out.println("Hello, Welcome to the Library");
        System.out.println("Enter your name");
        String userName = sc.nextLine();
        System.out.println("Please select your persona from below");
        System.out.println("1. Admin");
        System.out.println("2. Member");
        String userSelection = sc.nextLine();
        if (Objects.equals(userSelection, "1")) {
            System.out.println("Select any operation");
            System.out.println(Arrays.asList(AdminOperationsEnum.values()));
            User user = new Admin(userName);
            
        } else if (userSelection == "2") {

        } else {
            System.out.println("Wrong selection. Please select again......");
        }

    }
}