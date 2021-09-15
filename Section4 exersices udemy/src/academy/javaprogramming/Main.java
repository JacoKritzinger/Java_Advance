package academy.javaprogramming;

public class Main {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes > 0) {
            double remainder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + ((kiloBytes / 1024) - remainder) + " MB " + (remainder * 1024) + " KB");
        }
        else{
            System.out.println("Invalid Value");
        }
    }
}
