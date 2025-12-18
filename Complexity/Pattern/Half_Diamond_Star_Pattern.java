import java.util.*;
public class Half_Diamond_Star_Pattern{
    public static void Half_Diamond_Star_Pattern(int number){
        for(int i = 1; i<((number*2)); i++){
            int c = i;
            if(c > number){
                c =(number*2 - i);
            }
            while(c > 0){
                System.out.print("*");
                c--;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Half_Diamond_Star_Pattern(5);
    }
};
// Complexity	
// Time Complexity =	O(n²)
// Space Complexity =	O(1)