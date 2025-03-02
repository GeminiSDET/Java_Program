package JavaProgramPractise;

public class Array_RotateArray {
		
		public static void rotateArray(int[] arr, int rotationCount) {
	        int n = arr.length;
	        
	        rotationCount = rotationCount % n;
	        
	        int[] rotatedArray = new int[n];
	        
	        for (int i = 0; i < n; i++) {
	            rotatedArray[i] = arr[(i + rotationCount) % n];
	        }
	        
	        System.out.println("Rotated Array:");
	        for (int num : rotatedArray) {
	            System.out.print(num + " ");
	        }
	    }
	    public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 5, 6, 7};
	        int rotationCount = 2; // Rotate by 2 positions

	        System.out.println("Original Array:");
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	        
	        rotateArray(array, rotationCount);
	    }
	}
