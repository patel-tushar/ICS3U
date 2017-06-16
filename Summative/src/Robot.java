import lejos.nxt.Button;
import lejos.nxt.SensorPort;
import lejos.nxt.SoundSensor;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

/**
*@author Tushar Patel
*2017-06-15
*This program is my Robot summative for the 
*/

public class Robot {
	
	 public static void main(String[] args){
		 UltrasonicSensor us = new UltrasonicSensor(SensorPort.S3);
		 SoundSensor noise = new SoundSensor(SensorPort.S2);
		 
		 Behavior b1 = new StopBehaviour();//exit
		 Behavior b2 = new DropOffBall(us);//when reach cup
		 Behavior b3 = new StopAndDrop(noise);//loud noise
		 Behavior b4 = new PickUpBallAndDriveForward();//soft noise
		 Behavior b5 = new DriveForward();//initial start
		 
		 Behavior[] behaviors = {b5,b2, b3, b1};//priority from lowest to highest moving to the right
		 Arbitrator arby = new Arbitrator(behaviors);  
		 Button.waitForAnyPress();
		 arby.start();
		 
	 }
	

}
