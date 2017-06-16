import lejos.nxt.Button;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

/**
*@author Tushar Patel
*2017-06-15
*This program is my Robot summative for the 
*/

public class Robot {
	
	 public static void main(String[] args){
		 Behavior b1 = new StopBehaviour();//exit
		 Behavior b2 = new DropOffBall();//when reach cup
		 Behavior b3 = new StopAndDrop();//loud noise
		 Behavior b4 = new PickUpBallAndDriveForward();//soft noise
		 Behavior b5 = new DriveForward();//initial start
		 
		 Behavior[] behaviors = {b5, b4, b3, b2, b1};//priority from lowest to highest moving to the right
		 Arbitrator arby = new Arbitrator(behaviors);  
		 Button.waitForAnyPress();
		 arby.start();
		 
	 }
	

}
