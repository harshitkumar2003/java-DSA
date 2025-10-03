package Sorting;
public class bubble {
    public static void main(String[] args) {
        int arr[] = {7,8,3,6,5};
        // bubble sort
        // outer loop for number of passes
        for(int i=0;i<arr.length-1;i++){
        //   inner loop for comparison in each pass
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        // print array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}