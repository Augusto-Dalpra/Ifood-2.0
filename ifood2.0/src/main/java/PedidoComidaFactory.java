class PedidoComidaFactory implements PedidoFactory {
    public Pedido criarPedido() {
        return new PedidoComida();
    }
}