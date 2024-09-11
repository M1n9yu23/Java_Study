package ch11.sec06;

import ch09.sec02.exam02.A;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);
        System.out.println("예금액: " + account.getBalance());

        try{
            account.withdraw(30000);
        } catch (InsufficientException e){
            System.out.println(e.getMessage());
        }
    }
}
