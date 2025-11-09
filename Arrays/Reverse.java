package Arrays;
public class Reverse {
    public static void main(String[] args){
        int arr[]={1, 4, 3, 2, 6, 5};
        int len = arr.length;
        int c = len/2;
        System.out.println("length: "+len);
        System.out.println("Loop iteration: "+c);
        int index = 0;
        for(int ar : arr){
            if(c == 0) break;
            int last = arr[(arr.length-index)-1];
            arr[(arr.length-index)-1]= ar;
            arr[index] = last;
            index++;
            c--;
        }
        for (int i : arr) {
            System.out.print(" "+ i);
        }
    }
}
