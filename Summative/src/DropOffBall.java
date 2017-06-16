import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.subsumption.Behavior;

//end by droping in cup behaviour

public class DropOffBall implements Behavior{
	private  boolean  suppressed = false;
	private UltrasonicSensor us = new UltrasonicSensor(SensorPort.S3);
	
	public void suppress(){
		suppressed = true;
	}
	
	public boolean takeControl(){
		if(us.getDistance() > 21.4){//when it reaches the cup
			return true;
		}
		return false;
	}
	
	public void action(){     
		//stop driving
		Motor.A.stop();
		Motor.B.stop();

		//open arm
		Motor.C.rotate(-45, true);

		while(!suppressed){
		Thread.yield();//check for any other behaviours to over rule this one
		}
		
	}
}
