package Patel;

import java.util.Scanner;

/**
 * 2017-05-15
 * @author Tushar
 * This program creates the game Mancala
 */

public class Mancala {

	static int[][] board = new int[2][7]; //stores the board
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//initialize board to start game
		for(int x = 1; x < 7; x++){
			board[0][x] = 3;
			board[1][x] = 3;	
		}
		
		boolean continueGame = true; //determine whether to end game or not
		
		do{
			//output board
			System.out.println("  " + outputPlayer1SideOfBoard(0));
			System.out.println(board[0][0] + "             " + board[1][0]);
			System.out.println("  " + outputPlayer2SideOfBoard(1));
		
			//output options
			System.out.println("  A B C D E F");
			
			//skip line
			System.out.println(" ");
			
			//output a line to determine where to move
			System.out.println("pick which option to move");
			
			//input from scanner
			String input = sc.nextLine();
			
			//change to integer Value
			int changePosition = 0;
			if(input.equalsIgnoreCase("A")){
				changePosition = 1;
			} else if(input.equalsIgnoreCase("B")){
				changePosition = 2;
			} else if(input.equalsIgnoreCase("C")){
				changePosition = 3;
			} else if(input.equalsIgnoreCase("D")){
				changePosition = 4;
			} else if(input.equalsIgnoreCase("E")){
				changePosition = 5;
			} else if(input.equalsIgnoreCase("F")){
				changePosition = 6;
			}
			
			changeBoard(0, changePosition);
			if(isBoardEmpty()){
				continueGame = false;
			}
			
		}while(continueGame);
		
	}
	
	/**
	 * This method creates a line to output for player one side of the board
	 * @param player
	 * @return the output
	 */
	public static String outputPlayer1SideOfBoard(int player){
		String line = "";
		for(int x = 1; x < 7; x++){
			line = line + board[player][x] + " ";
		}
		return line;
	}
	
	/**
	 * This method creates a line to output for player two side of the board
	 * @param player
	 * @return the output
	 */
	public static String outputPlayer2SideOfBoard(int player){
		String line = "";
		for(int x = 6; x > 0; x--){
			line = line + board[player][x] + " ";
		}
		return line;
	}
	
	/**
	 * this method looks at the board and checks if all the spots (other then "deposites") are empty
	 * @return a true or false variable depending on the result
	 */
	public static boolean isBoardEmpty(){
		for(int x = 1; x < 7; x++){
			if(board[0][x] != 0 || board[1][x] != 0){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * this method changes the board
	 * @param choice of where to move
	 */
	public static void changeBoard(int player, int choice){
		int secondCounter = 0;
		int thirdCounterRipIfIGotHere = 0;
		for(int x = 1; x <= board[player][choice]; x++){
			if(choice + x < 6){
				board[player][choice + x]++;
			} else {
				if(secondCounter < 6)
				if(player == 0){
					board[1][secondCounter]++;
					secondCounter++;
				}
				if(player == 1){
					board[0][secondCounter]++;
					secondCounter++;
				} else {
					board[player][thirdCounterRipIfIGotHere]++;
				}
			}
		}
	}
}
