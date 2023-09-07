package strategy;

/*
 * @author Tilak Patel
 */
class OBlockBehavior implements OffenseBehavior {
    @Override
    public String play() {
        return "Block for the ball carrier";
    }
}