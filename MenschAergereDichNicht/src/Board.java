
public class Board {
	private int [] playBoard = new int [40];
	private int [][] homePosition = new int [4][4];
	private int [][] startPosition = new int [4][4];
	
	public Board() {
		
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
