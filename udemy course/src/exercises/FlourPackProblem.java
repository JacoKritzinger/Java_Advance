package exercises;

public class FlourPackProblem {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;
        int big = 5;
        int total = (big * bigCount) + smallCount;
        if (total < goal) {
            return false;
        } else if (goal == total) {
            return true;
        } else {
            if (goal % big <= smallCount) {
                return true;
            } else {
                return false;
            }
        }
    }
}
