package cw5;
import java.util.Scanner;

public class ex1_2{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String s = console.nextLine();
        String[] array = s.split(" ");
        int max = -2147483647;
        int min = 2147483647;
        for (String a : array){
            int an = Integer.parseInt(a);
            if (an > max) max = an;
            if (an < min) min = an;
        }
        System.out.println(max);
        System.out.println(min);
    }
}