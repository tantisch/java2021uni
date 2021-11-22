package cw11;

public class ex6_4 {
    public static void main(String[] args) {
        String s = "i have an apple but i don't have a car";
        s = s.replaceAll(" a ", " ");
        s = s.replaceAll(" an ", " ");
        System.out.println(s);
    }
}
