import java.math.BigDecimal;
import java.util.Scanner;

public class ex3_13{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        BigDecimal a = console.nextBigDecimal();
        BigDecimal b = a.pow(8);
        System.out.printf("%20.4f", b);

    }
}
