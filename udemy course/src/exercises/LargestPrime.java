package exercises;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if(number <= 1) return -1;

        for (int primeFactor = 2;primeFactor < number;primeFactor++) {
            if (number%primeFactor ==0) {
                number /= primeFactor;
                primeFactor--;
            }
        }
        return number;

    }
}
