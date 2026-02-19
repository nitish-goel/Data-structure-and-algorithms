import java.util.*;
// leetcode-152. Maximum Product Subarray
public class Maximum_Product_Subarray{
    public static int maxProduct(int[] nums) {
        int currMax = nums[0];
        int currMin = nums[0];
        int maxProduct = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            
            int num = nums[i];
            
            // If number is negative, swap max and min
            if(num < 0){
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }
            
            currMax = Math.max(num, currMax * num);
            currMin = Math.min(num, currMin * num);
            
            maxProduct = Math.max(maxProduct, currMax);
        }
        
        return maxProduct;
    }
    public static void main(String args[]){
        // int nums[] = {2,3,-2,4};
        // Output: 6
        // Explanation: [2,3] has the largest product 6.
        // Example 2:

        int nums[] = {-2,0,-1};

        // Output: 0
        // Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
        System.out.println(maxProduct(nums));
    }
};