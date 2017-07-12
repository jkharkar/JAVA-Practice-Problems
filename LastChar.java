
//Write a program to accept a string and display the last character of the string without using readymade string
 //functions

package arraylistex;
import java.util.Scanner;

public class LastChar {
   public static void main( String args[]){
    
        String m ;
        char lastchar= 0;
        int l=0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word you want to find the last character:");
        m=sc.next();
        
        char[] convertedm = m.toCharArray();
        
        for(char i :convertedm){
        
        l=l+1;
        
        }
        
       System.out.println(convertedm[l-1]);
    }  
}
