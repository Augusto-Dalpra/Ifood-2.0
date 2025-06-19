class Atendente extends SuporteHandler {
    public void tratar(Problema problema) {
        if (!problema.getTipo().equals("Estorno") && proximo != null) {
            proximo.tratar(problema);
        }
    }
}