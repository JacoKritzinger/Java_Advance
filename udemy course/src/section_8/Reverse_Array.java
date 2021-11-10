//package section_8;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Reverse_Array {
//    public static void main(String[] args) {
//        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
//        reverse(array);
//    }
//
//    private static void reverse(int[] nums) {
//        System.out.println("Array = " + Arrays.toString(nums));
//
//        int j = nums.length;
//        int temp = 0;
//        for (int i = 0; i < nums.length / 2; i++) {
//            j--;
//            temp = nums[i];
//            nums[i] = nums[j];
//            nums[j] = temp;
//        }
//
//        System.out.println("Reversed array = " + Arrays.toString(nums));
//
//    }
//}
//
//public class MinimumElement {
//    public static void main(String[] args) {
//        int length = readInteger();
//        System.out.println(length);
//        int[] nums = readElements(length);
//        System.out.println(findMin(nums));
//
//    }
//
//
//    private static int readInteger() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the length of the array: ");
//        int length = scanner.nextInt();
//        return length;
//    }
//
//    private static int[] readElements(int length) {
//        Scanner scanner = new Scanner(System.in);
//        int[] nums = new int[length];
//        System.out.println("Enter " + length + " numbers: \r");
//
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = scanner.nextInt();
//
//        }
//
//        return nums;
//    }
//
//    private static int findMin(int[] nums) {
//        int minValue = Integer.MAX_VALUE;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] < minValue) {
//                minValue = nums[i];
//            }
//        }
//        return minValue;
//    }
//}
//
