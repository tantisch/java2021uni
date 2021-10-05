package cw5;
import java.util.Scanner;

public class ex1_3{
    public static double mean(double[] m) {
        double sum = 0;
        for (double j : m)
            sum += j;
        return sum / m.length;
    }

    public static double calculateSD(double[] m) {
        double  standardDeviation = 0.0;
        double mean = mean(m);

        for(double num: m)
            standardDeviation += Math.pow(num - mean, 2);

        return Math.sqrt(standardDeviation / m.length);
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        double[] array = new double[n];
        for(int i=0; i<n; i++){
            double a = console.nextDouble();
            array[i] = a;
        }
        System.out.println(mean(array));
        System.out.println(calculateSD(array));

    }
}