import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FunctionsTest {

    @Test
    public void testEvenCharacters() {

        String result = Functions.evenCharacters("Beijing Chicago");

        assertEquals("ejnhcg", result);
    }

    @Test
    public void testCombination() {

        long result = Functions.combination(7, 2);

        assertEquals(21, result);
    }
}