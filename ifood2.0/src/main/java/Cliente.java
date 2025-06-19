class Cliente implements Observador {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void atualizar(Pedido pedido) {
        // Cliente recebe notificação (ex.: e-mail, push)
    }
}