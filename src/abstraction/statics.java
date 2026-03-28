package abstraction;

public class statics {
	statics(){
		System.out.println("statics contract called");
	}
	static {System.out.println("static block 1");}
	static {System.out.println("statiic block 2");}
	{
		System.out.println("object block 1");
	}
	{
		System.out.println("object block 2");
	}
	
	
	
	public static void main(String[] args) {
		statics m=new statics();
		System.out.println("called");
		statics m1=new statics();
	}
}
