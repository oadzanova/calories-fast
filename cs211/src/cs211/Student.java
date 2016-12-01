package cs211;

public class Student implements Comparable {
	int id;
	String name;
	int score;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Student(int id, String name, int score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}
	@Override
	public int hashCode() {
		return this.getId();
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student){
			Student s = (Student)obj;
			if (this.getId() == s.getId()){
				return true;
			}else{
				return false;
			}
			
		}else{
			return false;
		}

	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score=" + score + "]";
	}
	@Override
	public int compareTo(Object arg0) {
		Student s = (Student) arg0;
		
		if (score < s.score){
			return 1;
		}else if (score < s.score){
			return 0;
		}
		return -1;
	}
	

}
