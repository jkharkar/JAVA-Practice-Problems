
package arraylistex;


import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListEx {

    public static void Student(){
    
         ArrayList<String> stu = new ArrayList<String>();
         
         stu.add("James");
         stu.add("Jin");
         stu.add("Tim");
         stu.add("Bin");
         stu.add("Ed");
    
         Iterator i = stu.iterator();
         
         while(i.hasNext()){
         
             System.out.println(i.next());
         }
         
    ArrayList<Integer> stu_age = new ArrayList<Integer>();
    
    stu_age.add(15);
    stu_age.add(13);
    stu_age.add(11);
    stu_age.add(10);
    stu_age.add(12);
    
    Iterator j = stu_age.iterator();
    while(j.hasNext()){
         
             System.out.println(j.next());
         }
    
    ArrayList<String> stu_city = new ArrayList<String>();
    
         stu_city.add("Philadelphia");
         stu_city.add("Chicago");
         stu_city.add("New York");
         stu_city.add("Detriot");
         stu_city.add("Austin");
         
         
        Iterator a = stu_city.iterator();
    while(a.hasNext()){
         
             System.out.println(a.next());
         }
        
             
    ArrayList<String> stu_state = new ArrayList<String>();
    
         stu_state.add("Penn");
         stu_state.add("Illinois");
         stu_state.add("New York");
         stu_state.add("Michigan");
         stu_state.add("Texas");
         
         Iterator b = stu_state.iterator();
         
    while(b.hasNext()){
         
             System.out.println(b.next());
         }
    }
    
    public static void main(String[] args) {
        
        ArrayListEx obj = new ArrayListEx();
        obj.Student();
        
    }
    
}
