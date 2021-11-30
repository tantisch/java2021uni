package hw12;

public class Cube {
    int side;
    String color;
    String material;

    Cube(int s, String c, String m){
        this.side = s;
        this.color = c;
        this.material = m;
    }

    @Override
    public String toString(){
        return "Cube: " + this.side + " " + this.color + " " + this.material;
    }
}
