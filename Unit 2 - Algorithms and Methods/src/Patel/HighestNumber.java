package Patel;
/**
 * this program finds the highest number in an integer array
 * 2017-04-03
 * @author Tushar Patel
 */

import java.util.Scanner;

public class HighestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	}
	
	/*determines the greatest number in an integer array
	 * @param is an integer array a
	 * @return the greatest value in the array
	 */
	public static int greatestValue(int[] a){
		int num = 0;
		for(int x = 0; x <= a.length; x++){
			if(a[x] > num){
				num = a[x];
			}
		}
		return num;
	}

}
