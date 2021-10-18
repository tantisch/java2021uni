package cw7;

class Class_ex1_4 {
    protected int a = 5;
}

class Class2 extends Class_ex1_4 {
    void change_a(){
        System.out.println(a);
        a = 15;
        System.out.println(a);
    }
}

public class ex1_4{
    public static void main(String[] args) {
        Class2 cl = new Class2();
        cl.change_a();
    }
}
