package cw11;

import java.util.Objects;

public class ex6_1 {
    public static void main(String[] args) {
        String text = "Hello my name is Tima";
        if (Objects.equals(text, "")){
            System.out.println(args.length);
        }
        else{
            System.out.println(text.split(" ").length);
        }
    }
}
