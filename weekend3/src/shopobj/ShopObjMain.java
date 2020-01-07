package shopobj;

import java.util.Scanner;

public class ShopObjMain {
    public static void main(String[] args) {
//        Warehouse warehouse=new Warehouse();
//        Product iron= new Product("żelazko", 20);
//        warehouse.addProduct(iron, 2);
//        warehouse.addProduct(new Product("odkurzacz", 300), 3);
//        warehouse.addProduct(iron, 2);
//        warehouse.displayProducts();
//        warehouse.takeProduct("żelazko");
//        System.out.println();
//        warehouse.displayProducts();

        Warehouse warehouse = new Warehouse();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayActions();

            String choice=scanner.nextLine();
            switch(choice) {
                case "buy":
                    System.out.println("Insert product name: ");
                    String productToBuyName=scanner.nextLine();
                    Product buyingProduct=warehouse.takeProduct(productToBuyName);
                    if(buyingProduct==null) {
                        System.out.println("Nie wpisałeś nazwy produktu lub jest zła.");
                        break;
                    }
                    System.out.println("You have to paj " + buyingProduct.getPrice()+" zł");
                    break;
                case "disp":
                    warehouse.displayProducts();
                    break;
                case "add":
                    System.out.println("Insert product name:");
                    String productName=scanner.nextLine();
                    System.out.println("Insert product price:");
                    int productPrice=scanner.nextInt();
                    System.out.println("Insert product amount:");
                    int productsAmount=scanner.nextInt();
                    scanner.nextLine();
                    warehouse.addProduct(new Product(productName, productPrice), productsAmount);
                    System.out.println("Product has been added.");
                    break;
                case "end":
                    System.out.println("Thank you, bye bye");
                    return;
                default:
                    System.out.println("Unexpected choice");
                    break;
            }

        }
    }
    public static void displayActions() {
        System.out.println("Select action: ");
        System.out.println("- buy");
        System.out.println("- add");
        System.out.println("- disp");
        System.out.println("- end");
    }
}
