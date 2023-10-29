package Coins;
// жадный алгоритм не дает точного ответа, так как может пропустить более выгодное решение,
// которое было бы достигнуто, если бы были рассмотрены все возможные варианты.

import java.util.ArrayList;
import java.util.List;

public class Coins {
    public static void main(String[] args) {
        List<Activity> list = new ArrayList<>();

        list.add (new Activity("1", 10, 14, Utils.determineCost(10, 14)));
        list.add (new Activity("1", 10, 13, Utils.determineCost(10, 13)));
        list.add (new Activity("1", 13, 15, Utils.determineCost(13, 15)));
        list.add (new Activity("1", 12, 16, Utils.determineCost(12, 16)));
        list.add (new Activity("1", 15, 17, Utils.determineCost(15, 17)));
        list.add (new Activity("1", 12, 14, Utils.determineCost(12, 14)));


    ActivitySelection activitySelection = new ActivitySelection();
    activitySelection.selectActivity(list);
    }
}
