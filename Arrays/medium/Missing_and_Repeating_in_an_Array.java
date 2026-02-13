import java.util.*;
public class Missing_and_Repeating_in_an_Array{
    public static void findMissingAndRepeating(int []arr){
        int miss = 0;
        int twice = 0;
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                twice = arr[i];
            }else if((arr[i]+1) != arr[i+1]){
                miss = arr[i]+1;
            }
        }
        System.out.println("Missing is: "+ miss);
        System.out.println("Twice is: "+ twice);
    }
    public static void main(String args[]){
        // int arr[] ={4, 3, 6, 2, 1, 1};
        int arr[] ={3, 1, 3};
        findMissingAndRepeating(arr);
    }
};