package JavaProgramPractise;
public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 121;
        if (isPalindrome(number)) 
        {
            System.out.println(number + " is a palindrome.");
        } 
        else 
        {
            System.out.println(number + " is not a palindrome.");
        }
    }
    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) 
        {
            int digit = num % 10; 
            reversedNum = reversedNum * 10 + digit;
            num = num / 10;
        }
        return originalNum == reversedNum;
    }
}
