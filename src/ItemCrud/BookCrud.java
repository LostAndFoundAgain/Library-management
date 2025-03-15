package ItemCrud;

import Item.Book;
import Item.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static DataLayer.BookData.books;

public class BookCrud {

    public void add(Book book) {
        try {
            System.out.println("trying to add a book");
            ArrayList<Book> bookstore = new ArrayList<>();
            bookstore.add(book);
            System.out.println(bookstore);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void update(Book book) {

    }

    public void remove(Book book) {

    }
}
