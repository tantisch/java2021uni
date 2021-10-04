package cw5;
import java.util.Scanner;

public class ex1_5{

    public static double dist(double x1, double y1, double z1, double x2, double y2, double z2) {
        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1) + (z2 - z1) * (z2 - z1));
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("enter x: ");
        double x = console.nextDouble();
        System.out.println("enter y: ");
        double y = console.nextDouble();
        System.out.println("enter z: ");
        double z = console.nextDouble();

        System.out.println("\nenter how many points you want to enter: ");
        int n = console.nextInt();
        double[] xi = new double[n];
        double[] yi = new double[n];
        double[] zi = new double[n];

        for(int i=0; i<n; i++){
            System.out.printf("enter x%d: ", i);
            xi[i] = console.nextDouble();
            System.out.printf("enter y%d: ", i);
            yi[i] = console.nextDouble();
            System.out.printf("enter z%d: ", i);
            zi[i] = console.nextDouble();
        }

        double max_dist = 0;
        int max_ind = 0;
        for(int i=0; i<n; i++){
            double distance = dist(x, y, z, xi[i], yi[i], zi[i]);
            if(distance > max_dist){
                max_dist = distance;
                max_ind = i;
            }
        }
        System.out.println(max_dist);
        System.out.printf("(%f, %f, %f)", xi[max_ind], yi[max_ind], zi[max_ind]);
    }
}