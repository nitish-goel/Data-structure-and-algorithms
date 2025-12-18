import java.util.*;
public class Diamond_Star_Pattern{
    public static void Diamond_Star_Pattern(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num-i; j++){
                System.out.print("_");
            }
            for(int j=1; j<=((2*i)-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=num; i>=1; i--){
            for(int j=1; j<=num-i; j++){
                System.out.print("_");
            }
            for(int j=1; j<=((2*i)-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Diamond_Star_Pattern(4);
    }
};
// 🔁 Code Structure (High level)

// You have two main loops:

// Upper pyramid → i = 1 to num

// Lower pyramid → i = num to 1

// Both parts have exactly the same inner loops.

// ⏱️ Time Complexity (TC)
// For one pyramid:

// For each i:

// _ loop runs → num - i times

// * loop runs → (2*i - 1) times

// Total work per row:

// (num - i) + (2i - 1) = num + i - 1

// Total work for one pyramid:
// Σ (num + i - 1)   where i = 1 to num
// = num*num + (1 + 2 + ... + num)
// = n² + n(n+1)/2
// = O(n²)

// Since there are two pyramids:
// O(n²) + O(n²) = O(2n²)

// ⭐ Final Time Complexity:
// ✅ O(n²)

// Constants are ignored in Big-O, so 2n² → n²

// 🧠 Space Complexity (SC)

// Your code uses:

// Loop variables (i, j)

// No recursion

// No arrays or extra data structures

// ⭐ Final Space Complexity:
// ✅ O(1) (constant space)