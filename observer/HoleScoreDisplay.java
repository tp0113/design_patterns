package observer;

/**
 * HoleScoreDisplay is a class that keeps track of a golfer's score on a single hole.
 */
class HoleScoreDisplay implements Observer {
    private Subject golfer; // The golfer being observed.
    private int strokes; // Number of strokes taken on the current hole.
    private int par; // Par value for the current hole.

    /**
     * Creates a new HoleScoreDisplay instance for a golfer and registers it as an observer.
     *
     * @param golfer The golfer being observed.
     */
    public HoleScoreDisplay(Subject golfer) {
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    /**
     * Updates the displayed hole score with new stroke and par values.
     *
     * @param strokes The number of strokes taken on the current hole.
     * @param par     The par value for the current hole.
     */
    public void update(int strokes, int par) {
        this.strokes = strokes;
        this.par = par;
        display();
    }

    /**
     * Generates a text representation of the hole score.
     *
     * @return A string showing the strokes and par for the current hole.
     */
    public String toString() {
        return "Hole Score: Strokes = " + strokes + ", Par = " + par;
    }

    // Private method to display the hole score.
    private void display() {
        System.out.println(toString());
    }
}
