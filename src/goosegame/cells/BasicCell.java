package goosegame.cells;

import goosegame.*;

/**
 * create a basic cell
 */
public class BasicCell implements Cell {

	protected int i; // the index of this cell in the boeard
	protected Player p; // the player on this cell

	/**
	 * create basic cell
	 * 
	 * @param i the index of cell in the board
	 */
	public BasicCell(int i) {
		this.i = i;
		this.p = null;
	}

	/**
	 * return the index of cell in board
	 * 
	 * @return int the index of cell
	 */
	public int getIndex() {
		return this.i;
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
	 * test if this cell busy by player
	 * 
	 * @return <code>true</code> if the cell is busy and <code>false</code> if not
	 */
	public boolean isBusy() {
		return this.p != null;
	}

	/**
	 * return the player in this cell
	 * 
	 * @return player in this cell
	 */
	public Player getPlayer() {
		return this.p;
	}

	/**
	 * return the next cell where the player go
	 * 
	 * @param index a number
	 * @return the index where the player must go
	 */
	public int targetCell(int index) {
		return this.i;
	}

	/**
	 * Add the player to this cell
	 * 
	 * @param p player
	 */
	public void insertPlayer(Player p) {
		this.p = p;
	}

	/**
	 * set the cell free
	 */
	public void setfree() {
		this.p = null;
	}

	/**
	 * bounce few cells
	 * 
	 * @param dicethrow number of cells
	 * @return (int)
	 */
	public int bounce(int dicethrow) {
		return 0;
	}

	/*
	 * representation of cell
	 * 
	 * @return String representation of Cell
	 */
	public String toString() {
		return "cell " + this.getIndex();
	}
}
