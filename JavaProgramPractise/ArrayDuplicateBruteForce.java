package JavaProgramPractise;
public class ArrayDuplicateBruteForce {
	public static void main(String[] args) {
		
		int a[]= {2,2,7,5,8,9,4,6,5};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if (a[i]==a[j])
				{
					System.out.println(a[i]);
					break;
				}
			}
		}
	}
}
