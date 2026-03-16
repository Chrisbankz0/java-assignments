import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SecondHighestDividedBySecondLowestTest {

    @Test
    public void testSecondLargest(){
	int [] numbers = {10,2,5,7,1,6,9};
	SecondHighestDividedBySecondLowest call = new SecondHighestDividedBySecondLowest();
	int expectedNumber = call.secondLargest(numbers);
	int actualNumber = 9;
	assertEquals(actualNumber, expectedNumber);
	}


    @Test
    public void testLargest(){
	int [] numbers = {2,5,7,1,6,9};
	SecondHighestDividedBySecondLowest call = new SecondHighestDividedBySecondLowest();
	int expectedNumber = call.largest(numbers);
	int actualNumber = 9;
	assertEquals(actualNumber, expectedNumber);
	}


    @Test
    public void testSecondLowest(){
	int [] numbers = {2,6,7,1,5};
	SecondHighestDividedBySecondLowest call = new SecondHighestDividedBySecondLowest();
	int expectedNumber = call.secondLowest(numbers);
	int actualNumber = 2;
	assertEquals(actualNumber, expectedNumber);
	}
	

    @Test
    public void testLowest(){
	int [] numbers = {2,6,7,1,5};
	SecondHighestDividedBySecondLowest call = new SecondHighestDividedBySecondLowest();
	int expectedNumber = call.lowest(numbers);
	int actualNumber = 1;
	assertEquals(actualNumber, expectedNumber);
	}
	
	


}