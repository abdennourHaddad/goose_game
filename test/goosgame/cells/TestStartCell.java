package goosgame.cells;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import goosegame.*;
import goosegame.cells.*;

public class TestStartCell {
	private StartCell cell;
	private Player p1;
	private Player p2;

	@Before
	public void before() {
		this.cell = new StartCell();
		this.p1 = new Player("eren");
		this.p2 = new Player("ymir");
	}

	@Test
	public void testOfCanGo() {
		assertTrue(this.cell.canGo());
	}

	@Test
	public void testOfTargetCell() {
		assertEquals(0, this.cell.targetCell(0));
	}

	public static junit.framework.Test suite() {
		return new junit.framework.JUnit4TestAdapter(TestStartCell.class);
	}

}
