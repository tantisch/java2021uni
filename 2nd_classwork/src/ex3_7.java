import java.util.Scanner;
import java.lang.Math;

public class ex3_7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter the mass of m1: ");
        double m1 = console.nextDouble();

        System.out.println("Enter the mass of m2: ");
        double m2 = console.nextDouble();

        System.out.println("Enter the r: ");
        double r = console.nextDouble();

        double y = 6.673 * Math.pow(10, -11);
        double F = y * (m1 * m2) / (r * r);

        System.out.printf("F = %E5", F);

    }
}