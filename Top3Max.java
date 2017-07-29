/*
 Write a program to find top 3 maximum numbers in an array of size 10
 */
package july.pkg26.java.practice;



public class Top3Max {
    
    public static void main( String args[]){
    
        int x[] ={121,123,23,67,98,70,34,76,87,45};
        
        int max=0; 
        int secmax=0;
        int thirdmax=0;
        
        for(int a : x){
        
            if(max < a){
            
            thirdmax =secmax;
            secmax = max;
            max = a;
            }
            else if( secmax < a){
            thirdmax = secmax;
            secmax = a; 
            }
            
            else if (thirdmax < a){
         
                thirdmax = a; 
            }
            }
        
 
System.out.println(" The maximum number in the array is:" + max);
System.out.println( "The  second maximum number in the array is:" + secmax);
System.out.println( "The third maximum number in the array is:" + thirdmax);

    
    }
}
