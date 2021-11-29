package cw13;

import java.io.*;
import java.util.Arrays;
import java.util.Objects;


public class  ex_student{

    public static Student[] add_student(Student[] students, Student student){
        students = Arrays.copyOf(students, students.length + 1);
        students[students.length - 1] = student;
        return students;
    }

    public static void add_to_bin_file(String filename, Student[] students) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
        oos.writeObject(students);
        oos.close();
    }

    public static void read_from_students_file(String filename) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
        Student[] ia = (Student[]) (ois.readObject());
        System.out.println("Data added to binary file:");
        for(Student s: ia){
            System.out.println(s);
        }
        ois.close();
    }

    public static void read_from_student_file(String filename) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
        Student ia = (Student) (ois.readObject());
        System.out.println(ia);
        ois.close();
    }


    public static void find_by_name_and_add_to_another_file(String filename, String name) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
        Student[] students = (Student[]) (ois.readObject());
        System.out.println("Data added to binary file:");
        for(Student s: students){
            if(Objects.equals(s.name, name)){
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(name + ".dat"));
                oos.writeObject(s);
                oos.close();
                break;
            }
        }
        ois.close();
    }

    public static void find_worst(String filename) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
        Student[] students = (Student[]) (ois.readObject());
        Student worst = students[0];
        for(Student s: students){
            if(s.average_mark() < worst.average_mark()) worst = s;
            }
        System.out.println("Worst student:");
        System.out.println(worst);
        ois.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student[] students = new Student[]{new Student("15", "Tima", 6, new int[]{5, 5, 5, 5, 5, 5}),
                                           new Student("12", "Igor", 4, new int[]{5, 2, 3, 4, 5, 2}),
                                           new Student("25", "Artur", 5, new int[]{5, 4, 3, 5, 4, 2})};
        add_to_bin_file("students_bin.dat", students);
        read_from_students_file("students_bin.dat");

        students = add_student(students, new Student("52", "Andrii", 6, new int[]{4, 4, 5, 4, 5, 4}));

        add_to_bin_file("students_bin.dat", students);
        read_from_students_file("students_bin.dat");

        System.out.println();

        find_by_name_and_add_to_another_file("students_bin.dat", "Tima");
        read_from_student_file("Tima.dat");

        System.out.println();

        find_worst("students_bin.dat");

    }
}
