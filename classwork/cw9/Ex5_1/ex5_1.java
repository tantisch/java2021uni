package cw9.Ex5_1;

public class ex5_1{
    public static void main (String[] args){
        Text text = new Text(new String[]{"Hello my friend. ", "My name is Tima. ", "What is your name? "});
        text.set_header(new Sentence("header of this Text"));
        text.print_header();
        System.out.println(text);
    }
}