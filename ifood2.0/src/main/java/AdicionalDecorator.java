abstract class AdicionalDecorator implements Item {
    protected Item item;

    public AdicionalDecorator(Item item) {
        this.item = item;
    }
}