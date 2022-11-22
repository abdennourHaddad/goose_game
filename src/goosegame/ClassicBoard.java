package goosegame;

import goosegame.cells.*;

/*
   create a classical board
*/
public class ClassicBoard extends Board {

    public static final ClassicBoard ClassicB = new ClassicBoard();

    /**
     * classicBoard creation
     */
    private ClassicBoard() {
        super(63);
    }

    /**
     * Init the board with the right cells
     */
    public void initBoard() {
        for (int i = 1; i < Board.nbOfcells; i++) {
            if (i % 9 == 0 && i < 63) {
                super.theCells[i] = new GooseCell(i);
            } else if (i == 31 || i == 52) {
                super.theCells[i] = new TrapCell(i);
            } else if (i == 19) {
                super.theCells[i] = new WaitingCell(i, 2);
            } else if (i == 6) {
                super.theCells[i] = new TeleportCell(i, 12);
            } else if (i == 42) {
                super.theCells[i] = new TeleportCell(i, 30);
            } else if (i == 58) {
                super.theCells[i] = new TeleportCell(i, 1);
            } else {
                super.theCells[i] = new BasicCell(i);
            }

        }
    }

}
