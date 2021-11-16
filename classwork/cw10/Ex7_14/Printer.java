package cw10.Ex7_14;

public class Printer implements PrintDevice{

    private int price;
    private String text_to_print;
    private String name;

    Printer(int p, String t, String n){
        this.price = p;
        this.text_to_print = t;
        this.name = n;
    }


    public int get_price() {
        return this.price;
    }

    public void set_price(int p) {
        this.price = p;
    }

    public String get_text() {
        return this.text_to_print;
    }

    public void set_text(String t) {
        this.text_to_print = t;
    }

    public String get_name() {
        return name;
    }

    public void set_name(String n) {
        this.name = n;
    }
}
