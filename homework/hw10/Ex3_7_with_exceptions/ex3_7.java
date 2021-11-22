package hw10.Ex3_7_with_exceptions;

public class ex3_7{
    public static void main(String[] args) throws TriangleSidesException {
        Triangle[] triangles = new Triangle[]{ new Triangle(0, 0, 0), new Triangle(4, 6, 4), new Triangle(5, 5, 5), new Triangle(3, 4, 5), new Triangle(2, 2, 4), new Triangle(6, 6, 6)};
        int right = 0;
        int ind_of_biggest_area_right = 0;
        int scalene = 0;
        int ind_of_biggest_area_scalene = 0;
        int isosceles = 0;
        int ind_of_biggest_area_isosceles = 0;
        int equilateral = 0;
        int ind_of_biggest_area_equilateral = 0;

        for(int i = 0; i < triangles.length; i++){
            if (triangles[i].is_right()){
                right++;
                if (triangles[i].count_area() >= triangles[ind_of_biggest_area_right].count_area()){
                    ind_of_biggest_area_right = i;
                }
            }

            else if (triangles[i].is_scalene()){
                scalene++;
                if (triangles[i].count_area() >= triangles[ind_of_biggest_area_scalene].count_area()){
                    ind_of_biggest_area_scalene = i;
                }
            }

            else if (triangles[i].is_isosceles()){
                isosceles++;
                if (triangles[i].count_area() >= triangles[ind_of_biggest_area_isosceles].count_area()){
                    ind_of_biggest_area_isosceles = i;
                }
            }

            else if (triangles[i].is_equilateral()){
                equilateral++;
                if (triangles[i].count_area() >= triangles[ind_of_biggest_area_equilateral].count_area()){
                    ind_of_biggest_area_equilateral = i;
                }
            }
        }

        System.out.println("Amount of right triangles: " + right);
        System.out.println("Amount of scalene triangles: " + scalene);
        System.out.println("Amount of isosceles triangles: " + isosceles);
        System.out.println("Amount of equilateral triangles: " + equilateral);

        System.out.println("Biggest area of right triangles has: " + triangles[ind_of_biggest_area_right]);
        System.out.println("Biggest area of scalene triangles has: " + triangles[ind_of_biggest_area_scalene]);
        System.out.println("Biggest area of isosceles triangles has: " + triangles[ind_of_biggest_area_isosceles]);
        System.out.println("Biggest area of equilateral triangles has: " + triangles[ind_of_biggest_area_equilateral]);
    }
}