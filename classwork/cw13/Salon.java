package cw13;

import java.util.Arrays;
import java.io.Serializable;
import java.util.Objects;

public class Salon implements Serializable{

    public Client[] clients = new Client[1];

    public Salon() {
    }

    public Salon( Client[] clients) {
        this.clients = clients;
    }

    public int add_client(Client client){
        if (clients[0] == null){
            clients[0] = client;
            return 0;
        }
        for(int i = 0; i<this.clients.length; i++){
            if(Objects.equals(this.clients[i].pass_number, client.pass_number)){
                this.clients[i].phone_numbers = Arrays.copyOf(this.clients[i].phone_numbers, this.clients[i].phone_numbers.length + 1);
                this.clients[i].phone_numbers[this.clients[i].phone_numbers.length - 1] = client.phone_numbers[0];
                return 0;
            }
        }
        this.clients = Arrays.copyOf(this.clients, this.clients.length + 1);
        this.clients[this.clients.length - 1] = client;
        return 0;

    }




}