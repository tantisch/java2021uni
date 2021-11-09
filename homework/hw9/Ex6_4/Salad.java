package hw9.Ex6_4;
import java.util.Arrays;

public class Salad {
    Vegetable[] vegetables;

    Salad(Vegetable[] vegs){
        this.vegetables = vegs;
    }

    public int count_calories(){
        int sum = 0;
        for(Vegetable v: this.vegetables)
            sum += v.calories;

        return sum;
    }

    public void sort_by_calories(){
        Arrays.sort(this.vegetables);
    }

    @Override
    public String toString() {
        String s = "Salad: \n";
        for(Vegetable v: this.vegetables){
            s += v.toString() + "\n";
        }
        return s;
    }

    public void print_calories_in_range(int a, int b){
        for(Vegetable v: vegetables){
            if (v.calories >= a && v.calories <= b) System.out.println(v);
        }
    }

}
