package cw5;
import java.util.Scanner;

public class ex1_4{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String s = console.nextLine();
        String[] arrays = s.split(" ");
        int[] array = new int[arrays.length];
        for(int i=0; i<array.length; i++){
            array[i] = Integer.parseInt(arrays[i]);
        }

        int max_len_of_same = 1;
        int len_of_same = 1;
        int num_same = 0;

        for(int i=1; i<array.length; i++){
            if (array[i] != array[i-1]){
                if (max_len_of_same < len_of_same){
                    max_len_of_same = len_of_same;
                    num_same = array[i-1];
                }
                len_of_same = 1;
            }
            else len_of_same++;
        }
        System.out.println(max_len_of_same);
        System.out.println(num_same);
    }
}