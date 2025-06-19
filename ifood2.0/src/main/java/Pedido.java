import java.util.ArrayList;
import java.util.List;

abstract class Pedido {
    protected EstadoPedido estado;
    protected List<Item> itens;
    protected List<Observador> observadores;

    public Pedido() {
        this.estado = new AguardandoPagamento();
        this.itens = new ArrayList<>();
        this.observadores = new ArrayList<>();
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public void avancar() {
        estado.avancar(this);
    }

    public void cancelar() {
        estado.cancelar(this);
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Item item : itens) {
            total += item.getPreco();
        }
        TabelaTaxas taxas = TabelaTaxas.getInstancia();
        total += taxas.getTaxa("EntregaPadrao");
        return total;
    }

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.atualizar(this);
        }
    }
}