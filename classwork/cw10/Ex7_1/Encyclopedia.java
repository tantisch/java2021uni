package cw10.Ex7_1;

public class Encyclopedia extends Book {
    private int items;

    Encyclopedia() {}

    Encyclopedia(String title, int n, String authors, float price) {
        super(title, n, authors, price);
    }

    public Encyclopedia(String title, int n, String authors, float price, int items) {
        this(title, n, authors, price);
        setItems(items);
    }

    public void setItems(int n) {
        this.items = n;
    }

    public int getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Encyclopedy: " + getTitle() + ", " + getAuthors();
    }
}
