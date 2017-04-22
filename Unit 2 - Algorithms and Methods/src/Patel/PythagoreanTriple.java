package Patel;

/**
 * 2017-04-20
 * @author Tushar
 * This program prints out all right triangle values between
 */

public class PythagoreanTriple {

	public static void main(String[] args) {
	
		System.out.println("These are the right triangles with a, b, and c values between 1 and 100");
		for(int a = 0; a < 100; a++){
			for(int b = 0; b < 100; b++){
				for(int c = 0; c < 100; c++){
					if(isRightTriangle(a, b, c) && isPerfectSquare((int)Math.pow(c, 2))){
						System.out.println(a + " " + b + " " + c);
					}
				}
			}
		}
	}
	
	public static boolean isPerfectSquare(int input){
		int sqrt = (int)Math.sqrt(input);
		double checker = sqrt^2;
		if(input == checker){
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isRightTriangle(int a, int b, int c){
		if(a == 0 || b ==0){
			return false;
		}
		int hyp = (int) ((Math.pow(a, 2) + Math.pow(b,2)));
		if(Math.sqrt(hyp) == c){
			return true;
		} else {
			return false;
		}
	}
}
