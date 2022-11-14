package goosegame;
import java.util.*;



public class Game{
    protected List<Player> thePlayers;
    protected Board board;
    private Iterator<Player> i;

    /**
    * @param board the board we use in Game
    */
    public Game(Board board){
          this.board = board;
          this.thePlayers = new ArrayList<Player>();
    }

    /**
    * this fonction addplayer in Game
    * @param p the player we can add to Game
    */
    public void addPlayer(Player p){
          this.thePlayers.add(p);
          this.board.getcell(0).insertPlayer(p);
          p.setCell(this.board.getcell(0));
    }

    /**
    * this function give the next player in game
    * @return Player the next player
    */
    private Player nextPlayer(){
        if(i==null || (!i.hasNext())){
            i = this.thePlayers.iterator();
        }
        return i.next();
    }

    /**
    * cheick if the player can play
    * @return true if player can play false otherwise
    */
    private boolean canPlay(Player player){
         Cell c = player.getCell();
         return c.canGo();
    }

    /**
    * move the player at the cell
    * @param p the player
    * @param reached the new cell
    */
    private void movePlayer(Player p, Cell reached){
            if (reached.isBusy()){
            Cell c = p.getCell();
            Player p2 =reached.getPlayer();
            c.insertPlayer(p2);
            p2.setCell(c);
            System.out.print(" cell is busy, "+p2.toString()+" is sent to "+c.toString());
          }
          reached.insertPlayer(p);
          p.setCell(reached);

  }
    /**
    * search a new cell for the player
    *@param Player the player
    *@param due the due
    *@return the new cell
    */
    private Cell search(Player player,int due){
          Cell c = player.getCell();
          c.insertPlayer(null);
          int ind = c.getIndex();
          int next = ind+due;
          int val;
          boolean boucle = false;
          while(next>63 || this.board.getcell(next).targetCell(due)>63){
            int a = next-63;
            boucle = true;
            if(a>0){
            next = 63- a;
            next = this.board.getcell(next).targetCell(due);
          }
            else{
              next = this.board.getcell(next).targetCell(due);
              val = 63 - next;
              next = 63 + val;
            }
          }
          System.out.print(this.board.getcell(next).toString());
          if (boucle ==false){
            int next1 = this.board.getcell(next).targetCell(due);
            if (next1!=next){
              System.out.print(" and jump to "+board.getcell(next1).toString());
            }
            return board.getcell(next1);
          }
          return board.getcell(next);
    }

    /**
    *representation of the turn
    *@param p the player
    */
    private void displayTurn(Player p){
      String pnom = p.toString();
      int ind = p.getCell().getIndex();
      System.out.print(pnom+" is in cell "+ind+",");
    }

    /**
    *representation of the turn
    *@param p the player
    */
    private void displayWinner(Player p){
      System.out.println(p.toString()+" has WON !!!");}

    /**
    *Give a representation of the turn
    *@param p the player
    */
    private void displayCanNotPlay(Player p){
      String nom = p.toString();
      System.out.print(nom+" cannot play.");}

      
    /**
    * play the Game
    */
    public void play(){
        boolean won =false;
        Player player = null;
        int cpt = 0;
        while(!won){
            player = this.nextPlayer();
            this.displayTurn(player);
            if(this.canPlay(player)){
                  int due = player.twoDiceThrow();
                  System.out.print(player.toString()+" throws "+due+" and reaches ");
                  Cell reached = this.search(player, due);
                  this.movePlayer(player, reached);
                  won = (reached.getIndex()==Board.getNbOfCells()-1);
            }
            else{
                  this.displayCanNotPlay(player);
            }
            cpt += 1;
            System.out.println("");
            if (cpt % thePlayers.size() == 0)
              System.out.println();
          }
        this.displayWinner(player);

    }

}
