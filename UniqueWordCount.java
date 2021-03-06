/*
 
Write a program to take a sentence from user and do unique word count using spilt()
 */
package july.pkg26.java.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class UniqueWordCount {

	String st;
	ArrayList<String> b=new ArrayList<String>();
	Map<String,Integer> c = new TreeMap<String,Integer>();
	public void getSentence()
	{
		st = "hadoop java c++ java hadoop";
	}
	
	public void getUwordCount()
	{
		String[] a = st.split("\\s");
		
		// calling disp method
		System.out.print("Given st words: ");
		this.displayStArray(a);
		
		// 
		int j=0;
		
		b.add(a[0]);
		for(int i=1;i<a.length;i++)
		{
			String temp = a[i];
			int count = 0;
			for(int k=0;k<b.size();k++)
			{
				if(b.get(k).equals(temp))
				{
					count++;
				}
			}
			if(count==0)
			{
				b.add(a[i]);
			}
		}
		
		// disp b
		this.dispAL(b);
		
		System.out.println("Size: "+b.size());
		
		// putting data in a HashMap
		Iterator it = b.iterator();
		while(it.hasNext())
		{
			String tmp = (String) it.next();
			c.put(tmp, 0);
		}
		
		System.out.println(c);
		
		
		Set st1 = c.entrySet();
		
		for(int i=0;i<a.length;i++)
		{
			//System.out.println("outer: "+a[i]);
			Iterator it1 = st1.iterator();
			while(it1.hasNext())
			{
				Map.Entry me = (Map.Entry) it1.next();
				String tmp = (String) me.getKey();
				int count = (int) me.getValue();
				// System.out.println(tmp+" "+count+" "+a[i]);
				if(tmp.equals(a[i]))
				{
					++count;
					// System.out.println(count);
					
					//c.remove(tmp);
					c.put(tmp, count);
				}
			}
		}
		
		System.out.println(c);
		
	}
	
	public void displayStArray(String[] a)
	{
		for(String x:a)
		{
			System.out.print(x+", ");
		}
		System.out.println();
	}
	
	public void dispAL(ArrayList<String> a)
	{
		Iterator it = a.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println();
	}
	
	public static void main(String args[])
	{
		UniqueWordCount x = new UniqueWordCount();
		x.getSentence();
		x.getUwordCount();
	}
}