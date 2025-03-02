package JavaProgramPractise;
import java.util.HashMap;
public class HashMapArrayDuplicate {
    public static void main(String[] args) {
        int a[] = {2, 2, 7, 5, 8, 9, 4, 6, 5};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : a) 
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) 
        {
            if (map.get(key) > 1) 
            {
                System.out.println(key);
            }
        }
    }
}
