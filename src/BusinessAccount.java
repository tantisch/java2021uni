package src;

import src.Account;

public class BusinessAccount extends Account {
    private String client_name;
    private int money;
    private int credit_money;
    private final String type = "Business Account";

    public BusinessAccount(String name, int m, int cm){
        this.client_name = name;
        this.money = m;
        this.credit_money = cm;
    }

    public String get_client_name(){
        return this.client_name;
    }

    public int get_money(){
        return this.money;
    }

    public void put_money(int m){
        this.money += m;
        System.out.println("Your account has been successfully replenished by: " + money + "\n");
    }

    public int get_credit_money(){
        return this.credit_money;
    }

    public int withdraw(int m){
        if (m > this.money){
            System.out.println("You don't have that amount in this account");
            return 0;
        }
        else {
            this.money -= m;
            System.out.println("\nYou successfully withdrew: " + m + "\n");
            return 1;
        }
    }

    public int pay(int m){
        if (m > this.money){
            System.out.println("You don't have that amount in this account");
            return 0;
        }
        else {
            this.money -= m;
            System.out.println("\nYou successfully paid: " + m + "\n");
            return 1;
        }
    }

    public int take_credit(int m){
        if (this.credit_money != 0){
            System.out.println("You can't take another credit because you already have one: " + this.credit_money+ "\n");
            return 0;
        }
        else{
            this.credit_money = m;
            System.out.println("You successfully took a credit of " + m + "\n");
            return 1;
        }
    }

    public int pay_for_credit(int m) {
        if (this.credit_money == 0){
            System.out.println("You don't have any credits to pay for\n");
            return 0;
        }
        else if (m > this.money){
            System.out.println("You don't have enough funds in your account to pay for credit " + m+ "\n");
            return 0;
        }
        else if (m > this.credit_money) {
            this.money -= this.credit_money;
            this.credit_money = 0;
            System.out.println("Credit money successfully paid"+ "\n");
            return 1;
        }
        else{
            int tmp = this.credit_money;
            this.credit_money -= m;
            this.money -= m;
            System.out.println(m + " of your " + tmp + " credit money successfully paid"+ "\n");
            return 1;
        }
    }

    public String get_account_type(){
        return this.type;
    }


    @Override
    public String toString(){
        return String.format("""
                %s:
                Money: %d
                Credit: %d
                """, type, this.get_money(), this.get_credit_money());
    }
}
