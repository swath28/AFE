import board.Board;
import java.util.Scanner;
import player.Player;
import game.Game;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("First Project-->Tic Tac Toe");
             //Scanner scn=new Scanner(System.in);
             // System.out.println("Enter name and symbol");
              //String name=scn.nextLine();
             //char symbol=scn.nextLine().charAt(0);
               
         Board b =new Board(3,'-');
             b.printBoardConf(); 
            Player p1=new Player();
         p1.setNameSymbol("Ramya",'O');
         p1.getNameSymbol(); 
          Player p2=new Player(); 
          p2.setNameSymbol("Swathi",'X');
          p2.getNameSymbol();
           Game game=new Game(new Player[] {p1,p2},b);
           game.play();
         
    }
}
