package encapsulation;

public class Teacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
//		s.age=30;
		s.setAge(30);
//		s.name="mani";
//		System.out.println(s.age);
		System.out.println(s.getAge());
		
		Student s1=new Student();
		s1.setAge(40);
		s1.setName("mani");
		String f=s1.getName();
		System.out.println(f);
		
		Student s2=new Student(25,"seeman");
		System.out.println(s2.getAge());
		s2.setAge(27);
		System.out.println(s2.getAge());
		
		s2.setId(15);
		System.out.println(s2.getId());
	}

}