package cw6;

class Class{
    String s = "hello";
    String s2;
    public Class(){
        s2 = "hello";
    }
    void print(){
        System.out.println(s);
        System.out.println(s2);
    }
}

public class ex3_2{
    public static void main(String[] args) {
        Class c = new Class();
        c.print();
    }
}