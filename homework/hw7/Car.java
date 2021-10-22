package hw7;

import java.util.Scanner;

public class Car {
    int id;
    String brand;
    String model;
    int year;
    String color;
    float price;
    String register_number;

    public Car(int id, String brand, String model, int year, String color, float price, String register_number) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.register_number = register_number;
    }

    public Car() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter id: ");
        this.id = console.nextInt();
        console.nextLine();
        System.out.println("Enter brand: ");
        this.brand = console.nextLine();
        System.out.println("Enter model: ");
        this.model = console.nextLine();
        System.out.println("Enter year: ");
        this.year = console.nextInt();
        console.nextLine();
        System.out.println("Enter color: ");
        this.color = console.nextLine();
        System.out.println("Enter price: ");
        this.price = console.nextFloat();
        console.nextLine();
        System.out.println("Enter registration number: ");
        this.register_number = console.nextLine();
    }

    public void show() {
        System.out.printf("\nId: %d\nBrand: %s\nModel: %s\nYear: %d\nColor: %s\nPrice: %f\nRegistration number: %s\n\n", this.id, this.brand, this.model, this.year, this.color, this.price, this.register_number);
    }

}
