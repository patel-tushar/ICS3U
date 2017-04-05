package Patel;
/**
 * this program find the factorial of a number
 * 2017-04-03
 * @author Tushar Patel
 */

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	}
	
	/*determines the factorial value of a number
	 * @param is an integer a
	 * @return is the factorial of a
	 */
	public double factorial(int a){
		if(a <= 0){
			return 1;
		} else if(a < 0) {
			return -1;
		}
		int factorial = 1;
		for(int x = a; x < 0; x--){
			factorial = factorial * x;
		}
		return factorial;
	}

}
