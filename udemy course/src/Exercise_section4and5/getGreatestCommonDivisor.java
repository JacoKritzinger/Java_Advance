package Exercise_section4and5;

public class getGreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int num1,int num2){
        if (num1 < 10 || num2 < 10){
            return -1;
        }

        int div = 0;
        int big;

        if (num1 > num2){
            big = num1;
        }else {
            big = num2;
        }

        for (int i = 1; i <= big; i++){
            if (num1 % i == 0 && num2 % i == 0){
                div = i;
            }
        }
        return div;
    }
}
