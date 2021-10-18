package hw6;

import java.util.Random;
import java.util.*;

class Matrix {
    int[][] matrix;
    int n, m;
    Scanner console;

    Matrix() {
        this.console = new Scanner(System.in);
        System.out.println("enter dimension of the matrix: ");
        this.n = console.nextInt();
        this.m = console.nextInt();
        this.matrix = new int[n][m];
        System.out.println("Please, choose a way of creating a matrix.\ne - enter; r - random ");
        char way_of_input = console.next().charAt(0);
        if (way_of_input == 'e') matrix_enter();
        else matrix_random();
    }

    void matrix_enter() {
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) {
                System.out.printf("enter x%d y%d: ", i, j);
                this.matrix[i][j] = console.nextInt();
            }
        }
    }

    void matrix_random() {
        Random random = new Random();
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) {
                this.matrix[i][j] = random.nextInt(90) + 10;
            }
        }
    }

    void print() {
        System.out.println();
        for (int[] row : this.matrix) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }


    void delete_row_and_col_where_max() {
        // finding max element in matrix1
        int max = 0;
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) {
                if (this.matrix[i][j] > max) max = this.matrix[i][j];
            }
        }
        System.out.println("Max element: " + max);

        HashSet<Integer> rows_to_delete = new HashSet<>();
        HashSet<Integer> columns_to_delete = new HashSet<>();

        for (int r = 0; r < this.n; r++) {
            for (int c = 0; c < this.m; c++) {
                if (this.matrix[r][c] == max) {
                    rows_to_delete.add(r);
                    columns_to_delete.add(c);
                }
            }
        }

        System.out.println("rows to delete: " + rows_to_delete);
        System.out.println("columns to delete: " + columns_to_delete);

        int rows_to_leave = this.n - rows_to_delete.size();
        int[][] matrix1 = new int[rows_to_leave][];

        for (int r = 0, i = 0; r < this.n; r++)
            if (!rows_to_delete.contains(r)) matrix1[i++] = this.matrix[r];

        this.n = rows_to_leave;


        int columns_to_leave = this.m - columns_to_delete.size();
        int[][] matrix2 = new int[this.n][columns_to_leave];
        for (int r = 0; r < this.n; r++) {
            for (int c = 0, j = 0; c < matrix1[r].length; c++) {
                if (!columns_to_delete.contains(c)) matrix2[r][j++] = matrix1[r][c];
            }
        }

        this.m = columns_to_leave;

        this.matrix = matrix2;
    }
}

public class ex2_10 {
    public static void main(String[] args) {
        Matrix m = new Matrix();
        m.print();
        m.delete_row_and_col_where_max();
        m.print();
    }
}