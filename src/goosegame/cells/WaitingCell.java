package goosegame.cells;
import java.util.*;
import goosegame.*;



public class WaitingCell extends BasicCell{
      protected int duration;
      protected int waitTime;

      /**
      * create the cell
      * @param index the index of cell in the board
      * @param durationWait the time you wait in cell
      */
      public WaitingCell(int i, int duration){
        super(i);
        this.duration = duration;
        this.waitTime = duration;

      }

      /**
      * allow us to know if the cell can left
      * @return <code>true</code> if the player is allow to go and  <code>false</code> if not
      */
      public boolean canGo(){
          if(this.waitTime == 0){
            return true;
          }
          else {
            this.waitTime -=1;
            return false;
          }

      }

      /**
      * insert the player in this cell
      * @param p the player who will play
      *
      */
      public void insertPlayer(Player p){
            super.insertPlayer(p);
            this.waitTime = this.duration;
      }

      /**
      * representation of cell
      * @return String representation of Cell
      */
      public String toString(){
            return super.toString()+ " waiting fo "+this.duration+" rounds";
      }
}
