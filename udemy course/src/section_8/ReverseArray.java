import java.util.Arrays;
import java.util.Scanner;



public class ReverseArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        reverse(array);
    }

    private static void reverse(int[] nums) {
        System.out.println("Array = " + Arrays.toString(nums));

        int j = nums.length;
        int temp = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            j--;
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        System.out.println("Reversed array = " + Arrays.toString(nums));

    }
}



