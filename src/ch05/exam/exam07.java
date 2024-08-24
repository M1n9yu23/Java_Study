package ch05.exam;

public class exam07 {
    public static void main(String[] args) {
        int[] array = {1,5,3,8,2};
        int tmp = array[0];
        for(int i = 0; i < array.length; i++){
            if(tmp < array[i]){
                tmp = array[i];
            }
        }
        System.out.println(tmp);
    }
}
