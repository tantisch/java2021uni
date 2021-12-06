package tests;

import src.Account;
import src.CheckingAccount;
import src.SavingsAccount;
import src.BusinessAccount;

import java.util.Objects;
import java.util.Scanner;
import java.sql.*;
import java.io.*;


public class atm {

    private static final Scanner console = new Scanner(System.in);

    private static Connection c = null;

    /**
     * Function that creates a connection with the database
     *
     * @throws SQLException           if exception
     * @throws ClassNotFoundException if exception
     */
    public static void get_connection() throws SQLException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        c = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Tymofii\\IdeaProjects\\Bank_Account_Manager\\src\\resources\\clients.db");
    }

    /**
     * Check if a string contains a number
     *
     * @param strNum - string to check
     * @return true if string contains number, else false
     */
    public static boolean is_numeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    /**
     * creating a document of user's doing
     * @param account account
     * @param type type of operation
     * @param amount amount of money used in operation
     */
    public static void create_file(Account account, String type, int amount) {

        System.out.println("""
                    Do you want to create a document of what you have done?
                      Please answer Yes or No
                    """);


        String choice1 = console.nextLine();
        while (!(Objects.equals(choice1, "Yes")) && !(Objects.equals(choice1, "No")) && !(Objects.equals(choice1, "yes")) && !(Objects.equals(choice1, "no"))) {
            System.out.println("Please choose one of the above. Enter Yes or No");
            choice1 = console.nextLine();
        }

        if (Objects.equals(choice1, "Yes") || Objects.equals(choice1, "yes")) {
            try {
                System.out.println(account.get_client_name());
                File file = new File("C:\\Users\\Tymofii\\IdeaProjects\\Bank_Account_Manager\\src\\resources\\" + account.get_client_name() + ".txt");
                FileWriter writer = new FileWriter(file);
                String text = String.format("""
                                  Bank BESTBANK
                          
                                  
                        Account type: %s
                        Account owner: %s
                                            
                        """, account.get_account_type(), account.get_client_name());
                switch (type) {
                    case "1" -> {
                        text += "Account replenishment by " + amount;
                        text += "\nMoney left: " + account.get_money();
                        text += "\nCredit left: " + account.get_credit_money();
                    }
                    case "2" -> {
                        text += "Taking credit in amount of " + amount;
                        text += "\nMoney left: " + account.get_money();
                        text += "\nCredit left: " + account.get_credit_money();
                    }
                    case "3" -> {
                        text += "Withdrew cash in amount of " + amount;
                        text += "\nMoney left: " + account.get_money();
                        text += "\nCredit left: " + account.get_credit_money();
                    }
                    case "4" -> {
                        text += "Payed in amount of " + amount;
                        text += "\nMoney left: " + account.get_money();
                        text += "\nCredit left: " + account.get_credit_money();
                    }
                    case "5" -> {
                        text += "Payed for credit in amount of " + amount;
                        text += "\nMoney left: " + account.get_money();
                        text += "\nCredit left: " + account.get_credit_money();
                    }
                }

                text += "\n\n\nBank Owner: Tymofii Tyshchenko";
                writer.write(text);
                writer.close();
                System.out.println("Successfully created a document.\n");

            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }

    /**
     * main function that works as an atm machine
     *
     * @return 0 when something is wrong
     */
    public static int do_work() {
        Statement stmt = null;


        try {
            stmt = c.createStatement();

            // asking user his card and name to get info about his accounts
            System.out.println("Please enter you card number");
            String card_number = console.nextLine();
            ResultSet rs = null;
            try {
                rs = stmt.executeQuery("select * from clients where card_number = " + card_number + ";");
                if (rs.next()) {
                    System.out.println("Please confirm it is you. Enter your name");
                    String name = console.nextLine();
                    if (!Objects.equals(name, rs.getString("name"))) {
                        System.out.println("The owner of this card is not registered by that name");
                        return 0;
                    }
                }
            } catch (Exception e) {
                System.out.println("There is no card with such number");
                return 0;
            }


            System.out.println("You successfully loged in");


            System.out.printf("""
                            Hi %s, here is the information on all your accounts:
                                                        
                              Checking Account:
                                Money: %d
                                Credit: %d
                              Savings Account:
                                Money: %d
                                Credit: %d
                              Business Account:
                                Money: %d
                                Credit: %d
                                
                            """, rs.getString("name"), rs.getInt("check_ac_money"), rs.getInt("check_ac_credit"),
                    rs.getInt("sav_ac_money"), rs.getInt("sav_ac_credit"),
                    rs.getInt("bus_ac_money"), rs.getInt("bus_ac_credit"));


            // creating accounts of a user according to values in data base
            Account[] accounts = new Account[]{new CheckingAccount(rs.getString("name"), rs.getInt("check_ac_money"), rs.getInt("check_ac_credit")),
                    new SavingsAccount(rs.getString("name"), rs.getInt("sav_ac_money"), rs.getInt("sav_ac_credit")),
                    new BusinessAccount(rs.getString("name"), rs.getInt("bus_ac_money"), rs.getInt("bus_ac_credit"))};


            //asking a user with which account he wants to work
            System.out.println("""
                    Please choose an account:
                      1. Checking Account
                      2. Savings Account
                      3. Business Account
                    """);

            String choice = console.nextLine();
            while (!(Objects.equals(choice, "1")) && !(Objects.equals(choice, "2")) && !(Objects.equals(choice, "3"))) {
                System.out.println("Please choose one of the above. Enter 1, 2 or 3");
                choice = console.nextLine();
            }

            String money_name;
            String credit_name;

            Account account;
            switch (choice) {
                case "1" -> {
                    account = accounts[0];
                    money_name = "check_ac_money";
                    credit_name = "check_ac_credit";
                }
                case "2" -> {
                    account = accounts[1];
                    money_name = "sav_ac_money";
                    credit_name = "sav_ac_credit";
                }
                case "3" -> {
                    account = accounts[2];
                    money_name = "bus_ac_money";
                    credit_name = "bus_ac_credit";
                }
                default -> throw new IllegalStateException("Unexpected value: " + choice);
            }
            System.out.println(account);


            // asking a user what he wants to do with the chosen account
            System.out.println("""
                    Please choose what you want to do:
                      1. Top up an account
                      2. Take credit
                      3. Withdraw cash
                      4. Pay
                      5. Pay for credit
                      6. Exit
                    """);

            choice = console.nextLine();
            while (!(Objects.equals(choice, "1")) && !(Objects.equals(choice, "2")) && !(Objects.equals(choice, "3")) && !(Objects.equals(choice, "4")) && !(Objects.equals(choice, "5")) && !(Objects.equals(choice, "6"))) {
                System.out.println("Please choose one of the above. Enter 1, 2, 3, 4 or 5");
                choice = console.nextLine();
            }

            switch (choice) {
                case "1" -> {
                    System.out.println("Enter by how much you want to replenish your account: ");
                    String m = console.nextLine();
                    while (!is_numeric(m)) {
                        m = console.nextLine();
                    }
                    int money = Integer.parseInt(m);
                    account.put_money(money);
                    System.out.println(account);
                    create_file(account, choice, money);

                }
                case "2" -> {
                    System.out.println("How much credit do you want to take: ");
                    String m = console.nextLine();
                    while (!is_numeric(m)) {
                        m = console.nextLine();
                    }
                    int money = Integer.parseInt(m);
                    int a = account.take_credit(money);
                    System.out.println(account);
                    if (a == 1) create_file(account, choice, money);

                }
                case "3" -> {
                    System.out.println("Enter how much cash you want to withdraw: ");
                    String m = console.nextLine();
                    while (!is_numeric(m)) {
                        m = console.nextLine();
                    }
                    int money = Integer.parseInt(m);
                    int a = account.withdraw(money);
                    System.out.println(account);
                    if (a == 1) create_file(account, choice, money);

                }
                case "4" -> {
                    System.out.println("How much money do you need to pay: ");
                    String m = console.nextLine();
                    while (!is_numeric(m)) {
                        m = console.nextLine();
                    }
                    int money = Integer.parseInt(m);
                    int a = account.pay(money);
                    System.out.println(account);
                    if (a == 1) create_file(account, choice, money);
                }
                case "5" -> {
                    System.out.println("How much money do you need to pay: ");
                    String m = console.nextLine();
                    while (!is_numeric(m)) {
                        m = console.nextLine();
                    }
                    int money = Integer.parseInt(m);
                    int a = account.pay_for_credit(money);
                    System.out.println(account);
                    if (a == 1) create_file(account, choice, money);
                }
                case "6" -> {
                    return 0;
                }
            }


            // update client row in a data base
            stmt.executeUpdate(String.format("update clients set %s = %d, %s = %d where card_number = %s", money_name, account.get_money(), credit_name, account.get_credit_money(), card_number));
//            c.commit();
            rs.close();
            stmt.close();




        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return 1;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        get_connection();

        while (true) {
            System.out.println("""
                    Choose what you want to do:
                      1. Log in to your Account
                      2. Exit""");

            String choice = console.nextLine();
            while (!(Objects.equals(choice, "1")) && !(Objects.equals(choice, "2"))) {
                System.out.println("Please choose one of the above. Enter 1 or 2");
                choice = console.nextLine();
            }
            if (choice.equals("1")) {
                do_work();
            }

            if (choice.equals("2")) {
                c.close();
                System.out.println("Thank you for using this ATM :)");
                break;
            }
        }
    }
}



























