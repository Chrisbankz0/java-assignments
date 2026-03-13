public class SecondHighestDividedBySecondLowest {

    public int secondLargest(int [] numbers){

        int largest = numbers[0];
        int secondLargest = numbers[1];

	for (int index = 0; index < numbers.length; index++) {
		if (numbers[index] > largest) {
			secondLargest = largest;
			largest = numbers[index];
		}
		else if (numbers[index] > secondLargest && numbers[index] != largest){
			secondLargest = numbers[index];
		}
		

        }
        return secondLargest;


/*
{10,7,9}

*/
    }



    public int largest(int [] numbers){

        int largest = numbers[0];
        int secondLargest = numbers[1];

        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] > largest) {
                largest = numbers[index];
		secondLargest = largest;
            }
        }
        return largest;
    }


    public int secondLowest(int [] numbers){

        int lowest = numbers[0];
        int secondLowest = numbers[1];

        for (int index = 2; index < numbers.length; index++) {
            if (numbers[index] < lowest) {
                secondLowest = lowest;
                lowest = numbers[index];
            }

        }
        return secondLowest;



}



    public int lowest(int [] numbers){

        int lowest = numbers[0];
        int secondLowest = numbers[1];


        for (int index = 2; index < numbers.length; index++) {
		if (numbers[index] < lowest) {
			lowest = numbers[index];
			secondLowest = lowest;
		}
	}
        return lowest;
}
}