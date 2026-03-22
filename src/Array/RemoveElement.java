package Array;

public class RemoveElement {
	public static void main(String[] args) {
		
		int[] arr = {1,22,3,4,2,5};
		int target = 2;
		
		System.out.print("array after removing" + target +":");
		
		for(int num : arr) {
			if(num != target)
				System.out.print(num + " ");
		}
	}
}
