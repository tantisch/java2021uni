package hw7;
import hw7.Car;
import java.util.Objects;
import java.util.Scanner;


public class ex2_8{

    static void print_same_brand(Car[] cars, String brand){
        System.out.println("Cars with brand: " + brand);
        for(Car car:  cars){
            if(Objects.equals(car.brand, brand)) car.show();
        }
    }

    static void print_model_over_n_year(Car[] cars, String model, int n){
        System.out.println("Cars with model " + model + " that are used more than " + n + " years");
        for(Car car: cars){
            if((Objects.equals(car.model, model)) && (2021 - car.year > n)) car.show();
        }
    }

    static void print_cars_year_with_higher_price(Car[] cars, int year, float price){
        System.out.println("Cars from " + year + " that cost more than " + price);
        for(Car car: cars){
            if((car.year == year) && (car.price > price)) car.show();
        }
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the ammount of cars");
        int n = console.nextInt();

        Car[] cars = new Car[n];

        for(int i = 0; i < n; i++){
            cars[i] = new Car();
        }

        print_same_brand(cars, "audi");
        print_model_over_n_year(cars, "m8", 3);
        print_cars_year_with_higher_price(cars, 2017, 20000);

    }
}