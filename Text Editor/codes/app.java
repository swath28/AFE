import java.util.Scanner;
import notePad.NotePad;
public class App {
    public static void main(String[] args) throws Exception {
         Scanner scn=new Scanner(System.in);
         NotePad notePad=new NotePad(100);
         do{
             System.out.println("1.Display the text");
             System.out.println("2.Display the text from given lines");
             System.out.println("3.Insert the text");
             System.out.println("4.Delete the text");
             System.out.println("5.Delete the text from given lines");
             System.out.println("6.Copy the text");
             System.out.println("7.Paste the text");
             System.out.println("8.Undo the action");
             System.out.println("9.Redo the action");
             System.out.println("10.Exit");
             System.out.println("Please ennter the choice");
             int n=scn.nextInt();
             switch (n) {
                case 1:
                    notePad.display();
                    break;
                case 2:
                   System.out.println("Enter the startingLine and endingLine:");
                  int sl=scn.nextInt();
                  int el=scn.nextInt();
                   notePad.display(sl,el);
                   break;
                case 3:
                 System.out.println("Enter text:");
                  String txt=scn.next();
                  System.out.println("Enter lineNo:");
                  int ln=scn.nextInt();
                  notePad.insert(ln, txt);
                  break;
                case 4:
                  System.out.println("Enter text: ");
                  txt=scn.next();
                  System.out.println("Enter the lineNo:");
                   ln=scn.nextInt();
                  notePad.delete(ln); 
                  break;
                case 5:
                   System.out.println("Enter the startingLine and  endingLine to be deleted:");
                   sl=scn.nextInt();
                   el=scn.nextInt();
                   notePad.delete(sl,el);
                   break;
                case 6:
                   System.out.println("Enter the text to be copied:");
                   txt=scn.next();
                   sl=scn.nextInt();
                   el=scn.nextInt();
                   notePad.copy(sl,el);
                   break;
                case 7:
                   System.out.println("Enter lineNo:");
                   ln=scn.nextInt();
                   notePad.paste(ln);
                   break;
                case 8:
                    notePad.undo();
                    break;
                case 9:
                    notePad.redo();
                    break;
                case 10:
                   System.exit(0);
                   break;
                default:
                    System.out.println("Invalid choice");
             }
         }while(true);
    }
}
