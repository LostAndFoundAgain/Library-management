//    🔑 Admin Operations
//    ✅ 1. Add Item → Add a new Book, DVD, or Magazine.
//    ✅ 2. Remove Item → Delete an item by title.
//    ✅ 3. Update Item → Modify an item's details (title, author, publication date, etc.).
//    ✅ 4. View All Items → See all books, DVDs, and magazines in the library.
//    ✅ 5. Exit to Main Menu → Return to the main selection screen.

package User;

import Common.Items;
import Item.Book;
import Item.Magazine;
import ItemCrud.BookCrud;
import ItemCrud.MagazineCrud;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

import static DataLayer.BookData.books;
import static DataLayer.DvdData.dvds;
import static DataLayer.MagazineData.magazines;

public class Admin extends User {
    Scanner sc = new Scanner(System.in);

    public Admin(String name) {
        super(name);
    }

    public void addItem() {
        System.out.println("Which item would you like to add");
        System.out.println(Arrays.toString(Items.values()));
        String choice = sc.nextLine();
        if (Objects.equals(choice, "BOOK")) {
            System.out.println("Enter book name : ");
            String bookName = sc.nextLine();
            System.out.println("Enter publication date (YYYY-MM-DD): ");
            String publicationDate = sc.nextLine();
            System.out.println("Enter author name : ");
            String author = sc.nextLine();
            Book book = new Book(bookName, publicationDate, author);
            BookCrud crud = new BookCrud();
            crud.add(book);
        } else if (Objects.equals(choice, "MAGAZINE")) {
            System.out.println("Enter magazine name : ");
            String magazineName = sc.nextLine();
            System.out.println("Enter publication date (YYYY-MM-DD): ");
            String publicationDate = sc.nextLine();
            System.out.println("Enter author name : ");
            String author = sc.nextLine();
            Magazine magazine = new Magazine(magazineName, publicationDate, author);
            MagazineCrud crud = new MagazineCrud();
            crud.add(magazine);
        }
    }

    public void removeItem() {
        System.out.println("Which item would you like to remove");
        System.out.println(Arrays.toString(Items.values()));
        String choice = sc.nextLine();
        if (Objects.equals(choice, "BOOK")) {
            System.out.println("Enter title of the book");
            String bookName = sc.nextLine();
            BookCrud crud = new BookCrud();
            crud.remove(bookName);
        }
    }

    public void updateItem() {
        System.out.println("Which item would you like to update");
        System.out.println(Arrays.toString(Items.values()));
        String choice = sc.nextLine();
        if (Objects.equals(choice, "BOOK")) {
            System.out.println("Enter title of the book");
            String bookName = sc.nextLine();
            BookCrud crud = new BookCrud();
            crud.update(bookName);
        }
    }

    public void viewItems() {
        System.out.println("Following items are present according to types....");
        System.out.println("Books----------------");
        System.out.println(books);
        System.out.println("Magazines-------------");
        System.out.println(magazines);
        System.out.println("DVDs-------------------");
        System.out.println(dvds);
    }
}
