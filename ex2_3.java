import java.util.Scanner;
import java.lang.Math;

public class ex2_3 {
    /**
     * <p>
     * This program counts the geomentric mean of two numbers.
     * It prints it in usual form, scientific form, and with one digit after a dot.
     * </p>
     *
     * @param args - array of strings
     *
     */
    public static void main(String[] args) {
        System.out.println("Tymofii Tyshchenko. Comp math 2. Sep 6. Ex 2.3 \n");

        Scanner console = new Scanner(System.in);
        double a = console.nextDouble();
        double b = console.nextDouble();

        double geom_mean = Math.sqrt(a * b);

        System.out.println(geom_mean);
        System.out.printf("%.2E%n", geom_mean);
        System.out.printf("%.1f", geom_mean);

    }
}
