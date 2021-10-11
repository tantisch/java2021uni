package cw6;

class StrClass{
    String s;
    StrClass(){}
    void print(){
        System.out.println(s);
    }
}

public class ex3_1{
    public static void main(String[] args) {
        StrClass s = new StrClass();
        s.print();
    }
}