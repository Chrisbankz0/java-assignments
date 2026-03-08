import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StatisticsTest {

	@Test
	void testMean() {
		double[] numbers = {2, 4, 6, 8};
		assertEquals(5.0, Statistics.mean(numbers));
	}

	@Test
	void testVariance() {
		double[] numbers = {2, 4, 6, 8};
		assertEquals(5.0, Statistics.variance(numbers));
	}

	@Test
	void testStandardDeviation() {
		double[] numbers = {2, 4, 6, 8};
		assertEquals(Math.sqrt(5), Statistics.standardDeviation(numbers));
	}
}