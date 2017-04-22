package Patel;

import java.util.Scanner;

/**
 * this program is a algorithm problem
 * @author Tushar Patel, Ian Ayuso, Rishab Bhatt
 * 2017-04-10
 */
public class DecodingDNA {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//input strand and change at every letter
		String[] input =  sc.nextLine().split("");
		
		//this is the strand to change 
		String[] storedDNA = new String[input.length];
		
		//go through and check for the TATAAT
		int ender = 0;
		for(int x = 0; x < input.length; x++){
			if(input[x].equalsIgnoreCase("T") && input[x + 1].equalsIgnoreCase("A") && input[x + 2].equalsIgnoreCase("T") && input[x + 3].equalsIgnoreCase("A") && input[x + 4].equalsIgnoreCase("A") && input[x + 5].equalsIgnoreCase("T")){
				
				for(int i = 0; i< input.length - ender; i++){	
					storedDNA[i] = input[x + 9 + i];
				}
				break;
			}
		}
		
		String[] reversedInputWithFlipz = reverseString(input);
		reversedInputWithFlipz = returnReversePair(reversedInputWithFlipz, true);
		
		for(int x = 0; x <= input.length; x++){
			if(input[x].equalsIgnoreCase(reversedInputWithFlipz[x])){
				if(input[x + 1].equalsIgnoreCase(reversedInputWithFlipz[x + 1])){
					if(input[x + 2].equalsIgnoreCase(reversedInputWithFlipz[x + 2])){
						if(input[x + 3].equalsIgnoreCase(reversedInputWithFlipz[x + 3])){
							if(input[x + 4].equalsIgnoreCase(reversedInputWithFlipz[x + 4])){
								if(input[x + 5].equalsIgnoreCase(reversedInputWithFlipz[x + 5])){
									ender = x;
									break;
								}
							}
						}
					}
				}
			}
		}
	
		
		
		
		
		storedDNA = returnReversePair(storedDNA, false);
		for(int x = 0; x < storedDNA.length; x++){
			System.out.print(storedDNA[x]);
		}
		
		String xyz = "xyz";
		boolean yep = bool(xyz.charAt(1));
		
		
}
	public static boolean bool(char input){
		if(input == 'x' ){
			return false;
		} else {
			return true;
		}
	}
	
	@SuppressWarnings("null")
	public static String[] returnReversePair(String[] input, boolean lazy){
		String[] zReturn = null;
		for(int x = 0; x < input.length; x++){
		if(input[x].equalsIgnoreCase("T")){
			zReturn[x] = "A";
		} else if(input[x].equalsIgnoreCase("A") && lazy == true){
			zReturn[x] = "T";
		}else if(input[x].equalsIgnoreCase("A") && lazy == false){
				zReturn[x] = "U";
		} else if(input[x].equalsIgnoreCase("G")){
			zReturn[x] = "C";
		} else if(input[x].equalsIgnoreCase("C")){
			zReturn[x] = "G";
		}
		
	}
		return zReturn;
	}
	
	
	@SuppressWarnings("null")
	public static String[] reverseString(String[] input){
		String[] returnString = null;
		int counter = 0;
		for(int x = input.length - 1; x >= 0; x--){
			returnString[counter] = input[x];
			counter++;
		}
		return returnString;
	}

}
