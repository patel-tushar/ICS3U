package Patel;

import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	}
	
	public static int sumDigit(int num){
		int sum = 0;
		while(num > 1){
			sum = sum + num % 10;
		}
		return sum;
	}

}
