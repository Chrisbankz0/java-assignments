public class Statistics {

	public static double mean(double[] numbers) {
		double sumOfNumbers = 0;

	for (int index = 0; index < numbers.length; index++) {
		sumOfNumbers = sumOfNumbers + numbers[index];
	}

	return sumOfNumbers / numbers.length;
}

	public static double variance(double[] numbers) {
		double meanValue = mean(numbers);
		double sumOfSquaredDifferences = 0;

	for (int index = 0; index < numbers.length; index++) {
		double difference = numbers[index] - meanValue;
		sumOfSquaredDifferences = sumOfSquaredDifferences + Math.pow(difference, 2);
	}

	return sumOfSquaredDifferences / numbers.length;
	}

	public static double standardDeviation(double[] numbers) {
		return Math.sqrt(variance(numbers));
	}
}