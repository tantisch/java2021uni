package cw1;

public class ex1_6 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += Double.parseDouble(args[i]);
        }
        System.out.println("sum=" + sum);
    }
}
