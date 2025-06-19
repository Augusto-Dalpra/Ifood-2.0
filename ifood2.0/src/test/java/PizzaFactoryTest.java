import org.junit.Test;
import static org.junit.Assert.*;

public class PizzaFactoryTest {
    @Test
    public void testCriarItemBase() {
        ItemFactory factory = new PizzaFactory();
        Item item = factory.criarItemBase();
        assertTrue(item instanceof PizzaMarguerita);
    }

    @Test
    public void testCriarItemPremium() {
        ItemFactory factory = new PizzaFactory();
        Item item = factory.criarItemPremium();
        assertTrue(item instanceof PizzaCalabresa);
    }
}