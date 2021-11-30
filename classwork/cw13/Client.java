package cw13;

import java.util.Arrays;

public class Client {
    public String name;
    public String pass_number;
    public String[] phone_numbers;

    Client(){

    }
    Client(String name, String pass_number, String[] phone_numbers){
        this.name = name;
        this.pass_number = pass_number;
        this.phone_numbers = phone_numbers;
    }

    public String toString(){
        return this.name + " " + this.pass_number + " " + Arrays.toString(this.phone_numbers);
    }
}
