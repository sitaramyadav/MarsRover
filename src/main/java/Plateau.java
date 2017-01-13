public class Plateau {

    private final int[] bottomLeftCoordinate;
    private int[] topRightCoordinate;

    public Plateau(int[] topRightCoordinate, int[] botomLeftCoordinate) {
        this.topRightCoordinate = topRightCoordinate;
        this.bottomLeftCoordinate = botomLeftCoordinate;
    }

    public int[] getTopRightCoordinate() {
        return topRightCoordinate;
    }
}
