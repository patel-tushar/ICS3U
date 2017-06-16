import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;

//initial action behavior

public class DriveForward implements Behavior{
	private boolean suppressed = false;
	private boolean debug = true;
	
	public void suppress(){
		suppressed = true;
	}
	
	public boolean takeControl(){
				return true;
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
