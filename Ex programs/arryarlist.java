package collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class arryarlist {

	public static void main(String[] args) {
		List<String> monthlist = Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec");
		//for each
		for (String st : monthlist) {
			System.out.println(st);
		}
//for loop
		for(int i=0;i<monthlist.size();i++)
		{
			System.out.println(monthlist.get(i));
		}
		 Iterator i=monthlist.iterator();
		 while(i.hasNext())
		 {
			 System.out.println(i.next());
		 }
		
	}

}
