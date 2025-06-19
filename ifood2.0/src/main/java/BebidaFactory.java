class BebidaFactory implements ItemFactory {
    public Item criarItemBase() {
        return new Refrigerante();
    }
    public Item criarItemPremium() {
        return new SucoNatural();
    }
}
