package section_8;

import java.util.Scanner;

public class MinimumElement {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntrgers(count);
        int returnedMin = findMin(returnedArray);

        System.out.println("min = " + returnedMin);

    }

    public static int[] readIntrgers(int count) {

        int[] array= new int[count];

        for(int i = 0; i<array.length; i++)    {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;

        }
        return array;
    }

    private static int findMin(int[] array) {

        int min = Integer.MAX_VALUE;

        for(int i=0; i<array.length; i++)   {
            int value = array[i];
            if(value < min) {
                min = value;
            }
        }
        return min;
    }
}

