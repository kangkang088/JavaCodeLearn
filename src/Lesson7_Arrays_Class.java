import java.util.Arrays;

public class Lesson7_Arrays_Class {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int n:arr){
            System.out.println(n);
        }
        Arrays.fill(arr,5);
        for(int n:arr){
            System.out.println(n);
        }
    }
}
