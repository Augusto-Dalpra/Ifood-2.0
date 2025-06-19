class PedidoBebidaFactory implements PedidoFactory {
    public Pedido criarPedido() {
        return new PedidoBebida();
    }
}