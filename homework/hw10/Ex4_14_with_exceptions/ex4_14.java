package hw10.Ex4_14_with_exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ex4_14{

    public static void check_collinearity(Vector a, Vector b){
        if(a.cross(b).eq(new Vector())) System.out.println("\n" + a + " and " + b + " are collinear");
        else System.out.println("\n" + a + " and " + b + " are not collinear");
    }

    public static void check_orthogonality(Vector a, Vector b){
        if(a.dot(b) == 0) System.out.println(a + " and " + b + " are orthogonal\n");
        else System.out.println(a + " and " + b + " are not orthogonal\n");
    }


    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter how many vectors in array you want to have");
        int n = 0;
        try {
            n = console.nextInt();
            console.nextLine();
        }
        catch (InputMismatchException e){
            throw new Exception("The amount of vectors is an int number");
        }

        Vector[] vectors = new Vector[n];

        System.out.println("Enter i if you want to input or r to make it random: ");
        char way_of_input = console.nextLine().charAt(0);

        for(int i = 0; i < n; i++){
            vectors[i] = new Vector();
            if(way_of_input == 'r') vectors[i].create_random();
            else vectors[i].create_input();
            System.out.println(vectors[i]);
        }

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                check_collinearity(vectors[i], vectors[j]);
                check_orthogonality(vectors[i], vectors[j]);
            }
        }

    }
}

