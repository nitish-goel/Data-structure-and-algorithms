import java.util.*;
public class Rectangular_Star_Pattern{
    public static void Rectangular_Star_Pattern(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Rectangular_Star_Pattern(5);
    }
};
/*
 Time Complexity is O(N^2)
 Space Complexity is O(1)
*/