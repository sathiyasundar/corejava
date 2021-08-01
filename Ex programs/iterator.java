package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class iterator {

	public static void main(String[] args) {
	    ListIterator<String> litr = null;
	    List<String> names = new ArrayList<String>();
	    names.add("IDE");
	    names.add("RC");
	    names.add("WEBDRIVER");
	    names.add("GRID");
	    names.add("JMETER");
	    //Obtaining list iterator
	    litr=names.listIterator();
	 
	    System.out.println("Traversing the list in forward direction:");
	    while(litr.hasNext()){
	       System.out.println(litr.next());
	    }
	    System.out.println("\nTraversing the list in backward direction:");
	    while(litr.hasPrevious()){
	       System.out.println(litr.previous());
	    }


	}

}
