import java.util.*;
// leetcode-42. Trapping Rain Water
public class Trapping_Rain_Water{ 
    // public static int trappedWater(int[] height) { // Prefix & Suffix used still not optimized yet
    //     int n = height.length;
    //     int trappedWater = 0;
    //     int[] leftBar = new int[n];
    //     int[] rigthBar = new int[n];
    //     leftBar[0] = height[0];
    //     for(int i=1; i<n; i++){
    //         leftBar[i] = Math.max(height[i],leftBar[i-1]);
    //     }
    //     rigthBar[n-1]= height[n-1];
    //     for(int j = n-2; j>=0; j--){
    //         rigthBar[j] = Math.max(height[j],rigthBar[j+1]);
    //     }
        
    //   for(int i=0; i<n; i++){
    //   int waterLevel = Math.min(leftBar[i], rigthBar[i]);
    //     trappedWater += (waterLevel - height[i])*1;
    //   }
    //   return trappedWater;

    // }
    public static int trappedWater(int[] height) { // Optimized approach
    //  *************************Two Pointer Approach*******************
        //      Tc = O(n)
        int LM = Integer.MIN_VALUE, RM = Integer.MIN_VALUE;
        int l = 0 , r = height.length-1 , TW = 0; 

        while(l < r){
            LM = Math.max(LM, height[l]);
            RM = Math.max(RM, height[r]);
            TW += LM<RM ? LM - height[l++] : RM - height[r--];
        }
        return TW;

    }
    
    public static void main(String args[]){
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        // Output: 6
        // int height[] = {4,2,0,3,2,5};
        // Output: 9
        System.out.println("Trapped Water: "+ trappedWater(height));
    }
};