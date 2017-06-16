import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;

//initial action behaviour

public class DriveForward implements Behavior{
	private boolean suppressed = false;
	
	public void suppress(){
		suppressed = true;
	}
	
	public boolean takeControl(){
			return true;
	}
	
	public void action(){     
		Motor.C.rotate(45, true);//close arm
		
		//drive forward
		Motor.A.forward();
		Motor.B.forward();

		while(!suppressed){
		Thread.yield();//check for any other behaviours to over rule this one
		}
		
		
	}
}
