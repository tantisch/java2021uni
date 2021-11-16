package cw10.Ex7_1;


public class ex7_1 {
    public static void main(String[] args) {
        Dictionary d1 = new Dictionary("Dictionary", 1000, "A1, B1", 123.45f, "english", "rus", 100000);
        Encyclopedia e1 = new Encyclopedia("Encyclopedia", 10000, "R1", 1123.45f, 100000);

        System.out.println(d1);
        System.out.println(e1);
    }
}
