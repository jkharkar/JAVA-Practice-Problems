/*
 Write a program to accept student details like id, name, age and country.
Accept the details of 10 students and count the number of students whose age is more than 21.
Display the total count of students who belong to similar city.
 */
package arraylistex;

import java.util.Scanner;

public class StudentDetails {
    
    public static void main(String args[]){
    
     String ID;
     String Name;
     int Age;
     String Country;
     int i;
     Scanner sc = new Scanner(System.in);
     
     for(i=0; i<=5; i++){
         
     System.out.println("Enter Student ID: ");
     ID = sc.next();
     
    System.out.println("Enter Student Name:");
    Name = sc.next();
    
    System.out.println("Enter Student Age:");
    
    Age= sc.nextInt();
    
    if(Age>100){
        
    System.out.println(Age);
    }
    
    else
    {
        
    }
    System.out.println("Enter Country of Residence: ");
    Country = sc.next();
     }
    
    }
}
