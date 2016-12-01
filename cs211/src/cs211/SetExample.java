package cs211;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void print(Set<String >set){
		for (String s: set){
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		Set <String> set1 = new HashSet <String> ();
		set1.add("cat");
		set1.add("dog");
		set1.add("pig");
		set1.add("Dog");
		set1.add("pig");	
		
		System.out.println("Set 1 has " + set1.size());
		print(set1);
		
		HashSet <String> set2 = new HashSet<String>();
		System.out.println("------- set 2 ---------");
		set2.add("cat");
		set2.add("Chicken");
		//set2.addAll(set1);
		print(set2);
		
		System.out.println("------- intersec ---------");
		set1.retainAll(set2);
		print(set1);
	}

}
