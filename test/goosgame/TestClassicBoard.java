package goosgame;

import static org.junit.Assert.*;
import org.junit.Test;

import goosegame.*;
import goosegame.cells.*;

public class TestClassicBoard {

	@Test
	public void testOfConstructor() {
		Board board = ClassicBoard.ClassicB;
		assertNotNull(board);
		assertTrue(board.getcell(0) instanceof StartCell);
		assertTrue(board.getcell(3) instanceof BasicCell);
		assertTrue(board.getcell(6) instanceof TeleportCell);
		assertTrue(board.getcell(9) instanceof GooseCell);
		assertTrue(board.getcell(18) instanceof GooseCell);
		assertTrue(board.getcell(19) instanceof WaitingCell);
		assertTrue(board.getcell(27) instanceof GooseCell);
		assertTrue(board.getcell(31) instanceof TrapCell);
		assertTrue(board.getcell(36) instanceof GooseCell);
		assertTrue(board.getcell(42) instanceof TeleportCell);
		assertTrue(board.getcell(45) instanceof GooseCell);
		assertTrue(board.getcell(52) instanceof TrapCell);
		assertTrue(board.getcell(54) instanceof GooseCell);
		assertTrue(board.getcell(58) instanceof TeleportCell);

	}

	public static junit.framework.Test suite() {
		return new junit.framework.JUnit4TestAdapter(TestClassicBoard.class);
	}
}
