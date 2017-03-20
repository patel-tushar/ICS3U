package Patel;

/**
 * This file is an example of how to play a sound in Java. Any sound you want
 * to play should have a .wav or a .mid extension (no mp3 files).
 * 
 * In Eclipse place your sound files in the java project folder. Then you can access
 * them without needing any directory paths.
 *
 * The .mid file format is "Midi" format. Midi files play cheezy-sounding synths
 * on your sound card. If you want music in your games, Midi is a great alternative
 * to Wav files, and gives the game a vintage sound. Lots of current songs are 
 * available as Midi files, often for ringtones.
 * 
 * Created September 8, 2008. 
 * Modified April 5, 2016. 
 * 
 * @author Christina Kemp
 **/


// ****************************
// These lines have to be here. Cut and paste them into your code
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;



// ****************************

public class AudioExample{

	public static void main (String[] args){

		try {
			
			// *****************************
			// THESE LINES CREATE THE CLIP TO PLAY THE MUSIC. 
			// Cut and paste them into your program, and change "theme.wav"
			// to the sound you want to play. 
			Clip theme = AudioSystem.getClip(); //create the clip object
			theme.open(AudioSystem.getAudioInputStream(new File("theme.wav"))); //open the given file for the clip
			//nameOfSong.open(AudioSystem.getAudioInputStream(new File("folder/name.wav"))); //open the given file for the clip

			System.out.println("OK, here comes some music!");
			Thread.sleep(1000);

			// ************************
			// Include this line when you want the sound to start playing.
			theme.start();
			// Instead of using start you could alternatively use the loop function.
			// The following line will loop your music until stop is called.
			// theme.loop(Clip.LOOP_CONTINUOUSLY);
			// ************************

			// THE PROGRAM CONTINUES WHILE THE MUSIC PLAYS
			Thread.sleep(5000);
			System.out.println("Hope you like it!");
			Thread.sleep(500);
			
			
			// ************************
			// Include this line when you want the sound to stop playing.
			theme.stop();
			// ************************

			Thread.sleep(1000);
			System.out.println("Goodbye");  

		} catch (Exception e) {
			e.printStackTrace();
		}


	} // main method
} 

