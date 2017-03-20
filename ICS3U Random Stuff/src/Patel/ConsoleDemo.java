package Patel;

import java.awt.Color;

import hsa_new.Console;

public class ConsoleDemo {
	
	public static void main(String[] args) {
		Console c = new Console(32, 167);
		c.println("How old are you?");
		int age = c.readInt();
		if (age == 16){
			c.setColor(Color.pink);
		} else {
			c.setColor(Color.BLUE);
		}
		c.readBoolean();
		
		
	}

}
