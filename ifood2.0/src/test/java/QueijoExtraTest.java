import org.junit.Test;
import static org.junit.Assert.*;

public class QueijoExtraTest {
    @Test
    public void testGetPreco() {
        Item base = new PizzaMarguerita();
        Item decorated = new QueijoExtra(base);
        assertEquals(35.0, decorated.getPreco(), 0.01);
    }

    @Test
    public void testGetDescricao() {
        Item base = new PizzaMarguerita();
        Item decorated = new QueijoExtra(base);
        assertEquals("Pizza Marguerita, Queijo Extra", decorated.getDescricao());
    }
}