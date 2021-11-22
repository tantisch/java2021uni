package cw11;

import java.util.Scanner;

public class ex_6_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuffer sb = new StringBuffer(s);
        sb.append(", that we use to illustrate the methods of class StringBuffer");
        System.out.println(sb.toString());
    }
}