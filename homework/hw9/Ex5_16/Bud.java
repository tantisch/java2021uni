package hw9.Ex5_16;

public class Bud {
    Petal petal;
    int amount_of_petals;
    public boolean blossomed;
    public boolean faded;
    String color;

    Bud(Petal p, int n) {
        petal = p;
        amount_of_petals = n;
        color = petal.color;
        blossomed = petal.blossomed;
        faded = petal.faded;

    }

    Bud(int n){
        petal = new Petal();
        amount_of_petals = n;
        color = petal.color;
        blossomed = petal.blossomed;
        faded = petal.faded;
    }

    Bud (String c, int n){
        petal = new Petal();
        amount_of_petals = n;
        color = c;
        petal.color = c;
        blossomed = petal.blossomed;
        faded = petal.faded;
    }

    public void blossom(){
        petal.blossomed = true;
        blossomed = true;
        faded = false;
    }

    public void set_color(String c){
        color = c;
        petal.color = c;
    }

    public boolean faded(){
        return faded;
    }


}
