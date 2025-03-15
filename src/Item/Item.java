package Item;

import Common.Items;

import java.util.UUID;

public abstract class Item {
    private final UUID itemId;
    private final Items itemType;
    private final String name;
    private final String author;
    private final String publicationDate;
    private boolean borrowed;

    public Item(Items itemType, String name, String publicationDate, String author) {
        this.itemId = new UUID(1, 10);
        this.itemType = itemType;
        this.name = name;
        this.publicationDate = publicationDate;
        this.author = author;
        this.borrowed = false;
    }

    @Override
    public String toString() {
        return "{" +
                "itemId=" + itemId +
                ", itemType=" + itemType +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                ", borrowed=" + borrowed +
                '}';
    }
}
