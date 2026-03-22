package Array;

public class SearchElement {
	public static void main(String[] args) {

        int arr[] = {2,4,6,8,10};
        int key = 6;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == key)
            {
                System.out.println("Element found at index: " + i);
            }
        }
    }
}
