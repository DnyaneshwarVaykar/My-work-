import java.util.HashSet;

public class DuplicateArray {
    public static void main (String[] args) {
        int[] arr = {1,2,4,2,7,3,4,5,6,7,8,9,10};

        HashSet<Integer> seen = new HashSet<>();
        int duplicate = -1;
        for (int num : arr) {
            if (seen.contains(num)) {
                duplicate = num;
                break; // Found a duplicate, exit the loop
            }
            seen.add(num);

        }
        System.out.println("Duplicate number is: " + duplicate);
    }
}
