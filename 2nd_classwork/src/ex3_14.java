import java.util.Scanner;

public class ex3_14{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String a = console.nextLine();
        String a1 = a.substring(0, 10);
        String a2 = a.substring(10, 20);

        long n1 = Long.parseLong(a1);
        long n2 = Long.parseLong(a2);

        System.out.println(n1);
        System.out.println(n2);
        System.out.println("Sum: " + (n1 + n2));

    }
}