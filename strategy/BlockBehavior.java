package strategy;

/*
 * @author Tilak Patel
 */
class BlockBehavior implements DefenseBehavior {
    @Override
    public String play() {
        return "Block Defenders";
    }
}