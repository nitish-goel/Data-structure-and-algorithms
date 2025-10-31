package Arrays;
import java.lang.reflect.Array;
import java.util.*;

public class Min_and_Max {
    // public static void main(String args[]){ // This approach compare 2 time an element which is n * 2. For-exp.(in this case n = 5. so 5 * 2 = 10. This approach take 10 coparison to get min & max).
    //     int arr[] = {3, 5, 4, 1, 9};
    //     System.out.println("This is Arrays.");
    //     int min = Integer.MAX_VALUE; 
    //     int max = Integer.MIN_VALUE; 
    //     int i =0;
    //     for(int ar: arr){
    //         System.out.println("Iteration no. "+ ++i);
    //         System.out.println(" "+ar);
    //         if(ar < min) min = ar;
    //         if(ar > max) max = ar;
    //     }
    //     System.out.println("\nMin is: "+min);
    //     System.out.println("Max is: "+max);
    // }
    public static void main(String args[]){ // this approach take (n/2) * 3 
        // int arr[] = {3, 5, 4, 1, 9};
        int arr[] = {2,10,7,5,4,1,8,6};
        int min = Integer.MAX_VALUE; 
        int max = Integer.MIN_VALUE; 
        int i = 0;
        if(arr.length % 2 == 0){
            if (arr[0] < arr[1]) {
                min = arr[0];
                max = arr[1];
            }else{
                min = arr[1];
                max = arr[0];
            }
            i = 2;
        }else{
            min = arr[0];
            max = arr[0];
            i = 1;
        }
        while( i < arr.length){
            System.out.println(i);
            if (arr[i] < arr[i+1]) { // 1
                if(arr[i] < min)  min = arr[i]; // 2
                if(arr[i+1] > max)  max = arr[i+1]; // 3
            }else{
                if(arr[i+1] < min)  min = arr[i+1];
                if(arr[i] > max)  max = arr[i];                                 
            }
            i += 2;
        }
        System.out.println("\nMin is: "+min);
        System.out.println("Max is: "+max);
    }
}