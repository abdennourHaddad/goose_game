package goosegame;

import goosegame.cells.*;

/*
 * the board of the game
 */
public abstract class Board {

	protected static int nbOfcells; // board's dimensions
	protected Cell[] theCells; // list of this board's cells

	/**
	 * Board creation
	 * 
	 * @param nbOfCells the number of cell in board
	 */
	protected Board(int nbOfCells) {
		Board.nbOfcells = nbOfCells + 1;
		this.theCells = new Cell[Board.nbOfcells];
		this.theCells[0] = new StartCell();
		initBoard();
	}

	/**
	 * init the board
	 */
	public abstract void initBoard();

	/**
	 * get the cell at index
	 * 
	 * @param i the index of the Cell
	 * @return the cell at index
	 */
	public Cell getcell(int i) {
		return this.theCells[i];
	}

	/**
	 * return the number of cell in board
	 * 
	 * @return int the number of cell in board
	 */
	public static int getNbOfCells() {
		return nbOfcells;
	}
}
