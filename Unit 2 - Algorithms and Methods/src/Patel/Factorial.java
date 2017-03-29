package Patel;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	}
	
	public double factorial(int a){
		if(a == 0){
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
