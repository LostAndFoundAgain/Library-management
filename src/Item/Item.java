package Item;

public abstract class Item {
    private final String name;
    private final String author;
    private final String publicationDate;
    private boolean borrowed;

    public Item(String name, String publicationDate, String author) {
        this.name = name;
        this.publicationDate = publicationDate;
        this.author = author;
        this.borrowed = false;
    }
}
