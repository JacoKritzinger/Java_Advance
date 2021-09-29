package exercises;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        long average = 0;
        while(scanner.hasNextInt()){
            int num = scanner.nextInt();
            sum+=num;
            count++;
            average = Math.round((double)sum/count);
        }
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }
}
