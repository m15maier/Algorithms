package Coins;

public class Utils {

    public static int determineCost(int activityStart, int activityEnd) {
        int edge = 13;
        int temp = (activityStart + activityEnd) / 2;

        if (temp >= edge) {
            return 2;
        } else {
            return 1;
        }
    }
}
