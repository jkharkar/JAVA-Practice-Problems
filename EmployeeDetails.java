/*
 Write a program to accept details of 10 employees like id, name, age, salary, department.
Display the name of the employee who earns maximum
Display the name of teh employee who is elder of them all
 */
package arraylistex;

import java.util.Scanner;

public class EmployeeDetails {
    String EName;
    String EiD;
    int EAge;
    int ESalary;
    String EDepartment;
    int max =0;
    int maxi =0;
    
    public void employee(){
    
        Scanner sc= new Scanner(System.in);
        String n = null;
        String m = null;
        
        
        for(int i=0;i<2;i++){
        
            System.out.println("Enter Employee Details:");
            
            EName = sc.next();
            EiD = sc.next();
            EAge = sc.nextInt();
            ESalary = sc.nextInt();
            EDepartment =sc.next();
            
            if(ESalary > max){
            max = ESalary;
            n = EName;
            
            }
            
            if(EAge> maxi){
            
                maxi = EAge;
                m = EName;
            }
        }
        System.out.println(n);
        System.out.println(max);
        
        System.out.println(m);
        System.out.println(maxi);
    }
    public static void main(String args[]){
    
        EmployeeDetails obj = new EmployeeDetails();
        
        obj.employee();
    }
}
