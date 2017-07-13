/*
Write a program to maintain Employee Details using ArrayList:
Display the list in proper order, Display the name of the Employee with highest salary
Display details in order of salary
*/
import java.util.*;

public class ArrayListEx2 {
    
    static Employ ex;
    
    public static void Details(){
    
        double max = 0;
        
        ArrayList al = new ArrayList();
        
        //Creating Employee Details of 5 employee
       Employ e1= new Employ(1,"John",30,35000);
       Employ e2= new Employ(2,"Jimmy",32,40000);
       Employ e3= new Employ(3,"Alex",31,42000);
       Employ e4= new Employ(4,"David",35,37000);
       Employ e5= new Employ(5,"Edward",40,36000);
        
        //Adding Employee Details
       
       al.add(e1);
       al.add(e2);
        al.add(e3);
        al.add(e4);
        al.add(e5);
        
        //Traversing the data
        
        Iterator ir = al.iterator();
        
        while(ir.hasNext()){
        
                Employ ed = (Employ) ir.next();
                if(ed.Salary > max)
                {
                    max = ed.Salary;
                    ex = ed;
                }
            System.out.println(ed.Name+" "+ed.ID+" "+ed.Salary);
            
            
        }
        
        System.out.println("Max sal="+ex.Name);
    }
    public static void main(String arg[]){
    
        Details();
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
