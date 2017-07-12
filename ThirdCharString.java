/*
 * Q12) Write a program to accept the string and replace the third char with 't'.
 */
package arraylistex;

/**
 *
 * @author MRuser
 */
public class ThirdCharString {
    
    public static void main(String args[]){
        
        String s = "Rabbit";
        char[] m = s.toCharArray();
        m[2]='t';
        String s1= String.valueOf(m);
        
        System.out.println(s1);
        }
    }