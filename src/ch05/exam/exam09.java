package ch05.exam;

import java.util.Scanner;

public class exam09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] student = null;
        int choice = -1;
        boolean bol = true;

        while(bol){
            System.out.println("----------------------------------------------------------");
            System.out.println("1. 학생 수  | 2. 점수 입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("----------------------------------------------------------");

            System.out.print("선택 : ");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.print("학생 수 : ");
                    choice = sc.nextInt();
                    student = new int[choice];
                    break;
                case 2:
                    for (int i = 0; i < student.length; i++){
                        System.out.print("scores["+i+"] : ");
                        student[i] = sc.nextInt();
                    }
                    break;
                case 3:
                    for(int i = 0; i < student.length; i++){
                        System.out.println("scores["+i+"] : " + student[i]);
                    }
                    break;
                case 4:
                    int sum = 0;
                    double avg = 0.0;
                    int max = 0;
                    for (int i = 0; i < student.length; i++){
                        if(max < student[i]){
                            max = student[i];
                        }
                        sum += student[i];
                    }
                    avg = sum / student.length;

                    System.out.println("최고 점수 : " + max);

                    System.out.println("평균 점수 : " + avg);
                    break;
                case 5:
                    bol = false;
                    System.out.println("프로그램 종료");
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
            }

        }

    }
}
