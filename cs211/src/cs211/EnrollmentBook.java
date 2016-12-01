package cs211;

import java.util.HashSet;

public class EnrollmentBook {
	HashSet <Student> record = new HashSet<Student>();
	
	public void addStudent(Student s){
		record.add(s);
		System.out.println("-------- After Adding -------");
		printStudent();
	}
	public void printStudent(){
		for (Student s1: record){
			if (s1!=null){
			System.out.println(s1.getId() +":" + s1.getName());
		
			}else{
				System.out.println("null");
			}
		}
	}
	

	public static void main(String[] args) {
		EnrollmentBook eb = new EnrollmentBook();
		eb.addStudent(new Student(1,"Jack", 30));
		eb.addStudent(new Student(1,"Jane", 20));
		eb.addStudent(new Student(1,"Jane", 20));
		eb.addStudent(new Student(2,"Jack", 40));
		Student s = new Student(3,"Jack", 50);
		eb.addStudent(s);
		eb.addStudent(s);
		eb.addStudent(null);
		eb.addStudent(null);
	}

}
