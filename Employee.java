/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistex;

import java.util.*;

public class Employee {
     
  String Name;  
  int Age; 
  
  Employee (String Name,int Age){  
    
   this.Name=Name;  
   this.Age=Age;  
  }  
}
 class ABC {
    
  public void details(){
  
  Employee e1 =new Employee("Mahesh",23);  
  Employee e2 =new Employee("Ramesh",24);
  Employee e3 =new Employee("Suresh",25);
  
   ArrayList<Employee> em =new ArrayList<Employee>();
   
  em.add(e1);
  em.add(e2);  
  em.add(e3);  
  
  Iterator i= em.iterator();  
    
  while(i.hasNext())
  { 
     Employee emp = (Employee)i.next();
     
    System.out.println(emp.Name +"   "+  emp.Age );  
  }  
  }
  public static void main(String args[]){
  
      ABC abc = new ABC();
      
      abc.details();
      
  }
}

