/*
 Write a menu driven program for operating a calculator:
1) Addition, 2) Subtraction, 3) Multiplication 4) Division 5) Percentage 6) Exit
 */
package arraylistex;
import java.util.Scanner;


public class Calculator {
   int n1, n2;
    double x;
    
    public void getdata(){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("******CALCULATOR******");
    System.out.println("Enter the following choices to calculate:");
    System.out.println(" 1: Addition, 2: Subtraction, 3: Multiplication");
    System.out.println(" 4:Division , 5: Percentage, 6: Exit");
int a = sc.nextInt();
    
switch(a)
{
    case 1:
        System.out.println(" Enter two numbers you want to add:");
        n1=sc.nextInt();
        n2=sc.nextInt();
        x = n1+n2;
        System.out.println(" Addition of two numbers is:"+ x);
break;
    case 2:
      System.out.println(" Enter two numbers you want to subtract:");
        n1=sc.nextInt();
        n2=sc.nextInt();
        x = n1-n2;
        System.out.println(" Subtraction of two numbers is:"+ x);
break; 
        
    case 3:
        System.out.println(" Enter two numbers you want to Multiply:");
        n1=sc.nextInt();
        n2=sc.nextInt();
        x = n1*n2;
        System.out.println(" Multiplication of two numbers is:"+ x);
break;
    case 4:
        System.out.println(" Enter two numbers you want to Divide:");
        n1=sc.nextInt();
        n2=sc.nextInt();
        x = n1/n2;
        System.out.println(" Division of two numbers is:"+ x);
break;
        
    case 5:
        System.out.println(" Enter two numbers you want find percentage:");
        n1=sc.nextInt();
        n2=sc.nextInt();
        x = (n1/n2)*100;
        System.out.println(" Percentage is:"+ x);
break;
    case 6:
        break;
        
    default:
       System.out.println("You have entered a wrong choice");
                   
}
    }
    
    public static void main( String args[]){
    
    Calculator obj = new Calculator();
    obj.getdata();
    
    } 
}
