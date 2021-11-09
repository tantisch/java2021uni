package hw9.Ex6_4;


public class ex6_4{
    public static void main(String[] args){
        Salad salad = new Salad(new Vegetable[]{new Cucumber(), new Root(), new Tomato(), new Lettuce(), new Cucumber()});
        System.out.println(salad);
        System.out.println("Sorted salad by calories: \n");
        salad.sort_by_calories();
        System.out.println(salad);

        System.out.println("Amount of calories in salad: " + salad.count_calories() + "\n");

        System.out.println("Vegetables in salad with calories from 3 to 7: ");
        salad.print_calories_in_range(3, 7);
    }
}