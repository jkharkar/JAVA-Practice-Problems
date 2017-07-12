// Write a program to accept a string and check whether the 3rd character of string is 'S or not 

package arraylistex;


public class ThirdChar {
    
    public static void main(String args[]){
        String s1 = "Hello";
        char[] convString = s1.toCharArray();
        
        if(convString[2] == 's')
               System.out.println("The entered String has s at 3rd index");
        else
              System.out.println("The entered String does not have s at 3rd index");
    }
}
