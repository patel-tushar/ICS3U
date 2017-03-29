package Patel;

import java.util.Scanner;

public class HighestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	}
	
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
