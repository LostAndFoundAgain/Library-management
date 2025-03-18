package Item;

import Common.Items;

import java.util.UUID;

public abstract class Item {
    private final UUID itemId;
    private final Items itemType;
    private final String name;
    private String author;
    private String publicationDate;
    private boolean borrowed;

    public Item(Items itemType, String name, String publicationDate, String author) {
        this.itemId = new UUID(1, 10);
        this.itemType = itemType;
        this.name = name;
        this.publicationDate = publicationDate;
        this.author = author;
        this.borrowed = false;
    }

    public UUID getItemId() {
        return itemId;
    }

    public Items getItemType() {
        return itemType;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
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
