/*
Write a program to accept a number and reverse its digits

 */
package arraylistex;

import java.util.Scanner;

public class ReverseDigits {
    public static void main( String args[]){
    
    int n = 0;
    int reverse = 0;
    Scanner sc = new Scanner(System.in);
    
    System.out.println(" Enter the number you want to reverse the digits for:");
    n = sc.nextInt();
    
    while( n!=0){
    reverse = reverse *10;
    reverse = reverse +n%10;
    n = n/10;   
    }
    System.out.println(" The number reversed is:" + reverse);
    }
}
