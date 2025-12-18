import java.util.*;
public class Inverted_Star_Pyramid{
    public static void Inverted_Star_Pyramid(int num){
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
        
        Inverted_Star_Pyramid(6);
    }
};
// TC = O(n^2)
// SC = O(1)