package JavaProgramPractise;
import java.util.HashSet;

public class HashSetScenerioHandle {
	public static void main(String[] args) {
       String[] usernames = {"student1", "student@2", "student 3","ValidUser"};
       HashSet<String> validUsernames=new HashSet<String>();
       
       for(String username:usernames)
       {
    	   if(isValidUsername(username))
    	   {
    		   if(validUsernames.contains(username))
    		   {
    			   System.out.println("InValid Dup" + username);
    		   }
    		   else
    		   {
    			   validUsernames.add(username);
    			   System.out.println("Valid " + username);
    		   }
    	   }
    	   else
    	   {
    		   System.out.println("Invalid contains special char " +username);
    	   }
       }
	}
       public static boolean isValidUsername(String username)
       {
    	   return username.matches("^[a-zA-Z0-9]+$");
       }
	}
