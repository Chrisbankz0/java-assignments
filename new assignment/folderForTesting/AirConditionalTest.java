import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AirConditionerTest{

	@Test
	public void acCanTurnOn(){
		AirConditioner ac = new AirConditioner();
		ac.turnOn();
		assertTrue(ac.turnOn());
	}



}