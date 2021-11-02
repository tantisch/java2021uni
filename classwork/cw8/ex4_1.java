package cw8;

import cw8.Polynom;

public class ex4_1{
    public static void main (String[] args){
        RationalNumber[] coeffs1 = {
                new RationalNumber(1,3),
                new RationalNumber(2,4),
                new RationalNumber(3,4)};
        Polynom p1 = new Polynom(coeffs1);

        RationalNumber[] coeffs2 = {
                new RationalNumber(2,3),
                new RationalNumber(3,4),
                new RationalNumber(4,4)};
        Polynom p2 = new Polynom(coeffs2);  

        System.out.println(p1);
        System.out.println(p2);

        Polynom p3 = p1.add(p2);
        System.out.println("answer of sum: " + p3);
    }
}