class Chatbot extends SuporteHandler {
    public void tratar(Problema problema) {
        if (!problema.getTipo().equals("Troca") && proximo != null) {
            proximo.tratar(problema);
        }
    }
}