package exercise_section4and5;

import java.util.Scanner;

public class UserInputChallange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while ((count >= 0) && (count < 11)) {
            int num = count + 1;
            System.out.println("Enter number # " + num);
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();

                count++;
                sum += number;

            } else {
                System.out.println("Invalid number");

            }

            scanner.nextLine();
        }
        System.out.println("Sum = " + sum);
        scanner.close();

    }
}