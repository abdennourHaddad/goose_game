package goosegame;

public class Main {

	/**
	 * the main method
	 * 
	 * @param args list of args (Players)
	 */
	public static void main(String[] args) {
		Board b = ClassicBoard.ClassicB;
		Game g = new Game(b);
		for (int i = 0; i < args.length; i++)
			g.addPlayer(new Player(args[i]));
		g.play();
	}
}
