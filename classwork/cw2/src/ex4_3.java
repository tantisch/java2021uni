public class ex4_3{

    public static double Rosenbrock2d(double x, double y){
        return 100.0 * (x * x - y) * (x * x - y) + (x - 1) * (x-1);
    }

    public static void main(String[] args) {
        double a1 = 235.25;
        double a2 = 636.24;

        double b1 = 235235.25;
        double b2 = 4262;

        double c1 = 9654.73;
        double c2 = 3.256;

        System.out.println(Rosenbrock2d(a1, a2));
        System.out.println(Rosenbrock2d(b1, b2));
        System.out.println(Rosenbrock2d(c1, c2));

    }
}