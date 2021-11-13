package hw9.Ex6_4;

public class Vegetable implements Comparable<Vegetable>{
    public String name;
    public int calories;

    Vegetable(String n, int c){
        this.name = n;
        this.calories = c;
    }

    @Override
    public int compareTo(Vegetable v) {
        return Integer.compare(this.calories, v.calories);
    }
}
