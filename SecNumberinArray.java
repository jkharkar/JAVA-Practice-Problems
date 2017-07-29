/* Write a program to find the second highest number in an interger array without sorting the elements*/


package july.pkg26.java.practice;


public class SecNumberinArray {
    
    
    public static void main( String args[]){
    
        int c[]={24,27,29,30,35,40};
        int max =0;
        int secmax =0;
        
        for (int x: c){
        
            if(max < x){
            
                secmax = max;
                max = x ;
            }
                else if(secmax < x){
        secmax = x;
        }
        }
        System.out.println("The maximum number in the array is:" + max);
        
     System.out.println("The  second maximum number in the array is:" + secmax);
     
    }
}
