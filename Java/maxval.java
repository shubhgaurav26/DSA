

import java.util.Arrays;

public class maxval {
    public static void main (String[] args){
        int arr[]={5, 6, 7, 8, 9};
        System.out.println(max(arr));
    }
    
    public static int max(int arr[]){
        int maxVal = 0;
        
        for (int i=1 ; i<arr.length ;i++){
            
            if (maxVal<arr[i]){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

}







