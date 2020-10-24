import java.util.ArrayList;

public class Game {
	ArrayList<Player> players;
	ArrayList<Figur> figurs;
	Board board;
	

	public Game() {
		this.players = new ArrayList<Player>();
		this.figurs = new ArrayList<Figur>();
		this.board = new Board();
	}


}
