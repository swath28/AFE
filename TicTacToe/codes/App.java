import board.Board;
import java.util.Scanner;
import player.Player;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("First Project-->Tic Tac Toe");
              Scanner scn=new Scanner(System.in);
              System.out.println("Enter name and symbol");
              String name=scn.nextLine();
              char symbol=scn.nextLine().charAt(0);
              
         Board b =new Board(4,'-');
             b.printBoardConf(); 
            Player p1=new Player();
         p1.setNameSymbol(name,symbol);
         p1.getNameSymbol(); 
          Player p2=new Player(); 
          p2.setPlayerDetails("Swathi",19,'X',"9550333089","swath@gmail.com","abc");
          p2.getPlayerDetails();

          
    }
}
