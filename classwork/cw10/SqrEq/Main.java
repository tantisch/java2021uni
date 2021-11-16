package cw10.SqrEq;

import java.util.InputMismatchException;


public class Main {
    public static void main(String[] args) {
        double a, b, c;

        IOTool io = new IOTool();

        try {
            SqrEq qadr1 = new SqrEq(2, -6, 4);
            qadr1.solution();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        try {
            SqrEq qadr2 = new SqrEq(1, 2, 3);
            qadr2.solution();
        } catch (DiscriminantEqException e) {
            e.printStackTrace();
        }

        try {
            SqrEq qadr3 = new SqrEq(0, 2, 3);
            qadr3.solution();
        } catch (SqrEqException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Input a, b, c:");
            a = io.readDouble();
            b = io.readDouble();
            c = io.readDouble();

            SqrEq qadr = new SqrEq(a, b, c);
            qadr.solution();
            qadr.printRoots();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}