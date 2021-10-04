package exercise_section4and5;

public class FirstAndLastSumDigit {
    public static int sumFirstAndLastDigit(int number){
        if (number < 0){
            return -1;
        }
        int lastnumber = number % 10;
        int firstNumber = 0;

        while (number >0) {
            int digit = number % 10;
            if (number < 10){
                firstNumber = digit;
            }

            number /= 10;
        }
        return firstNumber + lastnumber;
    }
}
