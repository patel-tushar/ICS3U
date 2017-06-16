import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.SoundSensor;
import lejos.robotics.subsumption.Behavior;

//single clap stop and drop ball behaviour

public class StopAndDrop implements Behavior{

	private  boolean  suppressed = false;
	private SoundSensor noise = new SoundSensor(SensorPort.S2);
	
	public void suppress(){
		suppressed = true;
	}
	
	public boolean takeControl(){
		if(noise.readValue() > 50){//if there is a single clap
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
