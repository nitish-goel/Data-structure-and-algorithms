
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
        Star_Pyramid(5);
    }
};