package hw5;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ex1_22 {

    static int N = 30; // can be changed
    public static int x_curr = N / 2;
    public static int y_curr = N / 2;

    public static Scanner console = new Scanner(System.in);

    public static int Y = console.nextInt() - 2; // we already have 2 Ys in center



    public static void print_spiral(char[][] spiral) {
        for (int i = 0; i < N + 1; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%c ", spiral[i][j]);
            }
            System.out.println();
        }
    }

    public static int add_right(char[][] spiral, int amount_to_add) {
        for (int i = 0; i < amount_to_add; i++) {
            spiral[y_curr][x_curr++] = 'Y';
            if (Y-- == 0) return 1;
        }
        return 0;
    }

    public static int add_down(char[][] spiral, int amount_to_add) {
        for (int i = 0; i < amount_to_add; i++) {
            spiral[y_curr++][x_curr] = 'Y';
            if (Y-- == 0) return 1;
        }
        return 0;
    }

    public static int add_left(char[][] spiral, int amount_to_add) {
        for (int i = 0; i < amount_to_add; i++) {
            spiral[y_curr][x_curr--] = 'Y';
            if (Y-- == 0) return 1;
        }
        return 0;
    }

    public static int add_up(char[][] spiral, int amount_to_add) {
        for (int i = 0; i < amount_to_add; i++) {
            spiral[y_curr--][x_curr] = 'Y';
            if (Y-- == 0) return 1;
        }
        return 0;
    }

    // initial length of Y is 2; we can turn right every time our substring of Y is +1 length of previous one
    public static void main(String[] args) {

        if (Y > 462)
            throw new IllegalArgumentException("Y must be less than 465");

        char[][] spiral = new char[N + 1][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                spiral[i][j] = '.';
        }

        int y = Y + 2;

        // initializing two Ys in the center of the square
        spiral[y_curr][x_curr] = 'Y';
        spiral[y_curr + 1][x_curr] = 'Y';

        int amount_to_add = 2; // amount to add Y after every turn (increases by 1 with every turn right)

        while (true) {
            if (add_right(spiral, amount_to_add++) == 1) break;
            if (add_down(spiral, amount_to_add++) == 1) break;
            if (add_left(spiral, amount_to_add++) == 1) break;
            if (add_up(spiral, amount_to_add++) == 1) break;
        }

        print_spiral(spiral);
        System.out.println("spiral is built out of " + y + " Ys");

    }
}