package strategy;

/*
 * @author Tilak Patel
 */
class PassBehavior implements OffenseBehavior {
    @Override
    public String play() {
        return "Throw a pass";
    }
}