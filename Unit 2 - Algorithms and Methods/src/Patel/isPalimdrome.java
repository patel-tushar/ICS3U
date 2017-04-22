package Patel;

import java.util.Scanner;

public class isPalimdrome {

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("This program will tell you if a word is a palimdrone. Please enter a word, we will tell you if it is a palimdrone");
		String input = sc.nextLine();
		if(isPalimdrone(input) == true){
			System.out.println("This is a palimdrone");
		} else {
			System.out.println("This is not a plaimdrone");
		}
	}
	
	public static boolean isPalimdrone(String input){
		int counter = input.length() - 1;
		for(int x = 1; x <= input.length() - 1; x++){
			if(!(input.charAt(x) == input.charAt(counter))){
				return false;
			}
			counter--;
			
		}
		return true;
	}
	
	public static boolean isPal(String input){
		String[] regularOrder = input.split("");
		String[] reversedOrder = new String[input.length()];
		int counter = 0;
		for(int x = reversedOrder.length - 1; x >= 0; x--){
			reversedOrder[counter] = regularOrder[x];
			counter++;
		}
		
		String reversedWord = "";
		for(int x = 0; x < reversedOrder.length - 1; x++){
			reversedWord = reversedWord + reversedOrder[x];
		}
		
		if(reversedWord.equalsIgnoreCase(input)){
			return false;
		} else {
			return true;
		}
	}
}
