package Item;

import java.util.UUID;

public abstract class Item {
    private final UUID itemId;
    private final String name;
    private final String author;
    private final String publicationDate;
    private boolean borrowed;

    public Item(String name, String publicationDate, String author) {
        this.itemId = new UUID(1, 10);
        this.name = name;
        this.publicationDate = publicationDate;
        this.author = author;
        this.borrowed = false;
    }
}
