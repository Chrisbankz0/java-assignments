import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AirConditionerTest{

	@Test
	public void testTurnOn(){

		AirConditioner ac = new AirConditioner();

		assertEquals(false, ac.isOn());

		ac.turnOn();

		boolean expectedState = true;
		boolean actualState = ac.isOn();

		assertEquals(expectedState, actualState);
	}


	@Test
	public void testTurnOff(){

		AirConditioner ac = new AirConditioner();

		assertEquals(false, ac.isOn());

		ac.turnOn();
		assertEquals(true, ac.isOn());

		ac.turnOff();

		boolean expectedState = false;
		boolean actualState = ac.isOn();

		assertEquals(actualState, expectedState);
	}


	@Test
	public void testThatAcCanIncreaseTemperature(){

		AirConditioner ac = new AirConditioner();

		ac.turnOn();
		assertEquals(true, ac.isOn());

		int initialTemp = ac.getTemperature();
		assertEquals(initialTemp, 16);

		ac.increaseTemperature();
		assertEquals(ac.getTemperature(), 17);

		
		for (int index = 0; index < 3; index++){
			ac.increaseTemperature();
		}

		assertEquals(ac.getTemperature(), 20);

	}

	@Test
	public void testThatAcCanDecreaseTemperature(){

		AirConditioner ac = new AirConditioner();

		ac.turnOn();
		assertEquals(true, ac.isOn());

		int initialTemp = ac.getTemperature();
		assertEquals(initialTemp, 16);

		for (int i = 0; i < 4; i++){
			ac.increaseTemperature();
		}
		assertEquals(ac.getTemperature(), 20);

		for (int i = 0; i < 2; i++){
			ac.decreaseTemperature();
		}
		assertEquals(ac.getTemperature(), 18);

	}




	@Test
	public void testThatAcCannotPassThirtyTemperature(){

		AirConditioner ac = new AirConditioner();

		ac.turnOn();
		assertEquals(true, ac.isOn());

		int initialTemp = ac.getTemperature();
		assertEquals(initialTemp, 16);

		for (int i = 0; i < 15; i++){
			ac.increaseTemperature();
		}
		assertEquals(ac.getTemperature(), 30);

	}


	@Test
	public void testThatAcCannotPassSixteenTemperature(){

		AirConditioner ac = new AirConditioner();

		ac.turnOn();
		assertEquals(true, ac.isOn());

		int initialTemp = ac.getTemperature();
		assertEquals(initialTemp, 16);

		for (int i = 0; i < 4; i++){
			ac.increaseTemperature();
		}
		assertEquals(ac.getTemperature(), 20);

		for (int i = 0; i < 10; i++){
			ac.decreaseTemperature();
		}
		assertEquals(ac.getTemperature(), 16);


	}


}		