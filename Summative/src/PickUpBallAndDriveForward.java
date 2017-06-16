import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.SoundSensor;
import lejos.nxt.TouchSensor;
import lejos.robotics.subsumption.Behavior;

//double clap drop ball and pick up behavior

public class PickUpBallAndDriveForward implements Behavior{

	private boolean suppressed = false;
	private SoundSensor ss = new SoundSensor(SensorPort.S2);
	private TouchSensor touch = new TouchSensor(SensorPort.S4);
	
	public void suppress(){
		suppressed = true;
	}
	
	/**
	 * take control when screamed at
	 */
	public boolean takeControl(){
		if(/*ss.readValue() > 30 */touch.isPressed()){//soft noise
			return true;
		}
		return false;
	}
	
	public void action(){     
		Motor.C.rotate(-90, true);//close arm
		
		//drive forward
		Motor.A.forward();
		Motor.B.forward();

		while(!suppressed){
		Thread.yield();//check for any other behaviors to over rule this one
		}
		
		
	}
	

}
