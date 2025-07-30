import java.util.*;

public class problem2_test {

    public static void moveZerosToEnd(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {
        int[] a1 = {0, 1, 0, 4, 21};
        int[] a2 = {1, 0, 2, 0, 3};
        int[] a3 = {0, 0, 0, 0};
        int[] a4 = {5, 4, 3, 2};
        int[] a5 = {0, 0, 1};

        runTest(a1);
        runTest(a2);
        runTest(a3);
        runTest(a4);
        runTest(a5);
    }

    static void runTest(int[] nums) {
        moveZerosToEnd(nums);
        System.out.println( Arrays.toString(nums));
    }
}
