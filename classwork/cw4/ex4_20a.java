import java.lang.Math;
import java.util.Scanner;

public class ex4_20a{

    public static double inx(double x, double e){
        double res = 0;
        double i = 0;
        double cur = x;
        while ((cur >= e) || (cur <= -e)){
            res += cur;
            cur *= (-1);
            cur *= (x*x);
            i += 2;
            cur /= i*(i+1);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double e = 0.001;
        double d = console.nextDouble();
        System.out.println(inx(d, e));
    }
}