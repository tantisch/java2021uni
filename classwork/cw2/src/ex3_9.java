import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class ex3_9{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double a1 = console.nextDouble();
        double a2 = console.nextDouble();

        double difference = a1 - a2;
        double mult = a1 * a2;

        System.out.printf("difference: %.1f, multiplication: %.1f", difference, mult);
    }
}