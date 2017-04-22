package Patel;

/**
 * 2017-04-20
 * @author Tushar
 * This program determines every perfect integer between 1 and 100
 */

public class perfectIntegers {

	public static void main(String[] args) {
		for(int x = 0; x <= 100; x++){
			if(isPerfectInt(x)){
				System.out.println(x);
			}
		}
	}
	
	public static int sumOfFactors(int input){
		int sum = 0;
		for(int x = 1; x < input; x++){
			int inputModX = input % x;
			if(inputModX == 0){
				sum = sum + x;
			}
		}
		return sum;
	}
	
	public static boolean isPerfectInt(int x){
		if(sumOfFactors(x) == x){
			return true;
		} else {
			return false;
		}
	}

}
