package ItemCrud;

import Item.Magazine;

import java.util.Objects;
import java.util.Scanner;

import static DataLayer.MagazineData.magazines;

public class MagazineCrud {
    Scanner sc = new Scanner(System.in);
    public void add(Magazine magazine) {
        try {
            System.out.println("Adding magazine" + magazine);
            magazines.add(magazine);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void update(String title) {
        try {
            System.out.println("Updating magazine -> " + title);
            magazines.forEach(magazine -> {
                if (Objects.equals(title, magazine.getName())) {
                    System.out.println("What do you want to update");
                    System.out.println("1. Author");
                    System.out.println("2. Publication date");
                    String choice = sc.nextLine();
                    if (choice.equals("Author")) {
                        System.out.println("Enter new author name");
                        String newAuthorName = sc.nextLine();
                        magazine.setAuthor(newAuthorName);
                    } else if (choice.equals("Publication date")) {
                        System.out.println("Enter new publication date");
                        String newPublicationDate = sc.nextLine();
                        magazine.setPublicationDate(newPublicationDate);
                    }
                }
            });
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void remove(String title) {
        try {
            System.out.println("Removing magazine" + title);
            magazines.removeIf(magazine -> Objects.equals(magazine.getName(), title));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
