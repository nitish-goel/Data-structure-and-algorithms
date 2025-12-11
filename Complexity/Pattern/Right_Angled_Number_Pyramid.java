import java.util.*;
public class Right_Angled_Number_Pyramid{
    public static void Right_Angled_Number_Pyramid(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Right_Angled_Number_Pyramid(6);
    }
};
/*
 1
 12
 123
 1234
 12345
 123456
Time Complexity:
 The formaula to calculate (1,2,3,4,.....,n) is n(n+1)/2
 so, here n = 6 
 6(6+1)/2   ->   36+36/2
 According to 2 rule (avoid the lower values). so we remove +36
 so,We have:  36/2
 According to the 3 rule (avoid including the constant terms). so we remove /2
 then remain, 36 which is square of 6 then the time Complexity id O(N^2).

Space Complexity:
There is not array is used and nor list,set are used only num,i,j are used to store variable which are constants.
so therefore Space complexity is: O(1).  

*/