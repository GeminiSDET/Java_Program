package JavaProgramPractise;
public class Array_LargestSmallest {
	public static void main(String[] args) {
		
		int[] arr= {2,5,8,9,11,7,89,56,3};
		int largest=arr[0];
		int smallest=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
			else if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
		}
		System.out.println(largest);
		System.out.println(smallest);
	}
}
