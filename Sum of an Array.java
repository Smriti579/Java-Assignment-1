import java.util.*;

public class SumArray {
    public static void main(String[] args) {
        int[] arr = {5, 1, 8, 3, 2};
        int sum = 0;
        for (int num : arr) sum += num;
        System.out.println("Sum: " + sum);
    }
}
