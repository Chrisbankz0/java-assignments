public class AirConditioner {

	private boolean isOn;
	private int temp = 16; 	

	public void turnOn(){
		isOn = true;
	}

	public void turnOff(){
		isOn = false;
	}

	public boolean isOn(){
		return isOn;
	}

	public int getTemperature(){
		return temp;
	}

	public void increaseTemperature(){
		if (temp  >= 30){
			temp = 30;
		}
		else{
			temp = temp + 1;
		}
	}

	public void decreaseTemperature(){

		if (temp  <= 16){
			temp = 16;
		}
		else{
			temp = temp - 1;
		}
	}
}
