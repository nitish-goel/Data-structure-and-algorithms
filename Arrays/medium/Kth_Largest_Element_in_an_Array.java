import java.util.*;
// Leetcode-215. Kth Largest Element in an Array
public class Kth_Largest_Element_in_an_Array{ // brute force 
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
    public static void main(String args[]){
        // int nums[] = {3,2,1,5,6,4};
        // int k = 2;
        int nums[] = {3,2,3,1,2,4,5,5,6};
        int k = 4;

        System.out.println(k+" largest is : "+ findKthLargest(nums, k)); 
    }
};