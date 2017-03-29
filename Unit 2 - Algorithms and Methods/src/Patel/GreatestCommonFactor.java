package Patel;

import java.util.Scanner;

public class GreatestCommonFactor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	}
	
	public static boolean isDivisible(int a, int b){
		if(a % b == 0){
			return true;
		}
		return false;
	}
	
	public static int gFC(int a, int b){
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
