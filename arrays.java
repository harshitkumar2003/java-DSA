import java.util.*;
public class arrays {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 5, 2};
        for (int i = 0; i < 5; i++) {
            if(arr[i] >= arr[i + 1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            System.out.println(arr[i]);
        }
    }    
}
