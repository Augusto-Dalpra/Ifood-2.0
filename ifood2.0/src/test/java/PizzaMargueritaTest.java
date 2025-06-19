import org.junit.Test;
import static org.junit.Assert.*;

public class PizzaMargueritaTest {
    @Test
    public void testGetPreco() {
        Item item = new PizzaMarguerita();
        assertEquals(30.0, item.getPreco(), 0.01);
    }

    @Test
    public void testGetDescricao() {
        Item item = new PizzaMarguerita();
        assertEquals("Pizza Marguerita", item.getDescricao());
    }
}