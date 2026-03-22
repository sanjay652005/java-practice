package Array;

public class MissingNumber {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int n = 5;
		int sum = n * (n + 1) / 2;
		
		int arrsum = 0;
		for (int num :  arr) {
			arrsum +=num;
			
		}
		System.out.println("Missing number:" + (sum - arrsum));
	}
}
