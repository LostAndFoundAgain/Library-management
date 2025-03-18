package ItemCrud;

import Item.Dvd;

import java.util.Objects;
import java.util.Scanner;

import static DataLayer.DvdData.dvds;

public class DvdCrud {
    Scanner sc = new Scanner(System.in);

    public void add(Dvd dvd) {
        try {
            System.out.println("Adding dvd" + dvd);
            dvds.add(dvd);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void update(String title) {
        try {
            System.out.println("Updating dvd -> " + title);
            dvds.forEach(dvd -> {
                if (Objects.equals(title, dvd.getName())) {
                    System.out.println("What do you want to update");
                    System.out.println("1. Author");
                    System.out.println("2. Publication date");
                    String choice = sc.nextLine();
                    if (choice.equals("Author")) {
                        System.out.println("Enter new author name");
                        String newAuthorName = sc.nextLine();
                        dvd.setAuthor(newAuthorName);
                    } else if (choice.equals("Publication date")) {
                        System.out.println("Enter new publication date");
                        String newPublicationDate = sc.nextLine();
                        dvd.setPublicationDate(newPublicationDate);
                    }
                }
            });
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void remove(String title) {
        try {
            System.out.println("Removing dvd" + title);
            dvds.removeIf(dvd -> Objects.equals(dvd.getName(), title));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
