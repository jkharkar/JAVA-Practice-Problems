/*
 Write a program to create four functions for Addition, Subtraction, Multiplication and Division. 
 */
package arraylistex;


public class FourFunctions {
    
    public static int add( int x, int y){
       
     
        return (x+y);
    }
    
    public static int sub(int a, int b){
    
       
        int c = a-b;
        return c;
    
    }
    
    public static int mult( int w, int r){
    
       
        int s = w * r ;
        return s ;
        
    }
    
    public static int div( int d, int e){
    
  
        int f = d/e;
        return f;
        
    }
    public static void main(String args[]){
    
        
        System.out.println(add (15,20));
        
        System.out.println(sub (24,20));
        
         System.out.println(mult (3,2));
        
         System.out.println(div (14,7));
        
  
    }
}
