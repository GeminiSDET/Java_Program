package JavaProgramPractise;

public class ExceptionMultipleCatchExample {
    public static void main(String[] args) {
        try 
        {
            int result = 10 / 0; // This will throw an ArithmeticException
        } 
        catch (ArithmeticException e)
        {
            System.out.println("B"); // Handles ArithmeticException
        } 
        catch (Exception e) 
        {
            System.out.println("A"); // Handles all other exceptions
        }
    }
}
