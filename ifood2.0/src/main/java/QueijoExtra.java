class QueijoExtra extends AdicionalDecorator {
    public QueijoExtra(Item item) {
        super(item);
    }
    public double getPreco() {
        return item.getPreco() + 5.0;
    }
    public String getDescricao() {
        return item.getDescricao() + ", Queijo Extra";
    }
}