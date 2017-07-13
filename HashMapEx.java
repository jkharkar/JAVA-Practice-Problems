/*
 Write a program to perform all the operations related to HashMap:
Emplyee Id, Name, Age, Salary.
Create a Employee class to store the details, traverse details stored in collection , 
deleteand update Employee Details accordingly
 */
package arraylistex;

import java.util.*;

public class HashMapEx {
    
    public static void EmployeeDetails(){
    
        HashMap<Integer, Employ> hm = new HashMap<Integer, Employ>();
        
        // Creating Employee Details
        
       Employ e1= new Employ(1,"John",30,35000);
       Employ e2= new Employ(2,"Jimmy",32,40000);
       Employ e3= new Employ(3,"Alex",31,42000);
       Employ e4= new Employ(4,"David",35,37000);
       Employ e5= new Employ(5,"Edward",40,36000);
       
       //Adding Employee Details to the Map
       hm.put(20,e1);
       hm.put(21,e2);
       hm.put(22,e3);
       hm.put(23,e4);
       hm.put(24,e5);
      
       //removing and Updating Details
       
       hm.remove(3);
       
       //Traversing the data
       
       for(Map.Entry<Integer,Employ> me : hm.entrySet()){
       
           int key=me.getKey();  
           
        Employ e= me.getValue();  
        
        System.out.println(key+" Details:"); 
        
        System.out.println(e.ID+" "+e.Name+ " " +e.Age+ " "+ e.Salary); 
       }
    }
  public static void main(String args[]){
  
      EmployeeDetails();
  }  
}

class Employ{

    int ID;
    String Name;
    int Age;
    double Salary;
    
    Employ(int ID,String Name,int Age,double Sal)
    {
    this.Name = Name;
    this.ID=ID;
    this.Age = Age;
    this.Salary = Sal;
    
    }
    
}
