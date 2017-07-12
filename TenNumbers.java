/*
 Write a program in java to accept 10 numbers and display the sum of those numbers
 */
package arraylistex;


public class TenNumbers {
    
    public static void main( String args[]){
    
        int c[] = {2,4,6,8,10,12,14,16,18,20};
        int z=0;
        for (int x:c){
        z= z + x;
            System.out.println(z);
        }
        
    
    }
}
