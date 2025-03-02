package YouTPractise;

public class RemoveDuplicateSortedArrayUsingIndex {

	public static void main(String[] args) {
		int arr[]= {2,3,5,5,6,8,9};
		int j=0;
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i] != arr[i+1]) {
				arr[j]=arr[i];
				j++;
			}
		}
		arr[j]=arr[arr.length-1];
		
		for(int k=0;k<j;k++) {
			System.out.println(arr[k] + " ");
		}

	}

}
