package JavaProgramPractise;
import java.util.HashSet;
public class HashSetArrayDuplicate {
    public static void main(String[] args) {
        int a[] = {2, 2, 7, 5, 8, 9, 4, 6, 5};

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> dup = new HashSet<>();

        for (int num : a) 
        {
            if (!set.add(num)) 
            { 
                dup.add(num);
            }
        }
        if (dup.isEmpty())
        {
            System.out.println("No duplicates found.");
        }
        else 
        {
            System.out.println(dup);
        }
    }
}
