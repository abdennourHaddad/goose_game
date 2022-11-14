package goosegame.cells;
import java.util.*;
import goosegame.*;


public class TrapCell extends BasicCell{

      /**
      * TrapCell creation
      * @param i the index of the cell
      */
      public TrapCell(int i){
            super(i);
      }

      /**
      * allow us to know if the cell can left
      * @return <code>true</code> if the player is allow to go and  <code>false</code> if not
      */
      public boolean canGo(){
            return false;
      }

      /**
      * representation of TrapCell
      * @return String representation of TrapCell
      */
      public String toString(){
        return super.toString()+ " (Trap)";
      }
}
