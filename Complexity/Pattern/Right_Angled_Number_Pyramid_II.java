import java.util.*;
public class Right_Angled_Number_Pyramid_II{
    public static void Right_Angled_Number_Pyramid_2(int num){
        for(int i=num; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Right_Angled_Number_Pyramid_2(5);
    }
};