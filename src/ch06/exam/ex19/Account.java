package ch06.exam.ex19;

public class Account {
    private int balance;
    private static final int MIN_BALANCE = 0;
    private static final int MAX_BALANCE = 1000000;



    public int getBalance(){
        if(balance <= MIN_BALANCE){
            balance = 0;
        }
        else if(balance >= MAX_BALANCE){
            balance = MAX_BALANCE;
        }

        return balance;
    }

    public void setBalance(int balance){
        if(balance <= MIN_BALANCE){
            this.balance = this.balance;
        }
        else if(balance >= MAX_BALANCE){
            this.balance = this.balance;
        }
        else{
            this.balance = balance;
        }
    }
}
