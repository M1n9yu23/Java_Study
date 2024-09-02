package ch06.exam.ex20;

public class Account {
    private String account_number;
    private String account_owner;
    private final int first_credit;
    private int balance;

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public String getAccount_owner() {
        return account_owner;
    }

    public void setAccount_owner(String account_owner) {
        this.account_owner = account_owner;
    }

    public int getBalance() {
        return balance;
    }

    public Account(String account_number, String account_owner, int first_credit) {
        this.account_number = account_number;
        this.account_owner = account_owner;
        this.first_credit = first_credit;
        balance = first_credit;
    }

    public boolean Credit(int credit) {

        if (credit >= 0) {
            balance += credit;
            return true;
        }


        return false;
    }


    public boolean Withdraw(int withdraw) {

        if (withdraw >= 0) {
            balance -= withdraw;
            return true;
        }

        return false;
    }


}
