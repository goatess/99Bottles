package botella;

public class App {
    public String getLine(int remainingBottles) {
        int nextBottles = remainingBottles - 1;
        String bottles = " bottles of beer";
        String bottle = " bottle of beer";
        String onTheWall = " on the wall";
        String bottlesWall = bottles + onTheWall;
        String takeOne = "Take one down and pass it around, ";
        String dot = ". ";
        String comma = ", ";
        String noMore = "no more";
        String noMoreUpper = noMore.substring(0, 1).toUpperCase() + noMore.substring(1);
        String goTo = "Go to the store and buy some more, 99" + bottlesWall + dot;

        if (remainingBottles == 0) {
            return noMoreUpper + bottlesWall + comma + noMore + bottles + dot + goTo;
        } else if (remainingBottles == 1) {
            return remainingBottles + bottle + onTheWall + comma + remainingBottles + bottle + dot + takeOne + noMore
                    + bottlesWall + dot;
        } else if (remainingBottles == 2) {
            return remainingBottles + bottlesWall + comma + remainingBottles + bottles + dot + takeOne + nextBottles
                    + bottle + onTheWall + dot;
        } else
            return remainingBottles + bottlesWall + comma + remainingBottles + bottles + dot + takeOne + nextBottles
                    + bottlesWall + dot;
    }

    public String getSong() {
        String newSong = "";
        for (int remainingBottles = 99; remainingBottles >= 0; remainingBottles--) {
            newSong += getLine(remainingBottles);
        }
        return newSong;
    }
}
