import java.util.*;
// leet-code 31. Next Permutation
public class Next_Permutation{
    public static void swap(int arr[],int n1,int n2){
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
    public static void reverse(int arr[],int start){
        int end = arr.length-1;
       while(start <= end){
            swap(arr,start,end);
            start++;
            end--;
       }
    }
    public static void nextPermutation(int nums[]){
        boolean flag = false;
        for(int i = nums.length-2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                for(int j = nums.length-1; j >= i+1; j--){ // check for greater value
                    if(nums[i] < nums[j] && nums[i+1] >= nums[j]){
                        swap(nums, i, j);
                        break;
                    }
                }
                // swap(nums, i, i+1);
                reverse(nums,i+1);
                flag = true;
                break;
            }
        }
        if(flag == false) reverse(nums, 0);
    }
    public  static void main(String args[]){
        // int arr[] = {5,9,1,1};

        // int arr[] = {9,1,1};

        // int arr[] = {1, 9, 2, 4};
        // int arr[] = {1, 9, 4, 2};
        int arr[] = {2, 1, 4, 9};
        System.out.println("Integer Array: " + Arrays.toString(arr));
        nextPermutation(arr);
        System.out.println("Integer Array: " + Arrays.toString(arr));
    }
};
// Time complexity: O(n)
// Space Complexity: O(1)