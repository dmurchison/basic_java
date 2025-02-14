package Java_Intro._5_.lab_1;
import java.util.Scanner;


public class ShoppingCartPrinter {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int i = 0;
        String productName;
        int productPrice = 0;
        int productQuantity = 0;
        int cartTotal = 0;


        // Get item 1 details from user, create itemToPurchase object
        ItemToPurchase item1 = new ItemToPurchase();
        System.out.println("Item 1");
        System.out.println("Enter the item name:");
        productName = scnr.nextLine();

        System.out.println("Enter the item price:");
        productPrice = scnr.nextInt();

        System.out.println("Enter the item quantity:");
        productQuantity = scnr.nextInt();

        item1.setName(productName);
        item1.setPrice(productPrice);
        item1.setQuantity(productQuantity);

        // Get item 2 details from user, create itemToPurchase object
        scnr.nextLine();
        ItemToPurchase item2 = new ItemToPurchase();
        System.out.println("\nItem 2");
        System.out.println("Enter the item name:");
        productName = scnr.nextLine();

        System.out.println("Enter the item price:");
        productPrice = scnr.nextInt();

        System.out.println("Enter the item quantity:");
        productQuantity = scnr.nextInt();

        item2.setName(productName);
        item2.setPrice(productPrice);
        item2.setQuantity(productQuantity);

        // Add costs of two items and print total
        cartTotal = (item1.getPrice() * item1.getQuantity()) + (item2.getPrice() * item2.getQuantity());
        System.out.println("\nTOTAL COST");
        item1.printItemPurchase();
        item2.printItemPurchase();
        System.out.println("\nTotal: $" + cartTotal);

        return;
    }
}
