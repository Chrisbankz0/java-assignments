public class SecondHighestDividedBySecondLowest {

    public static int secondLargest(){

        int [] numbers = {2,5,7,1,6,9};

        int largest = numbers[0];
        int secondLargest = numbers[1];

        int lowest = numbers[0];
        int secondlowest = numbers[1];

        for (int index = 2; index < numbers.length; index++) {
            if (numbers[index] > largest) {
                secondLargest = largest;
                largest = numbers[index];
            }
            else if (numbers[index] > secondLargest && numbers[index] != largest) {
                secondLargest = numbers[index];
            }
        }

        for (int index = 2; index < numbers.length; index++) {
            if (numbers[index] < lowest) {
                secondlowest = lowest;
                lowest = numbers[index];
            }
            else if (numbers[index] < secondlowest && numbers[index] != lowest) {
                secondlowest = numbers[index];
            }
        }

        int result = secondLargest - secondlowest;
        return result;
    }



    public static int secondLowest(){

        int [] numbers = {2,6,7,1,5};

        int largest = numbers[0];
        int secondLargest = numbers[1];

        int lowest = numbers[0];
        int secondlowest = numbers[1];

        for (int index = 2; index < numbers.length; index++) {
            if (numbers[index] > largest) {
                secondLargest = largest;
                largest = numbers[index];
            }
            else if (numbers[index] > secondLargest && numbers[index] != largest) {
                secondLargest = numbers[index];
            }
        }

        for (int index = 2; index < numbers.length; index++) {
            if (numbers[index] < lowest) {
                secondlowest = lowest;
                lowest = numbers[index];
            }
            else if (numbers[index] < secondlowest && numbers[index] != lowest) {
                secondlowest = numbers[index];
            }
        }

        int result = secondLargest - secondlowest + 1;
        return result;
    }
}