import org.junit.Test;
import static org.junit.Assert.*;

public class AguardandoPagamentoTest {
    @Test
    public void testAvancar() {
        Pedido pedido = new PedidoComida();
        pedido.setEstado(new AguardandoPagamento());
        pedido.avancar();
        assertTrue(pedido.estado instanceof EmPreparacao);
    }

    @Test
    public void testCancelar() {
        Pedido pedido = new PedidoComida();
        pedido.setEstado(new AguardandoPagamento());
        pedido.cancelar();
        assertTrue(pedido.estado instanceof Cancelado);
    }
}