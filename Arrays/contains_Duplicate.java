package Arrays;

import java.util.HashSet;

public class contains_Duplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> check = new HashSet<Integer>();
        for (int i : nums) {
            if (check.contains(i)) {
                return true;
            }else{
                check.add(i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1, -2, 3, -1};
        System.out.println(containsDuplicate(arr));
    }

}