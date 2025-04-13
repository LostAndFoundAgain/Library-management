//        👤 Member Operations
//        ✅ 1. Register/Login → Enter name and membership type (Regular/Premium).
//        ✅ 2. View Available Items → See items that are not borrowed.
//        ✅ 3. Borrow Item → Take an item (if available and within borrowing limit).
//        ✅ 4. Return Item → Return an item they previously borrowed.
//        ✅ 5. View Borrowed Items → See their currently borrowed items.
//        ✅ 6. Logout to Main Menu → Go back to the main menu.


package User;

import Item.Item;
import Membership.Membership;
import Membership.Premium;
import Membership.Regular;

import java.util.Objects;
import java.util.Scanner;

import static DataLayer.Members.members;

public class Member extends User {
    Scanner sc = new Scanner(System.in);
    private Membership membership;

    public Member(String name, Membership membership) {
        super(name);
        this.membership = membership;
    }

    public void register(String name) {
        System.out.println("Select membership");
        System.out.println("1. Premium");
        System.out.println("2. Regular");
        String membershipChoice = sc.nextLine();
        if (Objects.equals(membershipChoice, "1")) {
            Membership membership = new Premium();
            Member user = new Member(name, membership);
        } else if (Objects.equals(membershipChoice, "2")) {
            Membership membership = new Regular();
            Member user = new Member(name, membership);
        }
    }

    public void login(String name) {
        if (members.containsKey(name)) {

        } else {
            System.out.println("You're not registered. Please register first");
            this.register(name);
        }
    }

    public Item[] viewAvailableItems() {
        return null;
    }

    public void borrowItem() {

    }

    public void returnItem() {

    }

    public Item[] viewBorrowedItems() {
        return null;
    }

}
