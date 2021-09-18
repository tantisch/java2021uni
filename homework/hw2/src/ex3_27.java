import java.util.Scanner;
import java.lang.Math;

public class ex3_27{
    /**
     * <p>
     *     program that counts the volume of the cone by the radius and height
     * </p>
     *
     * @param args array of strings
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double r = console.nextDouble();
        System.out.println("Enter the height: ");
        double h = console.nextDouble();
        double V = h/3.0 * Math.PI * r * r;
        System.out.println("The volume of the cone(V): " + V);
    }
}