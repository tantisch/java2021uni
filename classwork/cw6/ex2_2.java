package cw6;
import cw6.Matrix;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class ex2_2 {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.matrix_random();
        matrix.print();
        matrix.cycle_shift("down", 4);
    }
}