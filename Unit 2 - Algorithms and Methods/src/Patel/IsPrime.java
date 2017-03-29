package Patel;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
	}
	
	public boolean isDivisible(int a, int b){
		if(a % b == 0){
			return true;
		}
		return false;
	}
	
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
