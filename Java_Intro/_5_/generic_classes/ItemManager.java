package Java_Intro._5_.generic_classes;


public class ItemManager {
    public static void main(String[] args) {
        Item<Integer> itemInt = new Item<Integer>(21);
        Item<Character> itemChar = new Item<Character>('u');

        itemInt.updateCount(21);
        itemInt.updateCount(32);

        itemChar.updateCount('z');
        itemChar.updateCount('j');
    }
}
