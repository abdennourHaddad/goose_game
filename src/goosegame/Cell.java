package goosegame;

/**
 * Interface of cells
 */
public interface Cell {
	/**
	 * return the index of cell in board
	 * 
	 * @return int the index of cell
	 */
	public int getIndex();

	/**
	 * allow us to know if the cell can left
	 * 
	 * @return <code>true</code> if the player is allow to go and <code>false</code>
	 *         if not
	 */
	public boolean canGo();

	/**
	 * test if this cell busy by player
	 * 
	 * @return <code>true</code> if the cell is busy and <code>false</code> if not
	 */
	public boolean isBusy();

	/**
	 * return the player in this cell
	 * 
	 * @return player in this cell
	 */
	public Player getPlayer();

	/**
	 * return the next cell where the player go
	 * 
	 * @param i a number
	 * @return the index where the player must go
	 */
	public int targetCell(int i);

	/**
	 * insert the player in this cell
	 * 
	 * @param p the player who will play
	 */
	public void insertPlayer(Player p);

	/**
	 * set the cell free
	 */
	public void setfree();

}
