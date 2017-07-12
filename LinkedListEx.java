/*
 Write a program to demonstrate LinkedList to add and remove data 
and also use of the iterator to get the output in reverse format
 */
package arraylistex;

import java.util.*;

public class LinkedListEx {
    
    public static void BankDetails(){
    
        String BankName;
        String BankLocation;
        int BankID;
        
        LinkedList<String> bank = new LinkedList<String>();
        
        bank.add("Axis bank");
        bank.add("HDFC");
        bank.add("ICICI");
        bank.addFirst("Shamrao Vitthal");
        bank.addLast("TJSB");
        
        System.out.println("bank 2 "+bank.get(2));
        
        ListIterator i = bank.listIterator();
        
        while( i.hasNext()){
         System.out.println(" bank "+i.next());
        
        }
        
        LinkedList<String> bankloc = new LinkedList<String>();
        
        bankloc.add("Thane");
        bankloc.add("Mulund");
        bankloc.add("Dadar");
        
        ListIterator it = bankloc.listIterator();
        
        while( it.hasNext()){
            
         System.out.println(it.next());
        
        }
        
        LinkedList<Integer> bankid = new LinkedList<Integer>();
        
        bankid.add(123);
        bankid.add(456);
        bankid.add(789);
        
        ListIterator itr = bankid.listIterator();
        
        while( itr.hasNext()){
         System.out.println(itr.next());
        
        }
      //  ListIterator itr2 = bankid.listIterator();
        
        while(itr.hasPrevious()){
        
            System.out.println(itr.previous());
       }
    // 
        
    }
    
    public static void main(String args[]){
    
        BankDetails();
        
    }
}
