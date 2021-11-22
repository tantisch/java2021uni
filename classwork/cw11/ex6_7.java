package cw11;

import java.util.Scanner;

public class ex6_7 {
    public static void main(String[] args) {
        String text;
//        text = "Hello, my name is Tima! And what is your name? ."
        if (args.length != 0){
            text = String.join(" ", args);
        }
        else{
            Scanner sc = new Scanner(System.in);
            text = sc.nextLine();
        }

        String sentence_reg_exp = "((\\b\\w+\\b[, ]{1,2})+(\\b\\w+\\b[.?]))+";
        String word_reg_exp = "\\b\\w+\\b";
        String symbolRegExp = ".";
        String spec_symbol_reg_exp = "[,.?]";
        String res_str;

        res_str = text.replaceAll(symbolRegExp, "#");
        long symbolsNumber = res_str.chars().filter(ch -> ch == '#').count();

        res_str = text.replaceAll(word_reg_exp, "#");
        long wordsNumber = res_str.chars().filter(ch -> ch == '#').count();

        res_str = text.replaceAll(sentence_reg_exp, "#");
        long sentencesNumber = res_str.chars().filter(ch -> ch == '#').count();

        res_str = text.replaceAll(spec_symbol_reg_exp, "#");
        long specSymbolsNumber = res_str.chars().filter(ch -> ch == '#').count();

        System.out.println("symbols: " + symbolsNumber);
        System.out.println("words: " + wordsNumber);
        System.out.println("sentences: " + sentencesNumber);
        System.out.println("special symbols: " + specSymbolsNumber);
    }
}
