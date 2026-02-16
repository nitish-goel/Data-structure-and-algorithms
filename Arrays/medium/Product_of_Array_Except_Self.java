import java.util.*;
// Leetcode-238. Product of Array Except Self
public class Product_of_Array_Except_Self{
    // public static int[] productExceptSelf(int[] nums) { // Not Optimized
    //     int[] arr = new int[nums.length];
    //     for(int i=0; i<nums.length; i++){
    //         int sum =1;
    //         for(int j=0; j<nums.length; j++){
    //             if(i != j ){
    //                 sum *= nums[j];
    //             }
    //         }
    //         arr[i] = sum;
    //     }
    //     return arr;
    // } // TC: O(n²) 
    public static int[] productExceptSelf(int[] nums) { //Optimized
        int[] arr = new int[nums.length];
        arr[0] = 1;
        for(int i=1; i<nums.length; i++){
            arr[i] = arr[i-1]*nums[i-1];        
        }
        int suffix = 1;
        for(int j = nums.length-1; j>=0; j--){
            arr[j] *= suffix;
            suffix *=nums[j];
        }
        return arr;
    } // ✅ Time Complexity = O(n)
    public static void main(String args[]){
        int arr[] ={1,2,3,4};
        // int arr[] ={-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
};