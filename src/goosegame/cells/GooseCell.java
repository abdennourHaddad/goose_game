package goosegame.cells;

/* 
 * a class representing a gooseCell
 */
public class GooseCell extends BasicCell {

	/**
	 * goose cell creation
	 * 
	 * @param i the index of cell
	 */
	public GooseCell(int i) {
		super(i);
	}

	/**
	 * return the next cell where the player go
	 * 
	 * @param due result of the due
	 * @return the index where the player must go
	 */
	@Override
	public int targetCell(int due) {
		return super.targetCell(due) + due;
	}

	/**
	 * representation of GooseCell
	 * 
	 * @return String representation of GooseCell
	 */
	@Override
	public String toString() {
		return super.toString() + " (Goose)";
	}
}
