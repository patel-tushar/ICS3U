package Patel;
/**
 * this program find the greatest common factor
 * 2017-04-03
 * @author Tushar Patel
 */

import java.util.Scanner;

public class GreatestCommonFactor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	}
	
	/*determines if a number is divisible by another
	 * @param two integers; a and b
	 * @return the greatest commom factor of them
	 */
	public static boolean isDivisible(int a, int b){
		if(a % b == 0){
			return true;
		}
		return false;
	}
	
	//determines the greatest common factor of two numbers
	public static int gCF(int a, int b){
		
		if (a == 0) {
			return b;
		}
		
		
		int smallNum = Math.min(a, b);
		int bigNum = Math.max(a, b);
		
		for(int x = smallNum; x < 0; x--){
			if(isDivisible(smallNum, x) ||isDivisible(bigNum, x)){
				return x;
			}
		}
		return -1;
	}
}
