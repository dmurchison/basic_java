package Java_Intro._5_.overriding;


public class OverridingExample {
    public static void main(String[] args) {
        Restaurant favoritePlace = new Restaurant();
        favoritePlace.setName("Friends Cafe");
        favoritePlace.setAddress("500 W 2nd Ave");
        favoritePlace.setRating(5);
        System.out.println(favoritePlace.getDescription());
        System.out.println(favoritePlace.toString());
    }
}
