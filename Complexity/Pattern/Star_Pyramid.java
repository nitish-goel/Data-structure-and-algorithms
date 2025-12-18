
import java.util.*;
public class Star_Pyramid{
    public static void Star_Pyramid(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i; j++){
                System.out.print("_");
            }
            for(int j=1; j<=((2*i)-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // for(int i=num; i>=1; i--){
        //     for(int j=1; j<=num-i; j++){
        //         System.out.print("_");
        //     }
        //     for(int j=1; j<=((2*i)-1); j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }
    public static void main(String args[]){
        Star_Pyramid(6);
    }
};

// ✅ Time Complexity (TC)

// Your code has two nested loops per row:

// For each i from 1 to num:

// First inner loop:

// for (int j = 1; j <= num - i; j++)


// Runs ≈ num - i times.

// Second inner loop:

// for (int j = 1; j <= (2*i) - 1; j++)


// Runs ≈ 2i - 1 times.

// Total operations:

// Sum for first loop:

// (num - 1) + (num - 2) + ... + 0 = O(num²)


// Sum for second loop:

// 1 + 3 + 5 + ... + (2*num - 1)  (odd numbers)


// Sum of first n odd numbers = n²
// So this loop also = O(num²)

// ⭐ Final Time Complexity:
// ✅ O(n²)
// ✅ Space Complexity (SC)

// Your code uses:

// A few integer variables (i, j)

// No arrays, no recursion, no extra data structures

// Therefore auxiliary space is constant.

// ⭐ Final Space Complexity:
// ✅ O(1)