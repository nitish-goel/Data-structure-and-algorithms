import java.util.*; // Easy
public class Chocolate_Distribution_Problem{
    public static int Chocolate_Distribution(int arr[],int s){
        if(arr.length < s){
            return -1;
        }
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for(int i = 0; (i + s - 1) < arr.length; i++){
            int diff = arr[i+s-1] - arr[i];
            if(minDiff > diff){
                minDiff = diff;
            }
        }
        return minDiff;

    }
    public static void main(String args[]){
        int arr[] = {7,3,2,4,9,12,5};
        int diff = Chocolate_Distribution(arr,3);
        System.out.println(diff);
    }
};