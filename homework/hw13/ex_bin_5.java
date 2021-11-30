package hw13;

import java.io.*;
import java.util.Scanner;


public class ex_bin_5 {
    public static void main(String[] args) throws IOException {

        int[] ar = {1, 532, 236, 345, 645, 232, 344, 21,2, 64, 234234};

        DataOutputStream in = new DataOutputStream(new FileOutputStream("src/hw13/F.txt"));
        for(int d: ar){
            in.writeInt(d);
        }
        in.close();


        DataInputStream F = new DataInputStream(new FileInputStream("src/hw13/F.txt"));
        DataOutputStream G = new DataOutputStream(new FileOutputStream("src/hw13/G.txt"));

        int counter = in.size()/4;
        int[] values = new int[counter];
        for(int i = 0; i < counter; i++){
            values[i] = F.readInt();
        }
        F.close();

        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();


        int div = values.length/n;
        // if divisible
        if((values.length%n) == 0){
            for(int i = 0; i < div; i++){
                int temp_max = Integer.MIN_VALUE;
                for(int j = n*i; j < n*i + n;j++){
                    if(temp_max < values[j]) temp_max = values[j];
                }
                System.out.println(temp_max);
                G.writeInt(temp_max);
            }
        }
        // else if not divisible
        else{
            for(int i = 0; i < div; i++){
                int temp_max = Integer.MIN_VALUE;
                for(int j = n*i; j < n*i + n;j++){
                    if(temp_max < values[j]) temp_max = values[j];
                }
                System.out.println(temp_max);
                G.writeInt(temp_max);
            }
            int last = (values.length%n),count = 0,last_temp=Integer.MIN_VALUE;
            while(count < last){
                count++;
                if(values[values.length-count] > last_temp) last_temp = values[values.length-count];
            }
            System.out.println(last_temp);
            G.writeInt(last_temp);
        }
        G.close();
    }
}
