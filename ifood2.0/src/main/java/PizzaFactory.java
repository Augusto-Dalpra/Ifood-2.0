class PizzaFactory implements ItemFactory {
    public Item criarItemBase() {
        return new PizzaMarguerita();
    }
    public Item criarItemPremium() {
        return new PizzaCalabresa();
    }
}
