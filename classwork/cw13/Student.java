package cw13;

import java.util.Arrays;
import java.io.Serializable;

public class Student implements Serializable{

    public String rollNumber;
    public String name;
    public int amount_of_pass;
    public int[] marks;

    public Student() {
        this.rollNumber = "";
        this.name = "name";
        this.amount_of_pass = 0;
        this.marks = new int[]{0, 0, 0, 0, 0, 0};
    }

    public Student(String rollNumber, String name, int amount_of_pass, int[] marks) {

        this.rollNumber = rollNumber;
        this.name = name;
        this.amount_of_pass = amount_of_pass;
        this.marks = marks;
    }

    public int average_mark(){
        int average = 0;
        for(int m: marks){
            average += m;
        }
        return average / 6;
    }


    public String toString(){
        return "[" +
                this.rollNumber +
                " : " +
                this.name +
                " : " +
                this.amount_of_pass +
                " : " +
                Arrays.toString(this.marks) +
                "]";
    }

}