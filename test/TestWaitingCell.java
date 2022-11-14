import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import goosegame.*;
import goosegame.cells.*;

public class TestWaitingCell{
    private Cell cell;
    private Player p1;
    private Player p2;

    @Before
    public void before(){
        this.cell = new WaitingCell(19,2);
        this.p1 = new Player("eren");
        this.p2 = new Player("ymir");
    }

    @Test
    public void testOfCanGo(){
        assertFalse(this.cell.canGo());
        assertFalse(this.cell.canGo());
        assertTrue(this.cell.canGo());
    }

    @Test
    public void testOfIsBusy(){
        assertFalse(this.cell.isBusy());
        this.cell.insertPlayer(this.p1);
        assertTrue(this.cell.isBusy());
    }

    @Test
    public void testOfGetPlayer(){
          this.cell.insertPlayer(this.p1);
          assertSame(p1, this.cell.getPlayer());
    }

    @Test
    public void testOfTargetCell(){
          assertEquals(19, this.cell.targetCell(1));
    }


  public static junit.framework.Test suite() {
return new junit.framework.JUnit4TestAdapter(TestGooseCell.class);
  }

}
