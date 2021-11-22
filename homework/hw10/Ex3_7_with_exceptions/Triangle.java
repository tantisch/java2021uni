package hw10.Ex3_7_with_exceptions;
import java.lang.Math;


class TriangleSidesException extends Exception{
    public TriangleSidesException(String message){
        super(message);
    }
}

public class Triangle {

    public float side1, side2, side3;

    public Triangle (float s1, float s2, float s3) throws TriangleSidesException {
        side1 = s1;
        side2 = s2;
        side3 = s3;
        if (Float.compare(side1, 0) == 0 && (Float.compare(side2, 0) != 0 || Float.compare(side3, 0) != 0) ||
                Float.compare(side2, 0) == 0 && (Float.compare(side1, 0) != 0 || Float.compare(side3, 0) != 0) ||
                Float.compare(side3, 0) == 0 && (Float.compare(side2, 0) != 0 || Float.compare(side1, 0) != 0)){
            throw new TriangleSidesException("One of sides is len 0 in "  + this);
        }

        if(Float.compare(side1, 0) != 0) {
            if ((Float.compare(side1 + side2, side3) <= 0) || (Float.compare(side1 + side3, side2) <= 0) || (Float.compare(side3 + side2, side1) <= 0)) {
                throw new TriangleSidesException("Triangle is not valid: " + this);
            }
        }
    }



    public boolean is_right () {
        return ((Float.compare(side1 * side1, (side2 * side2) + (side3 * side3)) == 0) ||
                (Float.compare(side2 * side2, (side1 * side1) + (side3 * side3)) == 0) ||
                (Float.compare(side3 * side3, (side1 * side1) + (side2 * side2)) == 0));
    }

    public boolean is_scalene () {
        return (Float.compare(side1, side2) != 0 && Float.compare(side1, side3) != 0 && Float.compare(side2, side3) != 0);
    }

    public boolean is_isosceles () {
        return ((Float.compare(side1, side2) == 0 && Float.compare(side1, side3) != 0) ||
                (Float.compare(side1, side3) == 0 && Float.compare(side1, side2) != 0) ||
                (Float.compare(side2, side3) == 0 && Float.compare(side2, side1) != 0));
    }

    public boolean is_equilateral() {
        return (Float.compare(side1, side2) == 0 && Float.compare(side1, side3) == 0);
    }

    public float count_perimeter(){
        return side1 + side2 + side3;
    }

    public float count_area(){
        float p = (float) (count_perimeter() / 2.0);
        return (float) Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    @Override
    public String toString() {
        return String.format("Triangle with sides: %f, %f, %f", side1, side2, side3);
    }
}