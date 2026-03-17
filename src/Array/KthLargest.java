package Array;
import java.util.Arrays;
public class KthLargest {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int k = 2;
		
		Arrays.sort(arr);;
		
		System.out.println(k + "nd largest:" + arr[arr.length - k]);
	}
}
