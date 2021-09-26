import java.util.*;

public class ex2_16{
    /**
     * <p>
     *     Program that counts the amount of 1s at the same position and the amount of similar bits in two numbers
     * </p>
     *
     * @param args array of strings
     */

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int a = console.nextInt();
        int b = console.nextInt();

        String as = Integer.toBinaryString(a);
        String bs = Integer.toBinaryString(b);

        String reversed_as = new StringBuffer(as).reverse().toString();
        String reversed_bs = new StringBuffer(bs).reverse().toString();

        String mins = (as.length() < bs.length())? as : bs;

        int count_one = 0;
        int count_similar = 0;

        System.out.println(as);
        System.out.println(bs);

        for(int i = 0; i < mins.length(); i += 1){
            if (reversed_as.charAt(i) == reversed_bs.charAt(i)) {
                count_similar += 1;
                if (reversed_as.charAt(i) == '1'){
                    count_one += 1;
                }
            }
        }

        System.out.println("amount of 1 in the same position: " + count_one);
        System.out.println("amount of bits in the same position: " + count_similar);
    }
}
