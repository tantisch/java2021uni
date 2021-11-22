package hw10.Ex4_14_with_exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;


class VectorException extends Exception{
    public VectorException(String message){
        super(message);
    }
}


public class Vector {
    public double x, y, z;
    public static Scanner console = new Scanner(System.in);
    public static Random random = new Random();

    public Vector(){
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
    }

    public void input() throws VectorException {

        System.out.println("Enter i if you want to input or r to make it random: ");
        char s = console.nextLine().charAt(0);
        if(s == 'r') create_random();
        else create_input();
    }

    public void create_input() throws VectorException {
        System.out.println("Enter x, y, z: ");
        try {
            this.x = console.nextDouble();
            this.y = console.nextDouble();
            this.z = console.nextDouble();
        }
        catch (InputMismatchException e){
            throw new VectorException("You had to enter double");
        }
    }

    public void create_random(){

        this.x = (double)(int)(random.nextDouble() * 10);
        this.y = (double)(int)(random.nextDouble() * 10);
        this.z = (double)(int)(random.nextDouble() * 10);

    }

    public Vector(double x, double y, double z ){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public boolean eq(Vector b){
        return this.x == b.x && this.y == b.y && this.z == b.z;
    }

    Vector add( Vector b ){
        return new Vector( this.x + b.x, this.y + b.y, this.z + b.z );
    }

    Vector sub( Vector b ){
        return new Vector( this.x - b.x, this.y - b.y, this.z - b.z );
    }

    Vector scale( double k ){
        return new Vector( this.x * k, this.y * k, this.z * k );
    }

    double dot( Vector b ){
        return this.x * b.x + this.y * b.y +  this.z * b.z;
    }

    double length(){
        return Math.sqrt( this.x*this.x + this.y*this.y + this.z*this.z );
    }

    Vector cross( Vector b ){
        return new Vector(
                this.y*b.z - this.z*b.y,
                this.z*b.x - this.x*b.z,
                this.x*b.y - this.y*b.x
        );
    }

    @Override
    public String toString(){
        return "( " + this.x + ", " + this.y + ", " + this.z + " )";
    }
}