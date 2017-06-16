import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;

//end program when escape button is pressed behaviour

public class StopBehaviour implements Behavior{

	private boolean suppressed = false;
	
	public void suppress(){
		suppressed = true;
	}
	
	public boolean takeControl(){
		return Button.ESCAPE.isDown();//when the button is pressed, it will activate the action
	}
	
	public void action(){
		System.exit(0);//end program
	}
	
}
