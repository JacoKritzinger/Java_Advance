package academy.javaprogramming;

public class Main {


//    1.
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
//2.
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

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23){
            return false;
        }
        else if ((barking) && (hourOfDay < 8 || hourOfDay > 22)){
            return true;
        }
        return false;
    }
}
