package cw13;

import java.util.Arrays;

public class ex_salon {

    public static void print_client(Salon salon) {
        for (Client c : salon.clients) {
            System.out.println(c.name + " " + c.pass_number + " " + Arrays.toString(c.phone_numbers));
        }
    }

    public static void main(String[] args) {
        int n = 5;
        Salon salon = new Salon();
        salon.add_client(new Client("Ivanov Ivan", "305128", new String[]{"89112223355"}));
        salon.add_client(new Client("Ivanov Ivan", "305002", new String[]{"89112223356"}));
        salon.add_client(new Client("Ivanov Ivan", "305128", new String[]{"89112223388"}));
        salon.add_client(new Client("Ivanov Ivan", "305128", new String[]{"89112223899"}));
        salon.add_client(new Client("Ivanov Ivan", "305128", new String[]{"89112223800"}));

        print_client(salon);
    }

}