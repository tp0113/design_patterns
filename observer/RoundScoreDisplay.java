package observer;

/**
 * RoundScoreDisplay represents a display for the total score of a golfer's round.
 */
class RoundScoreDisplay implements Observer {
    private Subject golfer; // The golfer being observed.
    private int strokesTotal; // Total strokes taken by the golfer in the round.
    private int parTotal; // Total par value for the holes played in the round.

    /**
     * Creates a new RoundScoreDisplay instance for a golfer and registers it as an observer.
     *
     * @param golfer The golfer being observed.
     */
    public RoundScoreDisplay(Subject golfer) {
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    /**
     * Updates the displayed round score with new stroke and par values.
     *
     * @param strokes The number of strokes taken on the current hole.
     * @param par     The par value for the current hole.
     */
    public void update(int strokes, int par) {
        strokesTotal += strokes;
        parTotal += par;
        display();
    }

    /**
     * Generates a string representation of the round score.
     *
     * @return A string showing the total strokes and par for the round.
     */
    public String toString() {
        return "Round Score: Strokes Total = " + strokesTotal + ", Par Total = " + parTotal;
    }

    // Private method to display the round score.
    private void display() {
        System.out.println(toString());
    }
}
