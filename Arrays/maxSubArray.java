package Arrays;

public class maxSubArray {
    // public static int maxSubArray(int[] nums) { // optimized Kadane's Algorithm
    //     int maxSoFar = nums[0];
    //     int maxEndingHere = nums[0];

    //     for (int i = 1; i < nums.length; i++) {
    //         maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
    //         maxSoFar = Math.max(maxSoFar, maxEndingHere);
    //     }

    //     return maxSoFar;
    // }

    public static int maxSubArray(int[] nums) { // brute force approach
        if (nums.length == 1) {
            return nums[0];
        }
        // if(nums.length == 2){
        // return (nums[0] + nums[1]);
        // }
        // int maxSum = Integer.MIN_VALUE;

        int maxSum = nums[0];
        int tempSum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            tempSum = nums[i] + tempSum;
            maxSum = Math.max(tempSum, maxSum);
            if (tempSum < 0) {
                tempSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        // int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums = { -2, -1 };
        System.out.println(maxSubArray(nums));
    }
}
