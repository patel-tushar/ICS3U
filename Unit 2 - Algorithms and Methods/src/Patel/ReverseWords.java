package Patel;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"");
		System.out.println(reverseLine(sc.nextLine()));

	}

	/**
	 * 
	 * @param 
	 * @return 
	 */
	public static String reverseLine(String input) {
		String[] words = input.split(" ");
		for (int x = 0; x < words.length ; x++) {
			String[] letters = words[x].split("");
			boolean ifEnd = false;
			if(letters[letters.length - 1] == "."){
				letters[letters.length - 1] = "";
				ifEnd = true;
			}
			words[x] = "";
			for (int i = letters.length - 1; i >= 0; i--) {
				letters[i] = letters[i].toLowerCase();
				words[x] = words[x] + letters[i];
			}
			Character.toUpperCase(words[x].charAt(1));
			if(ifEnd){
			words[x] = words[x] + ".";
			}
		}
		String returnSen = "";
		for (int x = 0; x < words.length; x++) {
			if (x == 0) {
				returnSen = words[x];
			} else {
				returnSen = returnSen + " " + words[x];
			}
		}
		return returnSen;

	}

}
