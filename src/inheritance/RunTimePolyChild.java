package inheritance;

public class RunTimePolyChild extends RunTimePolyExampleTop{
	 // same method name and same argument but implemtatikon is different
	@Override
	public void execute() {
		System.out.println("Child perfomring");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunTimePolyChild child=new RunTimePolyChild();
		child.execute();

	}

}