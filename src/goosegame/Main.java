package goosegame;
import java.util.*;
import goosegame.*;
import goosegame.cells.*;

public class Main{

    public static void main(String[] args){
          Board b = ClassicBoard.ClassicB;
          Game g = new Game(b);
          for(int i = 0; i<args.length; i++)
                g.addPlayer(new Player(args[i]));
          g.play();
    }
}
