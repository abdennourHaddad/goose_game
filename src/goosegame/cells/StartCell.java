package goosegame.cells;

import goosegame.*;

/*
 * a class representing the start cell
 */
public class StartCell implements Cell {
	
	/*
	 strat cell creation
	 */
	public StartCell() {
		//

	}

	/**
	 * Add the player to this cell
	 * 
	 * @param p player
	 */
	public void insertPlayer(Player p) {
		//
	}

	/**
	 * allow us to know if the cell can left
	 * 
	 * @return <code>true</code> if the player is allow to go and <code>false</code>
	 *         if not
	 */
	public boolean canGo() {
		return true;
	}

	/**
	 * move the player to an other goose
	 * 
	 * @param i the jumpe for the next goose
	 */
	public int targetCell(int i) {
		return 0;
	}

	/**
	 * return the index of the player
	 * 
	 * @return index
	 */
	public int getIndex() {
		return 0;
	}

	/**
	 * return <code>false</code> beacause the start cell is always unbussy
	 */
	public boolean isBusy() {
		return false;
	}

	/**
	 * set the cell free
	 * Coment gerer la methode de setfree dans la case de depart vu que c'est tous
	 * les
	 * joueurs qui y sont
	 */
	public void setfree() {
		// Comment gerer la methode de setfree dans la case de depart vu que c'est tous
		// les joueurs qui y sont

	}

	public Player getPlayer() {
		return null;
	}

	public String toString() {
		return "cell 0";
	}

}
