import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
class Main {
  public static void main(String[] args) {
    Scanner user = new Scanner(System.in);
    ArrayList<String> inventory= new ArrayList<String>();
    int menu=0;
    
    while(menu!=5){
      System.out.println("Press 1 to add an item.");
      System.out.println("Press 2 to delete an item.");
      System.out.println("Press 3 to update an item.");
      System.out.println("Press 4 to show all the items.");
      System.out.println("Press 5 to quit the program.");

      menu=user.nextInt();
      if(menu==1){
        System.out.println("Enter the name:");
        user.nextLine();
        String name=user.nextLine();
        System.out.println("Enter the serial number:");
        String num=user.nextLine();
        System.out.println("Enter the value in dollars (whole number):");
        int price = user.nextInt();
        String price1=Integer.toString(price);
        user.nextLine();

        inventory.add(name+","+num+","+price1);
      }
      else if(menu==2){
        //delete something from the arraylist
        System.out.println("Enter the serial number of the item to delete:");
        user.nextLine();
        String ser=user.nextLine();     
        Iterator<String> it = inventory.iterator();
        while(it.hasNext()){
          String find = it.next();
          if(find.contains(ser)){
            it.remove();
            break;
          }
        }
      }
      else if(menu==3){
        //update item from arraylist
        System.out.println("Enter the serial number of the item to change:");
        String se=user.nextLine();
        user.nextLine();
        for(int i=0; i<inventory.size(); i++){
          if(inventory.get(i).contains(se)){
            //continue here
            System.out.println("Enter the new name:");
            String nam=user.nextLine();
            System.out.println("Enter the new value in dollars (whole number):");
            int price=user.nextInt();
            String price1=Integer.toString(price);
            String[] input=inventory.get(i).split(",");
            input[0]= nam;
            input[2]= price1;
            inventory.set(i, String.join(",",input));
            break;
          }
        }
      }
      else if(menu==4){
        for(int i=0;i < inventory.size();i++){
          System.out.println(inventory.get(i));
        }
      }
      else{
        menu=5;
      }
    }
  }

@Override
public String toString() {
	return "Main []";
}
}