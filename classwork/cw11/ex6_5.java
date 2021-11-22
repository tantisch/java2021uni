package cw11;

public class ex6_5 {
    public static void main(String[] args) {
        String s = "he has a large house but a small car";
        String[] to_replace = {"small", "large"};
        for (String st: to_replace) {
            s = s.replaceAll(st, "very " + st);
        }
        System.out.println(s);
    }
}
