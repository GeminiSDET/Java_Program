package JavaProgramPractise;
import java.util.Arrays;

public class ArrayMoveZeroToEnd {
	public void moveZeroes(int[] nums)
	{
		int index = 0;

		for (int i = 0; i < nums.length; i++) 
		{
			if (nums[i] != 0) {
				nums[index] = nums[i];
				index++;
			}
		}
		for (int i = index; i < nums.length; i++) 
		{
			nums[i] = 0;
		}
	}
	public static void main(String[] args) 
	{
		ArrayMoveZeroToEnd obj = new ArrayMoveZeroToEnd();

		int[] nums = { 1, 5, 0, 5, 0, 0, 7 };

		obj.moveZeroes(nums); // Move zeros to the end
		System.out.println("moving zeros to the end: " + Arrays.toString(nums));
	}
}