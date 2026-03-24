package sorting;

public class InsertionSort {
	 public static void main(String[] args) {

	        int[] arr = {5, 2, 8, 1, 9};

	        for(int i = 1; i < arr.length; i++){
	            int key = arr[i];
	            int j = i - 1;

	            // shift elements
	            while(j >= 0 && arr[j] > key){
	                arr[j + 1] = arr[j];
	                j--;
	            }

	            arr[j + 1] = key;
	        }

	        // print sorted array
	        for(int num : arr){
	            System.out.print(num + " ");
	        }
	    }
}
