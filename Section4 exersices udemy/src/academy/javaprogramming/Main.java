package academy.javaprogramming;

public class Main {


//      1.
//        public static long toMilesPerHour(double kilometersPerHour){
//            if (kilometersPerHour < 0){
//                return -1;
//            }
//            return Math.round((kilometersPerHour / 1.609));
//        }
//
//        public static void printConversion(double kilometersPerHour){
//            if (kilometersPerHour < 0){
//                System.out.println("Invalid Value");;
//            }
//            else{
//                System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
//            }
//        }
//    }
//      2.
//    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
//        if (kiloBytes > 0) {
//            double remainder = kiloBytes % 1024;
//            System.out.println(kiloBytes + " KB = " + ((kiloBytes / 1024) - remainder) + " MB " + (remainder * 1024) + " KB");
//        }
//        else{
//            System.out.println("Invalid Value");
//        }
//    }
//}

//    3.

//    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
//        if (hourOfDay < 0 || hourOfDay > 23){
//            return false;
//        }
//        else if ((barking) && (hourOfDay < 8 || hourOfDay > 22)){
//            return true;
//        }
//        return false;
//    }
//}

//    4.
//    public static boolean isLeapYear(int year) {
//        if (year >= 1 && year <= 9999) {
//            if ((year % 4) == 0) {
//                if ((year % 100) == 0) {
//                    if ((year % 400) == 0) {
//                        return true;
//                    }
//                } else {
//                    return true;
//                }
//            }
//
//        }
//        return false;
//    }
//}
//      5.
//    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
//
//        int num11 = (int)(num1 * 1000);
//        int num22 = (int)(num2 * 1000);
//
//        if(num11 == num22){
//            return true;
//        }
//        return false;
//
//    }
//
//}

//        6.

//    public static boolean hasEqualSum(int num1, int num2, int num3) {
//        if ((num1 + num2) == num3) {
//            return true;
//        }
//        return false;
//    }
//}




//        7.
//
//    public static boolean hasTeen(int a, int b, int c) {
//        return ((13 <= a && a <= 19)
//                || (13 <= b && b <= 19) ||
//                (13 <= c && c <= 19));
//    }
//
//    public static boolean isTeen(int a) {
//        return (13 <= a && a <= 19);
//    }
//}