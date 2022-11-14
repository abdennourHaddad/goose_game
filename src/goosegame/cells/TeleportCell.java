package goosegame.cells;
import java.util.*;
import goosegame.*;


public class TeleportCell extends BasicCell implements Cell{
      protected int jumpcell;

      /**
      * teleport cell creation
      * @param i the index of the cell
      * @param j the index of the jump cell
      */
      public TeleportCell(int i, int j ){
            super(i);
            this.jumpcell=j;
      }

      /**
      * return the next cell where the player go
      * @param due a number or the result of the due(useless)
      * @return the index where the player must go
      */
      public int targetCell(int due){
            return this.jumpcell;
      }

      /**
      * representation of TeleportCell
      * @return String representation of TeleportCell
      */
      public String toString(){
        return super.toString()+" teleport to "+this.jumpcell;
      }



}
