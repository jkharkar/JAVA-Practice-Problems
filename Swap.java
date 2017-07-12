/*
 Write a program to swap two numbers without using the third variable
 */
package arraylistex;

import java.util.Scanner;

public class Swap {
    
    public static void main(String args[]){
    
        int A = 10;
        int B = 15;
        System.out.println(" Before Swap : ");
        System.out.println( "The Value of A is " + A);
        System.out.println( "The Value of B is " + B);
        
        A =A+B;
        B=A-B;
      
        A = A-B;
        
        System.out.println(" After Swap : ");
        System.out.println( "The Value of A is " + A);
        System.out.println( "The Value of B is " + B);   
    }
}
