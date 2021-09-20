public class calcFeetAndInchesToCentimeters {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(12, 12));
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if((feet < 0) || ((inches < 0) && (inches > 12))){
            return -1;
        }
        return (((feet * 12) * 2.54)+(inches * 2.54));
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0){
            return -1;

        }
        double feet = (int) (inches/12);
        double inches2 = inches%12;
        return calcFeetAndInchesToCentimeters(feet, inches2);



    }
}
