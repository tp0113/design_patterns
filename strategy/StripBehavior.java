package strategy;

/*
 * @author Tilak Patel
 */
class StripBehavior implements DefenseBehavior {
    @Override
    public String play() {
        return "Strip the ball";
    }
}