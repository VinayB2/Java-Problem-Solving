// Left rotate an array by D places:

import java.util.Arrays;

public class Question7{
    // public static void Rotatetoleft(int[] arr, int n, int k) {
    //     if (n == 0)
    //         return;
    //     k = k % n;
    //     if (k > n)
    //         return;
    //     int[] temp = new int[k];
    //     for (int i = 0; i < k; i++) {
    //         temp[i] = arr[i];
    //     }
    //     for (int i = 0; i < n - k; i++) {
    //         arr[i] = arr[i + k];
    //     }
    //     for (int i = n - k; i < n; i++) {
    //         arr[i] = temp[i - n + k];
    //     }
    // }
    // public static void main(String args[]) {
    //     int n = 7;
    //     int[] arr = {1,2,3,4,5,6,7};
    //     int k = 2;
    //     Rotatetoleft(arr, n, k);
    //     System.out.println("After Rotating the elements to left ");
    //     for (int i = 0; i < n; i++) {
    //         System.out.print(arr[i] + " ");
    //     }
    // }
    public static void main(String[]args){
        int []arr={1,2,3,4,5,6,7};
        int n=arr.length;
        int k=2;
        rotateLeft(arr,n,k);
        System.out.println(Arrays.toString(arr));
    }
    static void rotateLeft(int []arr,int n,int k){
        int[] temp=new int[k];
        if(n==0)
        return;
        k=k%n;
        if(k>n)
        return;

        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            arr[i]=arr[i+k];
        }
        for(int i=n-k;i<n;i++){
            arr[i]=temp[i-n+k];
        }
    }

}