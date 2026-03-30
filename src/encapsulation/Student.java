package encapsulation;

public class Student {
	// instance prop's
	private int age;
	private String name;
	private int id;
	
	public void setId(int m) {
		id=m;
	}
	
	public int getId() {
		return id;
	}
	
	public void write() {
		System.out.println("writing");
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getAge() {
		return this.age;
	}

	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	
	Student(int age,String name){
		this.name=name;
		this.age=age;
	}
	
	Student(){
		
	}
	public static void main(String[] args) {
		Student s=new Student();
		System.out.println(s.age);
		s.age=20;
		s.name="dhinesh";
		System.out.println(s.age);
		
		Student s1=new Student();
		s1.age=30;

	}

}