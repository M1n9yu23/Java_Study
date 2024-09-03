package ch06.exam.ex20;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Account[] accounts = new Account[100];

        Scanner sc = new Scanner(System.in);
        String number;
        String owner;
        int balance;
        int index = -1;
        while(true){
            System.out.println("--------------------------------------------------");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("--------------------------------------------------");
            System.out.print("선택> ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.println("------------");
                    System.out.println("계좌생성");
                    System.out.println("------------");
                    System.out.print("계좌번호 : ");
                    number = sc.nextLine();
                    System.out.print("계좌주 : ");
                    owner = sc.nextLine();
                    System.out.print("초기입금액 : ");
                    balance = sc.nextInt();
                    Account newac = new Account(number,owner,balance);
                    accounts[++index] = newac;
                    System.out.println("계좌가 생성되었습니다.");
                    break;
                case 2:
                    System.out.println("------------");
                    System.out.println("계좌목록");
                    System.out.println("------------");
                    for(Account account : accounts){
                        if (account != null) {
                            System.out.println(account.getAccount_number() + "\t\t" + account.getAccount_owner() + "\t\t" + account.getBalance());
                        }
                    }
                    break;
                case 3:
                    System.out.println("------------");
                    System.out.println("예금");
                    System.out.println("------------");
                    System.out.print("계좌번호 : ");
                    number = sc.nextLine();
                    System.out.print("예금액 : ");
                    balance = sc.nextInt();
                    for(int i = 0; i < accounts.length; i++){
                        if (accounts[i] != null && accounts[i].getAccount_number().equals(number)) {
                            boolean check = accounts[i].Credit(balance);
                            if (check) {
                                System.out.println("결과 : 예금 성공");
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("------------");
                    System.out.println("출금");
                    System.out.println("------------");
                    System.out.print("계좌번호 : ");
                    number = sc.nextLine();
                    System.out.print("출금액 : ");
                    balance = sc.nextInt();
                    for(int i = 0; i < accounts.length; i++){
                        if (accounts[i] != null && accounts[i].getAccount_number().equals(number)) {
                            boolean check = accounts[i].Withdraw(balance);
                            if (check) {
                                System.out.println("결과 : 출금 성공");
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("프로그램 종료");
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
