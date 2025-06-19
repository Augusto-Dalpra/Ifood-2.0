abstract class SuporteHandler {
    protected SuporteHandler proximo;

    public void setProximo(SuporteHandler proximo) {
        this.proximo = proximo;
    }

    abstract void tratar(Problema problema);
}