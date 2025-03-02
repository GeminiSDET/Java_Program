package JavaProgramPractise;
public class ReverseWordString {
	public static void main(String[] args) {
		String str="I am learning Java";
		String result="";
		
		String[] arr=str.split(" ");
		for(int i=arr.length-1;i>=0;i--)
		{
			result+=arr[i] + " ";
		}
		System.out.println(result);
	}
}
