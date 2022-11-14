import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

import goosegame.*;
import goosegame.cells.*;

public class TestPlayer{
    private Cell cell;
    private Player p1;
    private Player p2;
    private Cell cell1;

    @Before
    public void before(){
          this.cell = new BasicCell(5);
          this.cell1 = new BasicCell(4);
          this.p1 = new Player("enzo", this.cell);
          this.p2 = new Player("barry");
    }

    @Test
    public void testOfConstructor(){
        assertNotNull(this.p1);
        assertNotNull(this.p1);
    }

    @Test
    public void testOfGetCell(){
        assertSame(this.cell, this.p1.getCell());
        assertNull(this.p2.getCell());
    }

    @Test
    public void testOfSetCell(){
        this.p2.setCell(this.cell1);
        assertSame(this.cell1, this.p2.getCell());
        this.p1.setCell(this.cell1);
        assertSame(this.cell1, this.p2.getCell());
    }





  public static junit.framework.Test suite() {
  return new junit.framework.JUnit4TestAdapter(TestPlayer.class);
  }
}
