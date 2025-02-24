public import java.io.*;
import java.util.Arrays;

class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7, 7, 5};
        int n = arr.length;  
        int sum = getElements(arr, n);
        System.out.println("Sum of elements: " + sum);
    }
    
    static private int getElements(int arr[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {  
            sum = arr[i] + sum;
        }
        return sum;  
    }
}


 {
    
}
