package hw8;

import hw8.Triangle;

public class ex3_7{
    public static void main(String[] args){
        Triangle[] triangles = new Triangle[]{new Triangle(1, 2, 3), new Triangle(5, 5, 5), new Triangle(3, 4, 5), new Triangle(2, 2, 4), new Triangle(6, 6, 6)};
        int right = 0;
        int scalene = 0;
        int isosceles = 0;
        int equilateral = 0;
        for(Triangle t: triangles){
            if (t.is_right()) right++;
            else if (t.is_scalene()) scalene++;
            else if (t.is_isosceles()) isosceles++;
            else if (t.is_equilateral()) equilateral++;
        }
        System.out.println("Amount of right triangles: " + right);
        System.out.println("Amount of scalene triangles: " + scalene);
        System.out.println("Amount of isosceles triangles: " + isosceles);
        System.out.println("Amount of equilateral triangles: " + equilateral);
    }
}