import java.util.Scanner;
public class SmartWarehouseInventoryTracker {
     public void main(String[] args){
        Scanner s = new Scanner(System.in);
        String[][] inventory = new String[3][5];

        fillinventory(inventory , s);

        System.out.println("---------------------------------------------------------------");

        for(int i = 0 ; i < inventory.length ; i++){
            for(int j = 0 ; j < inventory[i].length ; j++){
                System.out.print("| " + inventory[i][j] + " \t | ");
                
            }
            System.out.println("");
            System.out.println("---------------------------------------------------------------");        }

        
        for(int i = 0 ;i < inventory.length ;i++){
            for(int j = 1; j < inventory[i].length ; j++){
                System.out.println("Category : \"" + inventory[i][0] + "\" -  Slot : " + j + " -  Quantity : " + inventory[i][j]);
                int quantity = Integer.parseInt(inventory[i][j]);
                System.out.println("Status of item in slot " + j + " : " + restock(quantity));
            }
        }


        System.out.println("Total stock in warehouse : " + totalStock(inventory));

        System.out.println("Inventory tracking completed.");
        
    }

    String fillinventory(String[][] inventory , Scanner s){
        for(int i = 0 ; i < 3 ; i++){
            System.out.print("Enter category name : ");
            inventory[i][0] = s.nextLine();
        }

        for(int i = 0 ; i < inventory.length ; i++){
            System.out.println("| \"Category\" : | \"" + inventory[i][0] + "\"");
            for(int j = 1 ; j < inventory[i].length ; j++){
                System.out.print("Enter quantity of Slot " + j + " in category " + inventory[i][0] + " : ");
                inventory[i][j] = s.nextLine();
            }
            System.out.println("<------------------------------>");

        }

        for(int i = 0 ; i < inventory.length ; i++){
            for(int j = 1 ; j< inventory[i].length ; j++){
                int check = Integer.parseInt(inventory[i][j]);
                if(check < 0){
                    System.out.println("Items in category " + inventory[i][0] + "Slot : " + j + " are out of stock.");
                    inventory[i][j] = "0";
                }
            }
        }

        return inventory.toString();
    }

    String restock(int inventory){
        if(inventory > 10){
            return "Healthy stock level.";
        }else if(inventory > 5 && inventory <= 10){
            return "Low stock level. Consider restocking soon.";
        }else{
            return "Critical";
        }

    }

    int totalStock(String[][] inventory){
        int total = 0;
        for(int i = 0 ; i < inventory.length ; i++){
            for(int j = 1 ; j < inventory[i].length ; j++){
                total += Integer.parseInt(inventory[i][j]);
            }
        }
        return total;
    }
}