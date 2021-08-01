package collections;

import java.util.LinkedHashSet;

public class HashSet {

	public static void main(String[] args) {
        // LinkedHashSet of String Type
        LinkedHashSet<String> lhset = new LinkedHashSet<String>();

        // Adding elements to the LinkedHashSet
        lhset.add("IDE");
        lhset.add("WEBDRIVER");
        lhset.add("GRID");
        lhset.add("API");
        lhset.add("QTP");
        lhset.add("JMETER");
        System.out.println(lhset);

        // LinkedHashSet of Integer Type
        LinkedHashSet<Integer> lhset2 = new LinkedHashSet<Integer>();

        // Adding elements
        lhset2.add(99);
        lhset2.add(7);
        lhset2.add(0);
        lhset2.add(67);
        lhset2.add(89);
        lhset2.add(66);
        System.out.println(lhset2);
for (Integer ele : lhset2) {
	 System.out.println(ele);
	
}

	}

}
