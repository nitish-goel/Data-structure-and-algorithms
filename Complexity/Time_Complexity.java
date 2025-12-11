import java.util.*;
public class Time_Complexity{
    /*
    Now, the term, time complexity, seems that it is referring to the time taken by a machine to execute a particular code. But in real life, Time complexity does not refer to the time taken by the machine to execute a particular code. 
    * If we run the same code in a low-end machine(e.g. old windows machine) and in a high-end machine(e.g. Latest MacBook), we will observe that two different machines take different amounts of time for the same code. The high-end machine will take lesser time as compared to the low-end machine.

    So, the time taken by a machine can be changed depending on the configuration. That is why we should not compare the two different codes on the basis of the time taken by a machine as the time is dependent on it.

    Definition:
    The rate at which the time, required to run a code, changes with respect to the input size, is considered the time complexity. Basically, the time complexity of a particular code depends on the given input size, not on the machine used to run the code. 
    To represent the time complexity, we generally use the Big O notation

    Here come the three rules, that we are going to follow while calculating the time complexity:

    We will always calculate the time complexity for the worst-case scenario.
    We will avoid including the constant terms.
    We will also avoid the lower values.

    Apart from the widely used Big O notation, there are several other notations. Among them, the two most common are the Theta notation(θ) and the Omega notation(Ω). The differences are shown in the below image:
    */
    public static void main(String args[]){
        // for(int i =1; i<=5; i++){
        //     System.out.print("\ni: " + i);
        //     for(int j =1; j<=5; j++){
        //         System.out.print("\tj: "+j);
        //     }            
        // }
        /* From Above Loop:
            i: 1    j: 1    j: 2    j: 3    j: 4    j: 5
            i: 2    j: 1    j: 2    j: 3    j: 4    j: 5
            i: 3    j: 1    j: 2    j: 3    j: 4    j: 5
            i: 4    j: 1    j: 2    j: 3    j: 4    j: 5
            i: 5    j: 1    j: 2    j: 3    j: 4    j: 5
            why not like this iteration are taken 
            I Assume as Iteration are: outer loop 5 ,inner loop 25  = 30 total iterations
        */
        for(int i =1; i<=5; i++){ // correct 
            for(int j =1; j<=5; j++){
                System.out.print("\t("+i +","+ j+"),");
            } 
            System.out.println();           
        }
        /*  From Above Loop:
            Yes — each pair (i, j) is one execution

            Every time BOTH loops choose a value:

            i = some value

            j = some value

            That pair (i, j) corresponds to one execution of the constant-time block.

            So for N = 5, you have these pairs:
            (1,1),  (1,2),  (1,3),  (1,4),  (1,5)
            (2,1),  (2,2),  (2,3),  (2,4),  (2,5)
            (3,1),  (3,2),  (3,3),  (3,4),  (3,5)
            (4,1),  (4,2),  (4,3),  (4,4),  (4,5)
            (5,1),  (5,2),  (5,3),  (5,4),  (5,5)
            This forms a 5 × 5 grid = 25 pairs
            Each pair = 1 constant-time step
            Total steps = 25
            TC = O(N²)
        */
    }
};