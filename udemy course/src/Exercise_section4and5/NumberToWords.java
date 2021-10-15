package Exercise_section4and5;

public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            int num = 0;
            int reverse = reverse(number);
            while (reverse > 0) {
                int digit = reverse % 10;
                switch (digit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        break;
                }

                reverse /= 10;
            }
            int diff = getDigitCount(number) - getDigitCount(reverse(number));
            for (int i = 1; i <= diff; i++) {
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number) {
        int num = number;
        int reverse = 0;

        while (num != 0) {
            int lastDigit = num % 10;
            reverse *= 10;
            reverse += lastDigit;
            num /= 10;

        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        }

        int count = 0;
        while (number > 0) {
            int digit = number % 10;
            count += 1;

            number /= 10;
        }
        return count;
    }
}
