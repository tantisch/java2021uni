package cw10.Ex7_1;

abstract class Book implements Edition {
    private int printings;
    private String title;
    private String authors;
    private float price;

    Book() {}

    Book(String title, int n, String authors, float price) {
        this.title = title;
        setPrintings(n);
        this.authors = authors;
        this.price = price;
    }

    public int getPrintings() {
        return printings;
    }

    public void setPrintings(int n) {
        printings = n;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String s) {
        this.title = s;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float p) {
        this.price = p;
    }

    @Override
    public String toString() {
        return "Book: " + getTitle() + ", " + getAuthors();
    }
}