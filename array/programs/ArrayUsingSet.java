package array.programs;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ArrayUsingSet {

	public static void main(String[] args) {
		Set<Double> obj = new HashSet<Double>();
		Collections.addAll(obj, 23.56, 54.78, 42.56, 23.56);
		for (Double d : obj) {
			// System.out.println(d);
			obj.add(d);
		}

		System.out.println("The Data of HashSet is " + obj);
		System.out.println("The size of the Hashset is :" + obj.size());
		System.out.println("===========================");

		Set<String> obj1 = new TreeSet<String>();
		Collections.addAll(obj1, "vino", "selvi", "vino", "Gayu", "selvi");
		for (String s : obj1) {
			obj1.add(s);
		}
		System.out.println("The Data of TreeSet is " + obj1);
		System.out.println("The size of the TreeSet is :" + obj1.size());
		System.out.println("===========================");

		Set<Integer> obj2 = new LinkedHashSet<Integer>();
		Collections.addAll(obj2, 1,2,3,3,2,4);
		for (Integer i : obj2) {
			obj2.add(i);
		}

		System.out.println("The Data of LinkedHashSet is " + obj2);
		System.out.println("The size of the LinkedHashSet is :" + obj2.size());
	}

}
