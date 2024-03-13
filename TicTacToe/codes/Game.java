package game;
import board.Board;
import player.Player;

import java.util.Scanner;
public class Game {
     Player[] player;
     Board board;
     int turn;
     int noOfMoves;
     boolean gameOver; 
     String zero;
     String cross;

     public Game(Player[] player,Board board){
        this.player=player;
        this.board=board;
        this.turn =0;
        this.noOfMoves=0;
        this.gameOver=false;
        StringBuilder z=new StringBuilder();
        StringBuilder c=new StringBuilder();
            for(int i=0;i<board.size;i++){
                z.append('O');
                c.append('X');
            }
               this.zero=z.toString();
               this.cross=c.toString();
     }
       public void boardConf(){
            int sz = this.board.size;
         for(int i=0;i<sz;i++){
            for(int j=0;j<sz;j++){
                System.out.print(board.matrix[i][j]+" ");
            }
              System.out.println();
         }   
     }
       public void play(){
           boardConf();
           int sz=board.size;
            while(!gameOver){
                noOfMoves++;
                int idx=getIndex();
              int row=idx/sz;
              int col=idx%sz;
                board.matrix[row][col]=player[turn].getSymbol();
                 if(noOfMoves>=sz*sz){
                    System.out.println("Game Draw");
                    return;
                 }
                  if(noOfMoves>=(2*sz)-1 && checkPattern()==true){
                        boardConf();
                       System.out.println("Winner: "+ player[turn].getName());
                       gameOver=true;
                       return; 
                  }
                  turn=(turn+1)%2;
                  boardConf();
            }
       }
     public int getIndex(){
        while(true){
        System.out.println("Player: "+ player[turn].getName()+"Give one position: ");
        Scanner scn=new Scanner(System.in);
         int sz=board.size;
         int pos=scn.nextInt()-1;
         int row=pos/sz;
         int col=pos%sz;
          if(col<0 || col>=sz || row<0 || row>=sz){
             System.out.println("Invalid position");
               continue;
          }
           if(board.matrix[row][col]!='-'){
            System.out.println("Occupied");
              continue;
           }
             
            return pos;
            
        }  
     }
      public boolean checkPattern(){
         int sz=board.size;
          //rowwise
           for(int i=0;i<sz;i++){
             StringBuilder s=new StringBuilder();
              for(int j=0;j<sz;j++){
                s.append(board.matrix[i][j]);
              }
          
              String pattern=s.toString();
               if(pattern.equals(zero) || pattern.equals(cross)) {
                 return true;
             }
     }
         //colwise
           for(int j=0;j<sz;j++){
             StringBuilder s=new StringBuilder();
              for(int i=0;i<sz;i++){
                 s.append(board.matrix[i][j]);
              }
               String pattern=s.toString();
                if(pattern.equals(zero) || pattern.equals(cross)) return true;
           }
        //diagonal
          int i=0,j=0;
              StringBuilder s=new StringBuilder();
           while(i<sz){
               s.append(board.matrix[i][j]);
               i++;
               j++;
           }   String Pattern=s.toString();
              if(Pattern.equals(zero) || Pattern.equals(cross))  return true;

        //Anti diagonal
          i=0;
          j=sz-1;
           s=new StringBuilder();
          while(i<sz){
             s.append(board.matrix[i][j]);
             i++;
             j--;
          }     Pattern=s.toString();
          if(Pattern.equals(zero) || Pattern.equals(cross))  return true;  

         return false; 
  }
}
