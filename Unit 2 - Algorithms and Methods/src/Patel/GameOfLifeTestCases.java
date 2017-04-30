package Patel;

/**
 * This program finds test cases for the game of life program
 * @author Tushar
 * 2017-04-28
 * to use this program, comment out line 25 in my other program and just copy paste
 */
public class GameOfLifeTestCases {

	public static void main(String[] args) {
		int numberOfCells = (int) (Math.random() * 400) + 1;
		System.out.println(numberOfCells);
		for(int x = 0; x < numberOfCells; x++){
			int row = (int) (Math.random() * 20) + 1;
			int coloum = (int) (Math.random() * 20) + 1;
			System.out.println(row + " " + coloum);
		}

	}

}
