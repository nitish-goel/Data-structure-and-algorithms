import java.util.*;
public class Missing_and_Repeating_in_an_Array{
    // public static void findMissingAndRepeating(int []arr){ // brute force approach
    //     int miss = 0;
    //     int twice = 0;
    //     Arrays.sort(arr);
    //     for(int i=0; i<arr.length-1; i++){
    //         if(arr[i] == arr[i+1]){
    //             twice = arr[i];
    //         }else if((arr[i]+1) != arr[i+1]){
    //             miss = arr[i]+1;
    //         }
    //     }
    //     System.out.println("Missing is: "+ miss);
    //     System.out.println("Twice is: "+ twice);
    // }
    public static void findMissingAndRepeating(int []arr){ // 
      
        boolean[] num = new boolean[arr.length + 1];
        // System.out.println(Arrays.toString(trk));
        int miss = 0;
        int twice = 0;
        for(int i=0; i<arr.length; i++){
            if(num[arr[i]] == true){
                twice = arr[i];
            }else{
                num[arr[i]] = true;
            }
        }
        for(int n=0; n<num.length; n++){
            if(num[n] == false){
                miss = n;
            }
        }
        System.out.println("Missing is: "+ miss);
        System.out.println("Twice is: "+ twice);
    } // Time complexity : O(n)  Space complexity : O(n)
    public static void main(String args[]){
        int arr[] ={4, 3, 6, 2, 1, 1};
        // int arr[] ={3, 1, 3};
        findMissingAndRepeating(arr);
    }
};