package Sorting;

public class selection {
    public static void main(String[] args) {
        int arr[] = {7,8,3,6,5};
        // selection sort
        for(int i=0;i<arr.length-1;i++){
            int smallest = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
        // print array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}