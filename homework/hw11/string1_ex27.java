package hw11;

public class string1_ex27{
    public static void main(String[] args) {
        String s = "";
        String s1 = "alskjf2355&%#*";
        String s2 = ";mve0091al;`";

        // a
        // build s as symbols that are in s1 that dont exist in s2
        for(int i=0; i<s1.length(); i++){
            String c = Character.toString(s1.charAt(i));
            if (!s2.contains(c)) s += c;
        }

        System.out.println("a) " + s);

        s = "";

        // b
        // build s as symbols that are in s1 and not in s2, and that are in s2 and not in s1
        for(int i=0; i<s1.length(); i++){
            String c = Character.toString(s1.charAt(i));
            if (!s2.contains(c)) s += c;
        }
        for(int i=0; i<s2.length(); i++){
            String c = Character.toString(s2.charAt(i));
            if (!s1.contains(c)) s += c;
        }

        System.out.println("b) " + s);

    }
}