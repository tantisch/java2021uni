package cw11;

import java.util.Locale;
import java.util.Scanner;

public class ex6_8 {
    public static void main(String[] args) {
        String text;
//        text = "Hello, my name is Tima! And what is your name? .";
        if (args.length != 0){
            text = String.join(" ", args);
        }
        else{
            Scanner sc = new Scanner(System.in);
            text = sc.nextLine();
        }
        System.out.println("Depends on register[y/n]:");
        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().charAt(0);
        System.out.println("word to find:");
        String word = sc.nextLine();
        int res = -1;
        if (c == 'y') {
            res = text.indexOf(word);
        } else if (c == 'n') {
            res = Math.max(text.indexOf(word.toLowerCase()), text.indexOf(word.toUpperCase()));
        }
        String out_str = (res != -1) ? "Word exists" : "Word doesn't exist";
        System.out.println(out_str);


    }
}
