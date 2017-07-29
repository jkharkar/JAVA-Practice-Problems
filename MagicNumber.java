/*
 
Write a program to check whether accepted number is a Magic Number
 */
package july.pkg26.java.practice;

import java.util.Scanner;


public class MagicNumber {
    
    public static void main(String args[]){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the number to be checked:");
    
    int x=sc.nextInt();
    
    int sum = 0; 
    
    
    while(x > 9){
    
        sum = x; int s = 0;
        
        while (sum != 0){
        
            s = s+(sum%10);
            sum = sum/10;
            
        }
        x = s;
    
    }
    if(x ==1){
    System.out.println("The number entered is a magic number");
    }
    else{
    System.out.println("The number entered is not a magic number");
    }
    }
}
