import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.SoundSensor;
import lejos.robotics.subsumption.Behavior;
import lejos.util.Delay;

//double clap drop ball and pick up behaviour

public class PickUpBallAndDriveForward implements Behavior{

	private boolean suppressed = false;
	private SoundSensor ss = new SoundSensor(SensorPort.S2);
	
	public void suppress(){
		suppressed = true;
	}
	
	public boolean takeControl(){
		if(ss.readValue() > 80){//scream
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
		Thread.yield();//check for any other behaviours to over rule this one
		}
		
		
	}
	

}
