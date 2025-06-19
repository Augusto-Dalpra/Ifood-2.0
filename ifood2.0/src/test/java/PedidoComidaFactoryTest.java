import org.junit.Test;
import static org.junit.Assert.*;

public class PedidoComidaFactoryTest {
    @Test
    public void testCriarPedido() {
        PedidoFactory factory = new PedidoComidaFactory();
        Pedido pedido = factory.criarPedido();
        assertTrue(pedido instanceof PedidoComida);
    }
}