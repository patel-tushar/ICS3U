package Patel;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import hsa_new.Console;

public class picExample {
		static Console c = new Console(32, 167);
	public static void main(String[] args){

		Color transparent = new Color(0, 0, 0, 0);
		
		c.setTextBackgroundColour(transparent);
		c.setTextColor(Color.BLACK);
		
		
		BufferedImage tusharsFace = null;
		
		
		
		try{
			tusharsFace = ImageIO.read(new File("pics/P_20160830_093100_BF.jpg"));
		} catch (IOException e) {
			System.err.println("There was ana error loading the image.");
			e.printStackTrace();
		}
		
		c.drawImage(tusharsFace, 1, 1 , 500, 500, null);

		c.readLine();
	}
}
