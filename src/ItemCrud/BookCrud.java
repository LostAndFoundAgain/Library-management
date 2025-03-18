package ItemCrud;

import Item.Book;

import java.util.Objects;
import java.util.Scanner;

import static DataLayer.BookData.books;

public class BookCrud {
    Scanner sc = new Scanner(System.in);

    public void add(Book book) {
        try {
            System.out.println("Adding book" + book);
            books.add(book);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void update(String title) {
        try {
            System.out.println("Updating book -> " + title);
            books.forEach(book -> {
                if (Objects.equals(title, book.getName())) {
                    System.out.println("What do you want to update");
                    System.out.println("1. Author");
                    System.out.println("2. Publication date");
                    String choice = sc.nextLine();
                    if (choice.equals("Author")) {
                        System.out.println("Enter new author name");
                        String newAuthorName = sc.nextLine();
                        book.setAuthor(newAuthorName);
                    } else if (choice.equals("Publication date")) {
                        System.out.println("Enter new publication date");
                        String newPublicationDate = sc.nextLine();
                        book.setPublicationDate(newPublicationDate);
                    }
                }
            });
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void remove(String title) {
        try {
            System.out.println("Removing book" + title);
            books.removeIf(book -> Objects.equals(book.getName(), title));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
