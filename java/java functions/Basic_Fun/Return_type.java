import java.util.*;
public class Return_type {
    public static int sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int n1 = in.nextInt();
        System.out.println("Enter Second number: ");
        int n2 = in.nextInt();
        return (n1 + n2);
    }
    // static void change(int a){
    //     // Primitive data-types are always pass by value of reference variable.So they are not change able by passing
    //     int num = 10;
    //     a = num;
    // }
    static void change(int[] a){
        // Primitive data-types are always pass by value of reference variable.So they are not change able by passing
        int num = 10;
        a[0] = num;
    }
    public static void main(String[] args) {
        // int ans = sum();
        // System.out.println("Total is: "+ans);
        int a[]= {8,5,3,2,6};
        System.out.println(Arrays.toString(a));
        change(a);
        System.out.println(Arrays.toString(a));
    }
}