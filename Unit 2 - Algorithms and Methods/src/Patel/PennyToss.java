package Patel;
/**
 * This program greats a penny toss game
 * @author Tushar
 * 2017-05-15
 */

public class PennyToss {

	static String[][] board = new String[5][5];
	static String[] prizes = {" ", "ball", "puzzle", "game", "doll", "NOOT"};
	
	public static void main(String[] args) {
		
		for(int x = 0; x < 5; x++){
			for(int i = 0; i < 5; i++){
				 assignSpot(x, i);
			}
		}
		
		
		
	}
	
	/**
	 * this method finds how many of of a certain prize is on the board
	 * @param prize
	 * @return the number of a certain prize on the board
	 */
	public static int numOfPrizeOnBoard(String prize){
		int counter = 0;
		for(int x = 0; x < 5; x++){
			for(int i = 0; i < 5; i++){
				if(board[x][i].equalsIgnoreCase(prize)){
					counter++;
				}
			}
		}
		return counter;
	}

	/**
	 * to assign a spot on the board
	 * @param x coordinate
	 * @param y coordinate
	 */
	public static void assignSpot(int x, int y){
		while(true){
			int possiblePrize = (int) (Math.random() * 6);
			if(possiblePrize == 0){
				if(numOfPrizeOnBoard(prizes[possiblePrize]) <= 10){
					board[x][y] = prizes[possiblePrize];
					break;
				}
			} else if(numOfPrizeOnBoard(prizes[possiblePrize]) <= 3){
				board[x][y] = prizes[possiblePrize];
				break;
			}
		}
	}
}
