package section_8;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        int[] nums = getIntegers(5);
        Arrays.sort(nums);
        printArray(sortIntegers(nums));

    }

    public static int[] getIntegers(int number) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[number];
        System.out.println("Enter " + number + " numbers: \r");

        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();

        }

        return nums;

    }

    public static int[] sortIntegers(int[] nums) {

        int[] sortedArray = Arrays.copyOf(nums, nums.length);

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;

            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;


    }

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Element " + i + " contents " + nums[i]);
        }
    }
}

