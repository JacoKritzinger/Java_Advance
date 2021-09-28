package exercises;

import java.util.Scanner;

public class UserInputChallange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while ((count >= 0) && (count < 11)) {
            System.out.println("Enter number # " + count + 1);
            boolean isAnInt = Scanner.hasNextInt();

            if(isAnInt) {
                int number = Scanner.nextInt();

                count++;
                sum += number;

                }
            else{
                System.out.println("Invalid number");

            }

            scanner.nextLine();        }

    }
}