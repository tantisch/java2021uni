import java.util.Scanner;


public class ex3_4{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (a == b && b == c){
            System.out.println(1);
        }
        else if (a == b || a == c || b == c){
            System.out.println(2);
        }
        else{
            System.out.println(3);
        }
    }
}