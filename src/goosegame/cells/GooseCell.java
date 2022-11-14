package goosegame.cells;
import java.util.*;
import goosegame.*;


public class GooseCell extends BasicCell implements Cell{

      /**
      * goose cell creation
      * @param i the index of cell 
      */
      public GooseCell(int i){
            super(i);
      }

      /**
      * return the next cell where the player go
      * @param due result of the due
      * @return the index where the player must go
      */
      public int targetCell(int due){
            return super.targetCell(due)+due;
      }

      /**
      * representation of GooseCell
      * @return String representation of GooseCell
      */
      public String toString(){
            return  super.toString()+ " (Goose)";
      }
}
