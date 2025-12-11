import java.util.*;
public class Right_Angled_Triangle_Pattern{
    public static void Right_Angled_Triangle_Pattern(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Right_Angled_Triangle_Pattern(6);
    }
};
/*
 Time Complexity is O(N^2)
 Space Complexity is O(1)
*/