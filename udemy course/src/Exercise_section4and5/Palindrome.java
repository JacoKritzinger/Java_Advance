package Exercise_section4and5;

public class Palindrome {
    public static boolean isPalindrome(int number){
        int num = number;
        int reverse = 0;

        while (num != 0) {
            int lastDigit = num % 10;
            reverse *= 10;
            reverse += lastDigit;
            num /= 10;

        }

        if(reverse == number){
            return true;
        }else{
            return false;
        }
    }
}
