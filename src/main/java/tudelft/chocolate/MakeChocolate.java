package tudelft.chocolate;

public class MakeChocolate {
    public int makeChocolate(int small, int big, int goal) {
        int maxBigBars = goal / 5;
        int bigBarsWeCanUse = maxBigBars < big ? maxBigBars : big;
        goal -= (bigBarsWeCanUse * 5);

        if(small <= goal)
            return -1;

        return goal;

    }
}
