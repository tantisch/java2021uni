import java.util.Scanner;

public class ex4_5{
    /**
     * <p>
     *     The function to count the distance between two points
     * </p>
     *
     * @param x1 x coordinate of first point
     * @param y1 y coordinate of first point
     * @param x2 x coordinate of second point
     * @param y2 y coordinate of second point
     * @return distance between two points
     */
    public static double len_between_dots(double x1, double y1, double x2, double y2){
        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }

    /**
     *<p>
     *     The function to count the triangle square with 3 given sides
     *</p>
     *
     * @param a len of first side
     * @param b len of second side
     * @param c len of third side
     * @return square of the triangle
     */
    public static double triangle_square(double a, double b, double c){
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p-a) * (p-b) * (p-c));
    }

    /**
     * <p>
     *     Main function that count the square of the triangle by 3 given points
     * </p>
     *
     * @param args array of strings
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double x1 = console.nextDouble();
        double y1 = console.nextDouble();
        console.nextLine();
        double x2 = console.nextDouble();
        double y2 = console.nextDouble();
        console.nextLine();
        double x3 = console.nextDouble();
        double y3 = console.nextDouble();

        double a = len_between_dots(x1, y1, x2, y2);
        double b = len_between_dots(x2, y2, x3, y3);
        double c = len_between_dots(x1, y1, x3, y3);

        double square = triangle_square(a, b, c);
        System.out.println("Triangle square is: " + square);

    }
}