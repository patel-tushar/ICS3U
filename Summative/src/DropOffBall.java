import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.subsumption.Behavior;

//end by dropping in cup behavior

public class DropOffBall implements Behavior{
	private  boolean  suppressed = false;
	private UltrasonicSensor us;
	
	public DropOffBall(UltrasonicSensor us){
		this.us = us;
	}
	
	public void suppress(){
		suppressed = true;
	}
	
	public boolean takeControl(){
		if(us.getDistance() < 17){//when it reaches the cup
			return true;
		}
		return false;
	}
	
	public void action(){     
		//stop driving
		Motor.A.stop();
		Motor.B.stop();

		//open arm
		Motor.C.rotate(90, true);

		while(!suppressed){
			Thread.yield();//check for any other behaviors to over rule this one
		}
		
	}
}
