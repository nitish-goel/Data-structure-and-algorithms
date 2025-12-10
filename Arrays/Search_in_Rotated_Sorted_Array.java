import java.util.*;
public class Search_in_Rotated_Sorted_Array{
    public static int Search_in_Rotated_Sorted(int ar[] ,int t){
        if(ar.length < 1){
            return -1;
        }
        int first = 0;
        int last = ar.length-1;
        while(first <= last){
            int mid = (first + last)/2;            
            if(ar[mid] == t){
                return mid;
            }
            if(ar[first] <= ar[mid]){
                if(ar[first] <= t && t < ar[mid]){
                    last = mid - 1;
                }else{
                    first = mid + 1;
                }
            }else{
                if(ar[mid] < t && t <= ar[last]){
                    first = mid + 1;
                }else{
                    last = mid -1;
                }
            }
        }
        return -1;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {4,5,6,7,0,1,2};
        System.out.println("Enter Target");
        int target = sc.nextInt();
        int result = Search_in_Rotated_Sorted(arr,target);
        System.out.println(result);
    }
}