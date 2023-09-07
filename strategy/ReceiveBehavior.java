package strategy;

/*
 * @author Tilak Patel
 */
class ReceiveBehavior implements OffenseBehavior {
    @Override
    public String play() {
        return "Catch the pass";
    }
}