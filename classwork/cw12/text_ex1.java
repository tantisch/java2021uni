package cw12;

import java.io.*;
import java.util.Scanner;

public class text_ex1 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/cw12/text_ex1_txt.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));
        String text = "";
        String line;
        while ((line = br.readLine()) != null) {
            text += line + " ";
        }
        System.out.println(text);

        // a
        String[] words = text.split(" ");
        int len = words.length;

        //b
        String max_w = "";
        for (String s: words){
            if (max_w.length() < s.length()) max_w = s;
        }

        //c
        FileWriter fw = new FileWriter(file);
        text = text.replaceAll("  ", " ");
        text = text.replaceAll("  ", " ");
        for(String word: words){
            if (word.length() == 1) text = text.replace(" " + word + " ", " ");
        }
        fw.write(text);
        fw.close();

        //d
        String text1 = text;
        if (text1.charAt(0) == ' ') text1 = text1.replace(" ", "");
        FileWriter fw1 = new FileWriter(file);
        for(String word: words){
            if (word.length() == 1) text = text.replace(" " + word + " ", " ");
        }
        fw1.write(text);
        fw1.close();


        System.out.println("a) " + len);
        System.out.println("b) " + max_w);
        System.out.println("c) " + text);
        System.out.println("d) " + text);

    }
}

