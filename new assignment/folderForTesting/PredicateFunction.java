public class PredicateFunction {

    public static int[] doubleAndAppend(int[] input) {

        int[] result = new int[input.length * 2];

        for (int count = 0; count < input.length; count++) {
            result[count] = input[count];
        }

        for (int count = 0; count < input.length; count++) {
            result[count + input.length] = input[count] * 2;
        }

        return result;
    }



	public static boolean[] evenNumber(int[] numbers) {

	boolean[] numberOfArray = new boolean[numbers.length];

	for (int index = 0; index < numbers.length; index++) {

		if (numbers[index] % 2 == 0) {
			numberOfArray[index] = true;
		}
		else {
			numberOfArray[index] = false;
		}
	}

	return numberOfArray;
 	}

}