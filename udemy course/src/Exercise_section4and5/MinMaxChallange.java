package Exercise_section4and5;

import java.util.Scanner;

public class MinMaxChallange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 0; //Integer.MIN_Value
        int max = 0; //Integer.MAX_Value
        boolean first = true;

        while (true) {
            System.out.println("Enter a number:");

            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();

                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }

                if (number > max) {
                    max = number;
                }

                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }

        System.out.println("Max value is " + max);
        System.out.println("Min value is " + min);

        scanner.close();
    }
}