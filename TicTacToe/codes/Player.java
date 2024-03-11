package player;

public class Player {
    private String name;
    private char symbol;
    private int age;
    private String num;
    private String email;
    private String address;

    public void setPlayerDetails(String name,int age,char symbol,String num,String email,String address){
        this.name=name;
        this.age=age;
        this.symbol=symbol;
        this.num=num;
        this.email=email;
        this.address=address;
        
    }
    public void setNameAge(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void setNameAgeSymbol(String name,int age,char symbol){
        this.name=name;
        this.age=age;
        this.symbol=symbol;
    }
    public void setNameSymbol(String name,char symbol){
        this.name=name;
        this.symbol=symbol;
    }
     public String getName(){
        return this.name;
     }
     public char getChar(){
        return this.symbol;
     }
     public void getNameSymbol(){
        System.out.println("Name: "+ this.name);
        System.out.println("Symbol: "+this.symbol);
     }
     public void getPlayerDetails(){
      System.out.println("Name: "+this.name);
      System.out.println("Age: "+this.age);
      System.out.println("Symbol: "+this.symbol);
      System.out.println("Number: "+this.num);
      System.out.println("EmailId: "+this.email);
      System.out.println("Address: "+this.address);
        
    }
  
}
