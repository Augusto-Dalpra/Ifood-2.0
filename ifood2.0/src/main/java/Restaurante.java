class Restaurante implements Observador {
    private String nome;

    public Restaurante(String nome) {
        this.nome = nome;
    }

    public void atualizar(Pedido pedido) {
        // Restaurante recebe notificação
    }
}