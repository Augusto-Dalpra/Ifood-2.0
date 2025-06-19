class Gelo extends AdicionalDecorator {
    public Gelo(Item item) {
        super(item);
    }
    public double getPreco() {
        return item.getPreco() + 2.0;
    }
    public String getDescricao() {
        return item.getDescricao() + ", Gelo";
    }
}