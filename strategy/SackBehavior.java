package strategy;

/*
 * @author Tilak Patel
 */
class SackBehavior implements DefenseBehavior {
    @Override
    public String play() {
        return "Sack the quarterback";
    }
}
