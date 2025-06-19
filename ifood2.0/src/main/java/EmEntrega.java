class EmEntrega implements EstadoPedido {
    public void avancar(Pedido pedido) {
        pedido.setEstado(new Entregue());
        pedido.notificarObservadores();
    }
    public void cancelar(Pedido pedido) {
        // Não permite cancelar
    }
}