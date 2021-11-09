package hw9.Ex5_16;

public class Flower {
    Bud bud;
    String color;

    Flower(Bud b){
        bud = b;
        color = b.color;
    }

    Flower(){
        bud = new Bud(1);
        color = bud.color;
    }

    Flower(String c){
        bud = new Bud(c, 2);
        color = c;

    }

    public boolean faded(){
        return bud.faded;
    }

    public void blossom(){
        bud.blossom();
    }

}
