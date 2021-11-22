package cw12;

import java.io.*;
import java.util.Scanner;

public class bin_ex1 {
    public static void main(String[] args) throws IOException {

        double[] ar = {4.6234, 6.2345625, 4.236};
        DataOutputStream out = new DataOutputStream(new FileOutputStream("src/cw12/bin_ex1_txt_in.txt"));
        for(double d: ar){
            out.writeDouble(d);
        }

        DataInputStream in = new DataInputStream(new FileInputStream("src/cw12/bin_ex1_txt_in.txt"));
        double sum = 0.0;
        while(in.available() > 0) {
            sum += in.readDouble();
            System.out.println(sum);
        }

        DataOutputStream out1 = new DataOutputStream(new FileOutputStream("src/cw12/bin_ex1_txt_out.txt"));
        out1.writeDouble(sum);
        System.out.println(sum);
    }
}
