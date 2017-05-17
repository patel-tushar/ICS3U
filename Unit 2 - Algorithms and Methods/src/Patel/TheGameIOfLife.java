package Patel;

/**
 * This is the "The Game of Life" program form page 240 of "A guide to programming in JAVA Third Edition" By Jan Marrelli
 * @author Tushar Patel
 * 2017-04-28
 */

import java.util.Scanner;

public class TheGameIOfLife {
	static Scanner sc = new Scanner(System.in);


	public static void main(String[] args) {
		boolean[][] today = new boolean[20][20]; //the location we store the cells

		String input = ""; //used to take in input

		System.out.println("How many cells are alive?");
		int numberOfCells = sc.nextInt();

		//take in all locations of cells and store them in array
		for(int i = 0; i < numberOfCells; i++){
			//System.out.println("Input the coordinates seperated by a space");
			int x = sc.nextInt();
			int y = sc.nextInt();
			today[y- 1][x - 1] = true;
		}

		//show location of all living cells
		while(true){

			//print out the chart
			System.out.println("these are the coordinates with living cells");
			for(int i = 0; i < today.length; i++){
				for(int j = 0; j < today[i].length; j++){
					if(today[i][j]){
						System.out.print("x ");
					} else {
						System.out.print("o ");
					}
				}
				System.out.println("");
			}
			today = changeDay(today);
			//cancel out if all cells are dead (basically don't continue)
			if(areAllCellsDead(today)){
				System.out.println("All cells are dead");
				break;
			}

			//see if they wish to continue
			System.out.println("Do you want to see tomorrow?");
			input = validInput("yes", "no");
			if(input.equalsIgnoreCase("yes")){
				continue;
			} else {
				break;
			}
		}
		
		System.out.println("This program has ended");

	}

	/**
	 * This method determines if all the cells are dead or not
	 * @param a 2D array x (the day of cells)
	 * @return a boolean whether they are or not
	 */
	public static boolean areAllCellsDead(boolean[][] x){
		for(int i = 0; i < x.length; i++){
			for(int j = 0; j < x[i].length; j++){
				if(x[i][j]){
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * Kills and brings life to cells following conditions
	 * @param 2D boolean array called "lastDay"
	 * @return 2D boolean array that represents the next day called "nextDay"
	 */
	public static boolean[][] changeDay(boolean[][] lastDay){
		boolean[][] nextDay = new boolean[20][20];
		for(int i = 0; i < 20; i++){
			for(int j = 0; j < 20; j++){
				if(lastDay[i][j]){
					if(neighbourCells(lastDay, i, j) == 2 || neighbourCells(lastDay, i, j) == 3){
						nextDay[i][j] = true;
					} else {
						nextDay[i][j] = false;
					}
				}
				if(neighbourCells(lastDay, i, j) == 3){
					nextDay[i][j] = true;
				}
			}
		}

		return nextDay;
	}

	//work on this method 
	/**
	 * determined how many neighbour cells a cell has
	 * @param the cell grid called "grid"
	 * @param x coordinate called "x"
	 * @param y coordinate called "y"
	 * @return how many neighbour cells the cell has
	 */
	public static int neighbourCells(boolean[][] grid, int x, int y){
		int total = 0;

		//check right
		if(x < 19){
			if(grid[y][x+1]){
				total++;
			}
		}

		//check left
		if(x > 0){
			if(grid[y][x-1]){
				total++;
			}
		}

		//check up
		if(y > 0){
			if(grid[y - 1][x]){
				total++;
			}
		}

		//check below
		if(y < 19){
			if(grid[y + 1][x]){
				total++;
			}
		}

		//check top right
		if(((y < 19) && (x < 19))){
			if(grid[y + 1][x + 1]){
				total++;
			}
		}

		//check bottom left
		if(((y >= 1) && (x >= 1))){
			if(grid[y - 1][x - 1]){
				total++;
			}
		}

		//check bottom right
		if(((y > 0) && (x < 19))){
			if(grid[y - 1][x + 1]){
				total++;
			}
		}

		//check top left
		if(((y < 19) && (x > 0))){
			if(grid[y + 1][x - 1]){
				total++;
			}
		}

		return total;
	}

	/**
	 * This method check if an input is valid or not
	 * @param option1 for the first possible option
	 * @param option2 for the first possible option
	 * @return a valid input
	 */
	public static String validInput(String option1, String option2){
		String input = "";
		while(true){
			input = sc.nextLine();
			if(input.equalsIgnoreCase(option1) || input.equalsIgnoreCase(option2)){
				break;
			} else {
				System.out.println("That is not a valid input, please insert a valid input");
			}
		}
		return input;
	}
}
