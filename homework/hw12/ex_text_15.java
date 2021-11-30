package hw12;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;
import java.lang.Math;

public class ex_text_15{

    public static void a(Cube[] cubes){
        int red = 0, green = 0, blue = 0, yellow = 0;
        int total_volume = 0;
        for(Cube cube: cubes){
            if (Objects.equals(cube.color, "red")) red += 1;
            else if (Objects.equals(cube.color, "green")) green += 1;
            else if (Objects.equals(cube.color, "blue")) blue += 1;
            else if (Objects.equals(cube.color, "yellow")) yellow += 1;

            total_volume += Math.pow(cube.side, 3);
        }
        System.out.printf("There are %d red, %d green, %d blue and %d yellow cubes\n", red, green, blue, yellow);
        System.out.println("Total volume of cubes is: " + total_volume);
    }

    public static void b(Cube[] cubes){
        int wood3 = 0, metal5 = 0;
        for(Cube cube: cubes){
            if (Objects.equals(cube.material, "wood") && cube.side == 3) wood3 += 1;
            else if (Objects.equals(cube.material, "metal") && cube.side > 5) metal5 += 1;
        }
        System.out.printf("There are %d wood cubes with the side 3\n", wood3);
        System.out.printf("There are %d metal cubes with the side more than 5", metal5);
    }

    public static void main(String[] args) throws IOException {
        File file = new File("src/hw12/cubes_info.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));
        Cube[] cubes = new Cube[5];
        int i = 0;

        String line;
        while ((line = br.readLine()) != null) {
            String[] ls = line.split(" ");
            cubes[i] = new Cube(Integer.parseInt(ls[0]), ls[1], ls[2]);
            System.out.println(cubes[i]);
            i++;
        }
        br.close();
        System.out.println();
        System.out.println("a");
        a(cubes);
        System.out.println("\nb");
        b(cubes);

    }
}