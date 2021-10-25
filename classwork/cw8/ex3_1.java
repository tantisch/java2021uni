package cw8;

import cw8.RationalNumber.*;

public class ex3_1{
    public static void main(String[] args) {
        RationalNumber[] mass = {new RationalNumber(1,2), new RationalNumber(2,3), new RationalNumber(3,4)};
        RationalNumber res = mass[0];
        for (RationalNumber r: mass){
            System.out.println(r);
        }
        for (int i = 1; i < mass.length; i++){
            res = res.add(mass[i]);
        }
        System.out.println("answer of sum: " + res);
    }
}