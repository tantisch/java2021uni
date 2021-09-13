import java.lang.Math;

public class ex3_4{
    public static void main(String[] args) {
        float a1 = (float) (1/10.0 * 1/10.0 * 1/10.0 * 1/10.0);
        double a2 = (1/10.0 * 1/10.0 * 1/10.0 * 1/10.0);
        System.out.println(a1);
        System.out.println(a2);

        float b1 = 2.33e5F;
        double b2 = 2.33E5;
        System.out.println(b1);
        System.out.println(b2);

        float c1 = (float) Math.PI;
        double c2 = Math.PI;
        System.out.println(c1);
        System.out.println(c2);

        float d1 = (float) Math.E;
        double d2 = Math.E;
        System.out.println(d1);
        System.out.println(d2);

        float e1 = (float) Math.sqrt(5);
        double e2 = Math.sqrt(5);
        System.out.println(e1);
        System.out.println(e2);

        float f1 = (float) Math.log(100);
        double f2 = Math.log(100);
        System.out.println(f1);
        System.out.println(f2);


    }
}