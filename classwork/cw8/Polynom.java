package cw8;
import cw8.RationalNumber.*;
import java.util.Arrays;

public class Polynom {
    private RationalNumber[] coefficients;

    public Polynom(){}

    public Polynom(RationalNumber[] coefficients){
        this.coefficients = coefficients;
    }

    public int get_pol_len(){
        return this.coefficients.length;
    }

    public Polynom add(Polynom other){
        int pol_len = get_pol_len();
        RationalNumber[] res_coeffs = new RationalNumber[pol_len];
        for (int i = 0; i < pol_len; i++){
            res_coeffs[i] = RationalNumber.add(this.coefficients[i], other.coefficients[i]);
        }

        return new Polynom(res_coeffs);
    }

    @Override
    public String toString() {
        String ans_str = "";
        for(int i = 0; i < this.coefficients.length-1; i++){
            ans_str += String.format("%s * x^%d + ", this.coefficients[i].toString(), i);
        }
        ans_str += String.format("%s * x^%d", this.coefficients[this.coefficients.length-1].toString(), this.coefficients.length-1);
        return ans_str;
    }
}