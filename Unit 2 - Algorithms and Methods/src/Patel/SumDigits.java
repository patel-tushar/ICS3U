package Patel;
/**
 * this program determine the sum of all the digits in a number
 * 2017-04-03
 * @author Tushar Patel
 */

import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	}
	
	/*determines the sum of the digits in a number (ex. 1310 = 1 + 3 + 1 + 0 = 4)
	 * @param is an integer variable 
	 * @return the sum of the digits in the integer variable
	 */
	public static int sumDigit(int num){
		int sum = 0;
		while(num > 1){
			sum = sum + num % 10;
			num = num/10;
		}
		return sum;
	}

}
