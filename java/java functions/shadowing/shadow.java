public class shadow {
    static int n = 100; // This will be shadowed at line 5   
    public static void main(String[] args) {
        System.out.println(n);
        // int n = 10; // lower layer
        int n;
        n = 10; 
        System.out.println(n);
        prnt();
    }
    static void prnt(){
        System.out.println(n);
    }
}
