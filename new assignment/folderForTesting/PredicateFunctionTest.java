import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class PredicateFunctionTest {


    @Test
    public void testDoubleAndAppend() {

        int[] input = {2, 6, 7, 10, 5};

        boolean[] expected = {true,true,false,true,false};

        int[] actual = LengthOfNumbers.doubleAndAppend(input);

        assertArrayEquals(expected, actual);
    }


    @Test
    public void testDoubleAndAppend() {

        int[] input = {2, 6, 7, 1, 5};

        int[] expected = {2, 6, 7, 1, 5, 4, 12, 14, 2, 10};

	int[] actual = PredicateFunction.doubleAndAppend(input);

        assertArrayEquals(expected, actual);
    }


}