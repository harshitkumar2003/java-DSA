package Sorting;

public class insertion {
 public static void main(String[] args) {
     int arr[] = {7,8,3,6,5};
     // insertion sort
     for(int i=1;i<arr.length;i++){
         int current = arr[i];
         int  j = i-1;
            while(j>=0 && arr[j]>current){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
       }
       // print array
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }
   }
}