

public class section_5_ControlFlowAndStatements {

    public static void main(String[] args) {

//        int value = 3;
//        if(value == 1) {
//            System.out.println("Value was 1");
//        }else if(value == 2) {
//            System.out.println("Value was 2");
//        }else{
//            System.out.println("Value was not 1 or 2");
//
//        }

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

//        public static void main(String[] args) {
        PrintDayOfWeek(3);
        PrintDayWeek(3);
    }

    public static void PrintDayOfWeek(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");

        }
    }

        public static void PrintDayWeek( int day){
            if (day == 1) {
                System.out.println("Monday");
            } else if (day == 2) {
                System.out.println("Tuesday");
            } else if (day == 3) {
                System.out.println("Wednesday");
            } else if (day == 4) {
                System.out.println("Thursday");
            } else if (day == 5) {
                System.out.println("Friday");
            } else if (day == 6) {
                System.out.println("Saturday");
            } else if (day == 7) {
                System.out.println("Sunday");

            } else {
                System.out.println("Invalid Day");
            }
        }
    }
