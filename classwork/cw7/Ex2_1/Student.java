package cw7.Ex2_1;
import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private int course;
    private String faculty;
    private String date;

    public Student(){
    }

    public Student(int id, String name, int course, String faculty, String date) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.faculty = faculty;
        this.date = date;
    }

    public void input(Scanner console){
        System.out.println("input id: ");
        this.id = console.nextInt();
        System.out.println("input course: ");
        this.course = console.nextInt();
        console.nextLine();
        System.out.println("input name: ");
        this.name = console.nextLine();
        System.out.println("input faculty: ");
        this.faculty = console.nextLine();
        System.out.println("input date: ");
        this.date = console.nextLine();
    }

    public String to_string(){
        return String.format("\nStudent:\nname - %s\ncourse - %d\nfaculty - %s\ndate of birth - %s\n", this.name, this.course, this.faculty, this.date);
    }

    public void show(){
        System.out.println(to_string());
    }

    public String get_faculty(){
        return this.faculty;
    }

    public int get_course(){
        return this.course;
    }

    public String get_date(){
        return this.date;
    }
}
