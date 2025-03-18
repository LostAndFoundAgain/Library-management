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

public class Member extends User {
    private Membership membership;

    public Member(String name, Membership membership) {
        super(name);
        this.membership = membership;
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
