import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PedidoTest {
    private Pedido pedido;
    private TestObservador observador;

    private class TestObservador implements Observador {
        public boolean atualizado = false;
        @Override
        public void atualizar(Pedido pedido) {
            atualizado = true;
        }
    }

    @Before
    public void setUp() {
        pedido = new PedidoComida();
        observador = new TestObservador();
    }

    @Test
    public void testCalcularTotal() {
        ItemFactory itemFactory = new PizzaFactory();
        Item item = itemFactory.criarItemBase(); // PizzaMarguerita, 30.0
        pedido.adicionarItem(item);
        assertEquals(35.0, pedido.calcularTotal(), 0.01); // 30.0 + 5.0 (EntregaPadrao)
    }

    @Test
    public void testAvancarEstado() {
        assertTrue(pedido.estado instanceof AguardandoPagamento);
        pedido.avancar();
        assertTrue(pedido.estado instanceof EmPreparacao);
        pedido.avancar();
        assertTrue(pedido.estado instanceof EmEntrega);
        pedido.avancar();
        assertTrue(pedido.estado instanceof Entregue);
    }

    @Test
    public void testCancelarPedido() {
        pedido.cancelar();
        assertTrue(pedido.estado instanceof Cancelado);
    }

    @Test
    public void testNotificarObservadores() {
        pedido.adicionarObservador(observador);
        assertFalse(observador.atualizado);
        pedido.avancar();
        assertTrue(observador.atualizado);
    }
}