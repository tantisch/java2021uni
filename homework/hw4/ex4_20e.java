import java.util.Scanner;

public class ex4_20e{

    public static double ln1plusx(double x, double e){
        double res = 0;
        double i = 1;
        double cur = x;
        while ((cur >= e) || (cur <= -e)){
            res += cur;
            cur *= (-1);
            cur *= x;
            i += 1;
            cur /= i;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double e = 0.0001;
        double d = console.nextDouble();
        System.out.println(ln1plusx(d, e));
    }
}