class AguardandoPagamento implements EstadoPedido {
    public void avancar(Pedido pedido) {
        pedido.setEstado(new EmPreparacao());
        pedido.notificarObservadores();
    }
    public void cancelar(Pedido pedido) {
        pedido.setEstado(new Cancelado());
        pedido.notificarObservadores();
    }
}