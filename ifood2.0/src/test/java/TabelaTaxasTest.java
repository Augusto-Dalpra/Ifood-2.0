import org.junit.Test;
import static org.junit.Assert.*;

public class TabelaTaxasTest {
    @Test
    public void testGetInstancia() {
        TabelaTaxas inst1 = TabelaTaxas.getInstancia();
        TabelaTaxas inst2 = TabelaTaxas.getInstancia();
        assertSame(inst1, inst2);
    }

    @Test
    public void testGetTaxa() {
        TabelaTaxas taxas = TabelaTaxas.getInstancia();
        assertEquals(5.0, taxas.getTaxa("EntregaPadrao"), 0.01);
        assertEquals(10.0, taxas.getTaxa("RestaurantePremium"), 0.01);
    }
}