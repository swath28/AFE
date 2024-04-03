import coin.Coin;
import item.Item;
import item.ItemShelf;
import item.ItemType;
import vendingMachine.*;
//import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        VendingMachine vendingMachine=new VendingMachine();
          System.out.println("Fill vendingMachine");
         fillInventory(vendingMachine);
          System.out.println("Display vendingMachine");
         displayInventory(vendingMachine);
          VendingMachineState vendingMachineState=new VendingMachineState();
           vendingMachineState.insertCoin(Coin.FIFTY);
           vendingMachineState.insertCoin(Coin.TWENTY);
           vendingMachineState.selectProduct(vendingMachine, 102);
            displayInventory(vendingMachine);
    }
    private static void fillInventory(VendingMachine vendingMachine){
          ItemShelf[] itemShelfSlots=vendingMachine.gInventory().getInventory();
                 for(int i=0;i<itemShelfSlots.length;i++){
                    Item item=new Item();
                     if( i==0 || i==8){
                       item.setType(ItemType.OREO);
                       item.setPrice(40);
                     }else if(i==1 || i==9){
                        item.setType(ItemType.CHIPS);
                        item.setPrice(20);
                     }else if(i==2){
                        item.setType(ItemType.CHOCOLATE);
                        item.setPrice(60);
                     }else if(i==3){
                        item.setType(ItemType.COKE);
                        item.setPrice(40);
                     }else if(i==4){
                      item.setType(ItemType.SODA);
                      item.setPrice(20);
                     }else if(i==5){
                      item.setType(ItemType.GUM);
                      item.setPrice(10);
                     }else if(i==6){
                      item.setType((ItemType.CANDY));
                      item.setPrice(30);
                     }else if(i==7){
                      item.setType(ItemType.JUICE);
                      item.setPrice(50);
                     }
                     itemShelfSlots[i].setItem(item);
                     itemShelfSlots[i].setIsSold(false);
                 }
    }
    private static void displayInventory(VendingMachine vendingMachine){
          ItemShelf[] itemShelfSlots=vendingMachine.gInventory().getInventory();
           for(ItemShelf shelf:itemShelfSlots){
             System.out.println("ItemCode: "+shelf.getItemCode()+" ItemType: "+shelf.getItem().getType()+" ItemPrice: "+shelf.getItem().getPrice()+" isAvailable: "+shelf.getIsSold());
           }
    }
}
