package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class list {

	public static void main(String[] args) {
	      /*LinkedList declaration*/
	      LinkedList<String> linkedlist=new LinkedList<String>();
	      linkedlist.add("selenium-IDE");
	      linkedlist.add("Selenium WebDriver");
	      linkedlist.add("Selenium grid");

	      /*for loop*/
	      System.out.println("**For loop**");
	      for(int num=0; num<linkedlist.size(); num++)
	      {
	    	  System.out.println(linkedlist.get(num));
	      }

	      /*Advanced for loop*/
	      System.out.println("**Advanced For loop**");
	      for(String str: linkedlist)
	      {
	    	  System.out.println(str);
	      }

	      /*Using Iterator*/
	      System.out.println("**Iterator**");
	      Iterator i = linkedlist.iterator();
	      while (i.hasNext()) {
		  System.out.println(i.next());
	      }

	      /* Using While Loop*/
	      System.out.println("**While Loop**");
	      int num = 0;
	      while (linkedlist.size() > num) {
		  System.out.println(linkedlist.get(num));
		  num++;
	      }


	}

}