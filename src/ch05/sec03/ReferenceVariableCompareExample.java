package ch05.sec03;

public class ReferenceVariableCompareExample {
    public static void main(String[] args) {
        int[] arr01;
        int[] arr02;
        int[] arr03;

        arr01 = new int[] {1,2,3};
        arr02 = new int[] {1,2,3};
        arr03 = arr02;

        System.out.println(arr01 == arr02);
        System.out.println(arr02 == arr03);

    }
}
