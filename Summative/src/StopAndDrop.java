import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.SoundSensor;
import lejos.robotics.subsumption.Behavior;
import lejos.util.Delay;

//single clap stop and drop ball behavior

public class StopAndDrop implements Behavior{

	private  boolean  suppressed = false;
	private SoundSensor noise = new SoundSensor(SensorPort.S2);
	
	public void suppress(){
		suppressed = true;
	}
	
	public boolean takeControl(){
		if(noise.readValue() > 30){//if there is a single clap
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
