package Jones_Patel;

import java.awt.Color;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Main.java
 * This is a choose your own adventure game named "The battle against time"
 * 2017-03-20
 * @author Tushar Patel
 * @author Katie Jones
 * Citations for pictures: https://uk.pinterest.com/explore/home-bars/
http://www.tyroleanmeadows.com/site-photos/web-house-night-2
https://commons.wikimedia.org/wiki/File:Sullivans-Island-Lighthouse-beach-night.jpg
http://www2.chem.umd.edu/nmr/contact_us.htm
https://www.winnipesaukee.com/photopost/showphoto.php?photo=13103&size=big
http://www.eetimes.com/author.asp?section_id=216&doc_id=1328642
http://sephirothmsk.deviantart.com/art/Building-on-fire-2835177
 * 		
 */

import java.util.Random;

import javax.imageio.ImageIO;

import hsa_new.Console;

public class Main {

	static String choice;
	static Console c = new Console(32, 167);
	static boolean playAgain = false;

	static String a = "yes"; /* This is the output spot holder */
	static String[] choosenOptions = null;
	static int choiceCounter = 0;

	static BufferedImage houseAtNight = setPic("houseAtNight.jpg");
	static BufferedImage nightIsland = setPic("nightIsland.jpg");
	static BufferedImage OpeningOscarScene = setPic("OpeningOscarScene.jpg");
	static BufferedImage docks = setPic("docks.jpg");
	static BufferedImage lab = setPic("lab.jpg");
	static BufferedImage timeMachine = setPic("timeMachine.png");
	static BufferedImage burningBuilding = setPic("burningBuilding.jpg");
	static BufferedImage noPic = setPic("blackScreen.png");
	static BufferedImage redScreen = setPic("redScreen.png");

	public static void main(String[] args) {
		c.setTextBackgroundColour(Color.BLACK);
		c.setTextColor(Color.RED);
		c.setBackground(Color.BLACK);
		c.drawImage(timeMachine, 0, 100, 900, 650, null);
		c.println("Welcome to Battle Against Time. Choice will be given to you and you must choose from one of the choice in bracket. Please press enter twice to start.");
		c.readLine();


		do {
			c.setTextBackgroundColour(Color.BLACK);
			c.setTextColor(Color.RED);
			c.clear();
			boolean key = false;
			// the main start up output

			c.println("It all began during world war 2. No, we weren’t the good guys being nice and stuff working on helping the allies working on the Manhattan project, no we were mad scientists. We… as much as I hate to say it, were working with the Nazis. 2 scientists: one German born scientist named Rohden, one Japanese born scientist named Yuki. Neither fighting for the axis, both wanting to work with the allies. Yet their heritages and horrible timings brought them to join the Axis. Yuki was transferred from Japan to work for the Germans, they hate their jobs. But one day, they decide its finally decided to rebel. So, that’s where we are at right now. The Nazis are actually insane… like this is what you would call a made scientist. We decided hey it might be a good idea to you know, just break the time continuum. Like seriously, we went over all the bad out comes this could lead to. Dammit Oscar! Oh yes, Oscar, he is our boss. His real name is unknown but we just go with it. So we decided to work on this time machine and got it done. It is almost fully functional and seems like it will work. Remember how we said that we never liked them Nazis, yeah we don’t want them to have this technology. So Yuki wants to destroy it, while Rohden wants to give it to the allies. Rohden goes to Oscar's house for a meeting tonight");
			c.println("Press enter twice to continue");
			c.readLine();

			choice = inputOutput(
					"Today you went to Oscar’s house. He wanted to talk for a bit, have a couple of drinks, just a very friendly casual night. We were talking about the future of the experiments and what we were going to do with the time machine. Of course, you didn’t tell him about what you and Yuki were thinking. You just told him how it will be a huge leap forward in the world and would be amazing. He got up and told me he was going to get a few drinks. As soon as he leaves the room, guns start firing! You hit the deck and see what’s going on. You can now either get up and make a run for the hallway, or I could go grab the gun Oscar keeps in his bottom drawer. (Hallway/Gun)",
					"hallway", "gun", OpeningOscarScene);

			// choice 2
			if (choice.equalsIgnoreCase("Hallway")) {
				// a
				/* end game */
				playAgain = end("You run into the hallway. You make it and are half way down the hallway, but suddenly, notice Oscar coming out with a gun. With nothing to defend yourself, he shoots and kills you.");
				if(playAgain == true){
					continue;
				} else {
					break;
				}

			} else if (choice.equalsIgnoreCase("Gun")) {
				// b

				choice = inputOutput(
						"You grab the gun. Now you can either leave, stand your ground and fight, or go to the hallway. (leave/fight/hallway)",
						"leave", "fight", "hallway", OpeningOscarScene);

				// choice 3
				// first loop
				boolean outOfLoopOne = false;
				boolean fightDeath = false;

				for (int x = 0; x <= 4; x++) {
					if (choice.equalsIgnoreCase("Leave") || x == 3) {
						// a
						break;

					} else if (choice.equalsIgnoreCase("Fight")) {
						// b
						choice = inputOutput(
								"You keep fighting. Now you can either leave, stand your ground and fight, or go to the hallway. (leave/fight/hallway)",
								"leave", "fight", "hallway", OpeningOscarScene);
						continue;
					} else if (choice.equalsIgnoreCase("Hallway")) {
						// c
						outOfLoopOne = true;
						break;
					}
				}

				// random number 1
				if (outOfLoopOne == true) { //hallway

					int oscarShot = (int) ((Math.random() * 10)
							+ 1);/* generate random # */

					if (oscarShot <= 6) {

						choice = inputOutput(
								"You go into the hallway and see Oscar coming out with a shotgun. Luckily, you pull the gun out and you shoot him dead. You can now head upstairs to check for something, or just leave. (Upstairs/Leave)”",
								"upstairs", "leave", OpeningOscarScene);

						// side cut part
						if (choice.equalsIgnoreCase("UpStairs")) {
							// a
							key = true;
							choice = inputOutput(
									"You head upstairs and find a key to the back door of the lab. You can either keep searching or head out. (Keep Searching/Leave)",
									"keep searching", "Leave", OpeningOscarScene);

							if (choice.equalsIgnoreCase("Keep Searching")) {
								/* end with place blowing up */
								playAgain = end("The house had a bomb planted in it for you. It blew up with you in it.");
								if(playAgain == true){
									continue;
								} else {
									break;
								}
							}
						}
						// b

						choice = inputOutput(
								"You leave and must get to the lab! You can either go to the docks by car or the back trail. The trail is slower but safer in the dark, but the car is faster. Driving however is much less safe are you are in the open. What do you do? (Car/Trail)",
								"car", "trail", houseAtNight);

						// choice 4
						if (choice.equalsIgnoreCase("Car")) {

							// random number #2
							int carSurvival = (int) ((Math.random() * 2) + 1);

							if (carSurvival == 1) {
								/*
								 * end with death because shot down in car*/
								playAgain = end("You were driving but all of a sudden, you got hit by a truck. Nazi soilders come out and shoot you dead");
								if(playAgain == true){
									continue;
								} else {
									break;
								}


							} else {

								choice = inputOutput("You survive the drive! You made it to the docks and get to the island. You can now enter through the front or the back. (Front/Back)", "front", "back", nightIsland);

								// choice 5
								if (choice.equalsIgnoreCase("front")) {
									// a
									choice = inputOutput("You enter through the front. You walk in and a bunch of guards are standing in the way. They start firing at you. You keep holding the line and shooting. They are pushing towards you; your gun wont last you much longer. You see a machine gun you could leap for, but it’s very risky. Do you keep fighting or run for the gun? (keep fighting/gun).", "keep fighting", "gun", lab);

									// choice 6
									if (choice.equalsIgnoreCase("Keep fighting")) {
										// a

										choice = inputOutput("You keep holding your ground. They are closing in until you see them fall. It’s Yuki! She flanked them while they had their attention on you. You guys go towards the time machine and must either expose or destroy the time machine. (Expose/Destroy)", "expose", "destroy", lab);

										if (choice.equalsIgnoreCase("expose")) {
											/*
											 * end with you guys walking out
											 * and getting caught then
											 * jumping back into the time
											 * machine
											 */
											playAgain = end("You guys find the time machine. You guys are heading out and see the Nazis closing in. You guys run back towards the machine and hop in… and go to a better time.");
											if(playAgain == true){
												continue;
											} else {
												break;
											}
										} else if (choice.equalsIgnoreCase("destory")) {
											/*
											 * end with you two breaking it
											 * walking out getting caught
											 * and getting killed
											 */
											playAgain = end("You guys destroy the time machine. You guys are on your way out and get spotted by the Nazis. You guys try to run but there is no where to go. Without being able to run… you guys get cornered and killed.");
											if(playAgain == true){
												continue;
											} else {
												break;
											}
										}

									} else if (choice.equalsIgnoreCase("gun")) {
										// b

										choice = inputOutput("You reach the gun… You mow them all down but you notice someone without uniform on in the back. You walk towards there and notice who it is… Its Yuki! You accidently shot Yuki. You carry her with you to the time machine and find out you have three option: you can destroy the time machine, expose it to the public, or time travel back to before the project began and stop anything form even happening. (expose/time travel/destroy)", "expose", "time travel", "destory", lab);

										// choice 7
										if (choice.equalsIgnoreCase("expose")) {
											// a
											/*
											 * end with ghost yuki 
											 */
											playAgain = end("You expose the time machine and live off your life. You live on to become a rich scientist for the allies and live your life on your dreams. You always feel a presence haunting you…. and one day it you… Yuki?");
											if(playAgain == true){
												continue;
											} else {
												break;
											}

										} else if (choice.equalsIgnoreCase("time travel")) {
											// b
											/*
											 * end with going into the time
											 * machine saying
											 * "yuki, im coming" or
											 * something
											 */
											playAgain = end("You fire up the time machine… slowly walk in and say the words “Yuki… I am coming back for you…”");
											if(playAgain == true){
												continue;
											} else {
												break;
											}

										} else if (choice.equalsIgnoreCase("destroy")) {
											// c
											/*
											 * you destroy the time machine
											 * and go where ever life takes
											 * you
											 */
											playAgain = end("You grab the sledge hammer and let your anger on the machine. You then leave… and see where life takes you.");
											if(playAgain == true){
												continue;
											} else {
												break;
											}

										}
									}

								} else if (choice.equalsIgnoreCase("back")) {
									// b
									choice = inputOutput("You go through the back…  you can see the back entrance… but at the dock you see Yuki. Yuki is waving you down to come to the dock. You could continue through the back entrance or go to Yuki. (continue/Yuki)", "Yuki", "Continue", nightIsland);

									// choice 6

									int x;
									for (x = 0; x <= 3; x++) {
										if (choice.equalsIgnoreCase("Yuki")) {
											// a
											break;

										} else if (choice.equalsIgnoreCase("Continue")
												|| choice.equalsIgnoreCase("lock")) {
											// b
											if (key == true) {
												break;

											} else {
												if (x == 0) {
													// choice 7
													choice = inputOutput(
															"You dont have keys, would you like to try to pick the lock or go to Yuki? (lock/Yuki)",
															"lock", "Yuki", nightIsland);
												} else {
													choice = inputOutput(
															"It didnt work, would you like to try to pick the lock again or go to Yuki? (lock/Yuki)",
															"lock", "Yuki", nightIsland);
												}
											}
										}
									}

									if (x == 3) {
										/* end with island exploding */

									} else if (choice.equalsIgnoreCase("Continue")) {
										// a

										choice = inputOutput("You enter but it’s a trap! The building is on fire and you need to get out. But you see a crane. You could break the time machine, but it will cost you your life! (escape/crane)", "crane", "escape", burningBuilding);

										// choice 7
										if (choice.equalsIgnoreCase("crane")) {
											// a
											/*
											 * end with you dying but
											 * breaking the time machine
											 */
											playAgain = end("You break the machine and destroy it. The Machine breaks with you in it.");
											if(playAgain == true){
												continue;
											} else {
												break;
											}

										} else if (choice.equalsIgnoreCase("escape")) {
											// b
											/*
											 * end with being an outlaw and
											 * stuff
											 */
											playAgain = end("You escape the building. The time machine wins the axis the war. You are now an outlaw.");
											if(playAgain == true){
												continue;
											} else {
												break;
											}

										}
									} else if (choice.equalsIgnoreCase("Yuki")) {
										// b
										/*
										 * end with yuki being dead and you
										 * get put into the time machine and
										 * get lost in time
										 */
										playAgain = end("You go down only to see Yuki assassinated. You are caught by the Nazis and are thrown into the time machine. You are sent to another dimension.");
										if(playAgain == true){
											continue;
										} else {
											break;
										}

									}
								}
							}
						} else if (choice.equalsIgnoreCase("Trail")) {
							/* end with island exploding */
							playAgain = end("You run through the trail un noticed. You make it to the docks and are about to hop onto the boat when you notice something. You see a big huge explosion coming from the island with a big bang. The island was blown up, and from a distance you see a boat with a person on it; Yuki! She did it, she blew up the island! You guys drive off into the lake… looking for better lives.");
							if(playAgain == true){
								continue;
							} else {
								break;
							}
						}
					} else {
						/* end with oscar shooting you */
						playAgain = end("You get out and make it to the hallway. You see Oscar coming down the stairs with a shotgun and try to shoot, but he noticed you first. He got the shot off and killed you");
						if(playAgain == true){
							continue;
						} else {
							break;
						}
					}
				} else if(fightDeath == true) {//keep fighting too much
					playAgain = end("You were there too long, turns out Oscar planted a bomb. The house blows up with you in it.");
					if(playAgain == true){
						continue;
					} else {
						break;
					}
				} else {//leave
					playAgain = end("You leave the house and get shot down by the Nazis Outside.");
					if(playAgain == true){
						continue;
					} else {
						break;
					}
				}

			}
		} while (playAgain == true);

		c.close();
	}

	//this is when an unexpected input is given and we dont want the program to break
	public static void trashInput() {
		c.println("Thats an invaild output, please try again");
		choice = c.readLine();
	}

	public static boolean end(String outputLine) {
		c.setTextBackgroundColour(Color.RED);
		c.setBackground(Color.BLACK);
		c.setTextColor(Color.BLACK);
		c.println(outputLine);
		c.println("Press enter twice to continue");
		c.readLine();
		boolean randomVariableKatLaughedAtThanksFham = false;
		c.println("Game over");
		String input = inputOutput("Would you like to play again? (Yes/No)", "Yes", "no", redScreen);
		if (input.equalsIgnoreCase("Yes")) {
			randomVariableKatLaughedAtThanksFham = true;
		} else {
			randomVariableKatLaughedAtThanksFham = false;
		}
		return randomVariableKatLaughedAtThanksFham;
	}

	//this method outputs, takes in an input and sees if its valid, and also outputs an image
	public static String inputOutput(String output, String optionA, String optionB, BufferedImage pic) {
		c.clear();
		c.setBackground(Color.BLACK);
		c.drawImage(pic, 0, 100, 750, 500, null);
		c.println(output);
		String input = "";
		int counter = 0;
		while (true) {
			input = c.readLine();
			if (input.equalsIgnoreCase(optionA) || input.equalsIgnoreCase(optionB)) {
				break;
			} else {
				if (counter == 3) {
					c.clear();
					c.println(input);
					counter = 0;
				}
				c.println("That is not a valid input. Please try again.");
				counter = counter++;
			}

		}
		return input;
	}

	//same as last one just with an extra option
	public static String inputOutput(String output, String optionA, String optionB, String optionC, BufferedImage pic) {
		c.clear();
		c.drawImage(pic, 0, 100, 750, 500, null);
		c.println(output);
		String input = "";
		int counter = 0;
		while (true) {
			input = c.readLine();
			if (input.equalsIgnoreCase(optionA) || input.equalsIgnoreCase(optionB) || input.equalsIgnoreCase(optionC)) {
				break;
			} else {
				if (counter == 3) {
					c.clear();
					c.println(input);
					counter = 0;
				}
				c.println("That is not a valid input. Please try again.");
				counter = counter++;
			}

		}
		return input;
	}

	public static BufferedImage setPic(String imageName) {
		BufferedImage pic = null;

		try {
			pic = ImageIO.read(new File("Pictures/" + imageName));
		} catch (IOException e) {
			System.err.println("There was ana error loading the image.");
			e.printStackTrace();
		}
		return pic;

	}

}