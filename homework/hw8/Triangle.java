package hw8;
import java.lang.Math;

public class Triangle {

    public float side1, side2, side3;

    public Triangle (float s1, float s2, float s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    public boolean is_right () {
        return ((side1 * side1) == ((side2 * side2) + (side3 * side3))) ||
                ((side2 * side2) == ((side1 * side1) + (side3 * side3))) ||
                ((side3 * side3) == ((side1 * side1) + (side2 * side2)));
    }

    public boolean is_scalene () {
        return (side1 != side2) && (side1 != side3) && (side2 != side3);
    }

    public boolean is_isosceles () {
        return ((side1 == side2) && (side1 != side3)) ||
                ((side1 == side3) && (side1 != side2)) ||
                ((side2 == side3) && (side2 != side1));
    }

    public boolean is_equilateral () {
        return (side1 == side2) && (side1 == side3);
    }

    public float count_perimeter(){
        return side1 + side2 + side3;
    }

    public float count_area(){
        float p = (float) (count_perimeter() / 2.0);
        return (float) Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));

    }
}
