import java.util.*;

public class Print2DArray {
    public static void main(String[] args) {
        int[][] arr = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        for (int[] row : arr) System.out.println(Arrays.toString(row));
    }
}
