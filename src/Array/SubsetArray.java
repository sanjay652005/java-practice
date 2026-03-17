package Array;

public class SubsetArray {
	public static void main(String[] args) {
		
		int[] a = {1,2,3};
		int[] b = {1,2,3,4,5};
		boolean isSubset = true;
		
		for(int i = 0; i<a.length;i++) {
			boolean found = false;
			
			for(int j = 0;j<b.length;j++) {
				if(a[i] == b[j]) {
					found = true;
					break;
					
				}
		}
		
		if(!found) {
			isSubset = false;
			break;
		}
	
	if(isSubset)
		System.out.println("Array a is subset of b");
	else
		System.out.println("Array a is not subset of b");
		}

}}