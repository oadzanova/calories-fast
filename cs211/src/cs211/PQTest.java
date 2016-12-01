package cs211;

import java.util.PriorityQueue;
import java.util.Random;

public class PQTest {

	public static void main(String[] args) {
		String data[] = {"hello","cat","tiger","shirt","ant"};
		PriorityQueue<String> numbers=new PriorityQueue<String>();
		Random ran = new Random();
		for (int i = 0;i<5;i++)
			numbers.add(data[i]);
		
		while (!numbers.isEmpty()){
			System.out.print(numbers.poll() + " ");
		}
		
		PriorityQueue <Student> st = new PriorityQueue <Student>();
		st.add(new Student(5,"Jack", 70));
		st.add(new Student(3,"Jill", 90));
		st.add(new Student(2,"Jane", 10));
		st.add(new Student(1,"Kitty", 50));
		st.add(new Student(1,"Jack", 30));
		System.out.println();
		while (!st.isEmpty()){
			System.out.println(st.poll().toString() );
		}
	}

}
