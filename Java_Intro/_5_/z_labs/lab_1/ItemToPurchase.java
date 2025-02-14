package Java_Intro._5_.z_labs.lab_1;


public class ItemToPurchase {
    private String itemName;
    private int itemPrice;
    private int itemQuantity;

    // Default Constructor
    public ItemToPurchase() {
        itemName = "none";
        itemPrice = 0;
        itemQuantity = 0;
    }

    //public member methods (mutators & accessors)
    public void setName(String name) {
        itemName = name;
    }
    public String getName() {
        return itemName;
    }
    public void setPrice(int price) {
        itemPrice = price;
    }
    public int getPrice() {
        return itemPrice;
    }
    public void setQuantity(int quantity) {
        itemQuantity = quantity;
    }
    public int getQuantity() {
        return itemQuantity;
    }

    //print item to purchase
    public void printItemPurchase() {
        System.out.println(itemName + " " + itemQuantity + " @ $" + itemPrice + " = $" + (itemPrice * itemQuantity));
    }
}
