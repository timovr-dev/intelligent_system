
public class Board {
	private int [] playBoard;
	private int [][] homePosition;
	private int [][] startPosition; 	

	public Board() {
		this.playBoard = new int[40];
		this.homePosition = new int [4][4];
		this.startPosition = new int[4][4];
	}
	
	
	public int [] getPlayBoard() {
		return playBoard;
	}

	public void setPlayBoard(int [] playBoard) {
		this.playBoard = playBoard;
	}

	public int [][] getHomePosition() {
		return homePosition;
	}

	public void setHomePosition(int [][] homePosition) {
		this.homePosition = homePosition;
	}

	public int [][] getStartPosition() {
		return startPosition;
	}

	public void setStartPosition(int [][] startPosition) {
		this.startPosition = startPosition;
	} 

}
