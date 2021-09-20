public class getDuration {
    public static void main(String[] args) {
        getDurationString(124,34);
        System.out.println(getDurationString(124,34));
        System.out.println(getDurationString(1213));
    }

    public static String getDurationString(double minutes, double seconds){
        if((minutes <0) || (seconds <0 || seconds >59)){
            return "Invalid value";
        }
        return ((int)(minutes / 60)) + "h " + (minutes%60) + "m " + (seconds) + "s";
    }

    public static String getDurationString(double seconds){
        if(seconds <0 ){
            return "Invalid value";
        }
        return getDurationString((int)(seconds / 60), (seconds%60));
    }
}
