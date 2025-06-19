class EmPreparacao implements EstadoPedido {
    public void avancar(Pedido pedido) {
        pedido.setEstado(new EmEntrega());
        pedido.notificarObservadores();
    }
    public void cancelar(Pedido pedido) {
        pedido.setEstado(new Cancelado());
        pedido.notificarObservadores();
    }
}