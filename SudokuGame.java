
public class SudokuGame {
	private int[][] board;
	private int[][] playerBoard;
	
	public SudokuGame(int diff) {
		BoardMaker make = new BoardMaker();
		board = make.randomGenBoard(diff);
	}
	
	
	boolean correct(int r, int c, int guess) {
		return true;
	}
	
	void addGuess(int r, int c, int guess) {
		
	}
	
}
