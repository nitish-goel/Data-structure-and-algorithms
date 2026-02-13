import java.util.*;
// leectcode 121 
public class Best_Time_to_Buy_and_Sell_Stock{
    public static int maxProfit(int[] prices) {
        int maxProfit =0;
        int buyP =prices[0];
        for(int i=1; i<prices.length; i++){
            if(buyP > prices[i]){
                buyP = prices[i];
            }else{
                int profit = prices[i] - buyP;
                maxProfit = Math.max(profit,maxProfit);
            }
            if(maxProfit < 0){
                maxProfit = 0;
            }
        }
        
        return maxProfit;
    }
    public static void main(String args[]){
        // int price[] ={7,1,5,3,6,4};
        int price[] ={7,6,4,3,1};
        System.out.print(maxProfit(price));
        
    }
}; 
// Time Complexity: O(n)
// Space Complexity: O(1)