package academy.javaprogramming;

public class section_5_ControlFlowAndStatements {

//    public static void main(String[] args) {
//        challange video 64
//
//        int value = 3;
//        if(value == 1) {
//            System.out.println("Value was 1");
//        }else if(value == 2) {
//            System.out.println("Value was 2");
//        }else{
//            System.out.println("Value was not 1 or 2");
//
//        }
//      public static void main(String[] args) {
//        int switchValue = 3;
//
//        switch(switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//
//            case 2:
//                System.out.println("Value was 2");
//                break;
//
//            case 3: case 4: case 5:
//                System.out.println("Value was a 3, or a 4, or a 5");
//                System.out.println("actually is was a " + switchValue);
//                break;
//
//            default:
//                System.out.println("Value was not 1 or 2");
//                break;
//        }
//
//    public static void main(String[] args) {
//        char Letter = 'Z';
//
//        switch (Letter) {
//
//            case 'A':
//                System.out.println("Letter is A");
//                break;
//            case 'B':
//                System.out.println("Letter is B");
//                break;
//            case 'C':
//                System.out.println("Letter is C");
//                break;
//            case 'D':
//                System.out.println("Letter is D");
//                break;
//            case 'E':
//                System.out.println("Letter is E");
//                break;
//
//            default:
//                System.out.println("Letter is not A,B,C,D or E");
//        }
//
//        challange video 64
//
//        public static void main(String[] args) {
//        PrintDayOfWeek(3);
//        PrintDayWeek(3);
//    }
//
//    public static void PrintDayOfWeek(int day) {
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Invalid day");
//
//        }
//    }
//
//        public static void PrintDayWeek( int day){
//            if (day == 1) {
//                System.out.println("Monday");
//            } else if (day == 2) {
//                System.out.println("Tuesday");
//            } else if (day == 3) {
//                System.out.println("Wednesday");
//            } else if (day == 4) {
//                System.out.println("Thursday");
//            } else if (day == 5) {
//                System.out.println("Friday");
//            } else if (day == 6) {
//                System.out.println("Saturday");
//            } else if (day == 7) {
//                System.out.println("Sunday");
//
//            } else {
//                System.out.println("Invalid Day");
//            }
//        }
//    }


//    video 65

//    public static void main(String[] args) {
//
//
//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
//        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
//        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
//        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("loop " + i + " hello!");
//
//        }
//
//        for (int i = 2; i < 9; i++) {
//            System.out.println("10,000 at " + i + " % interest = " + calculateInterest(10000.0, i));
//
//        }
//        System.out.println("");
//        for (int i = 8; i > 1; i--) {
//            System.out.println("10,000 at " + i + " % interest = " + calculateInterest(10000.0, i));
//        }
//
//
//            int count = 0;
//
//            for (int i = 10; i > 50; i++) {
//                if (isPrime(i)) {
//                    count++;
//                    System.out.println("number " + i + " is a prime number");
//                    if (count == 3) {
//                        System.out.println("Exiting the loop");
//                        break;
//                    }
//                }
//            }
//    }
//
//
//        public static boolean isPrime ( int n){
//
//            if (n == 1) {
//                return false;
//            }
//            for (int i = 2; i <= n / 2; i++) {
//                if (n % 1 == 0) {
//                    return false;
//                }
//            }
//            return true;
//        }
//
//
//
//    public static double calculateInterest(double amount, double interestRate) {
//        return (amount * (interestRate / 100));
//    }
//}
//
//        video 67
//
//    public static void main(String[] args) {
//        int count = 0;
//        int sum = 0;
//        for(int i=1; i<=1000; i++){
//            if((i%3 == 0)&&(i%5 == 0)){
//                System.out.println(i);
//                sum += i;
//                count++;
//                if(count == 5){
//                    break;
//                }
//            }
//        }
//        System.out.println(sum);
//
//    }
//


//    video 68

    public static void main(String[] args) {
        int count = 1;
        while(count != 6){
            System.out.println("Count value is " + count);
            count++;

    }

   for()
    }
}