import java.util.Scanner;
import java.lang.Math;

public class made_up_ex{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();

        if (Math.pow(a, 8) > Integer.MAX_VALUE || Math.pow(a, 8) < Integer.MIN_VALUE) {
            throw new ArithmeticException("integer overflow");
        }
        else{
            System.out.println(Math.pow(a, 8));
        }

    }
}