package Patel;
/**
 * this program finds out if a number is prime
 * 2017-04-03
 * @author Tushar Patel
 */

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
	}
	
	/*determines if a number is divisible by another
	 * @param is two integers, a and b
	 * @return a boolean value whether a could divide by b as a whole number
	 */
	public boolean isDivisible(int a, int b){
		if(a % b == 0){
			return true;
		}
		return false;
	}
	
	/*determines whether a number is prime or not
	 * @param an integer variable
	 * @return a boolean whether its prime or not
	 */
	public static boolean isPrime(int num){
		if(num == 2){
			return true;
		}
		for(int x = num - 1; x > 1; x--){
			if(num % x == 0){
				return false;
			}
		}
		return true;
	}
}
