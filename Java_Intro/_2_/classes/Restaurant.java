package Java_Intro._2_.classes;


public class Restaurant {
    private String name;
    private int rating;

    public Restaurant() { // Constructor
        name = "Unknown";
        rating = -1;
    }

    public void setName(String restaurantName) { // Sets the restaurant's name
        name = restaurantName;
    }

    public void setRating(int userRating) { // Sets the rating (1-5, with 5 best)
        rating = userRating;
    }

    public void print() { // Prints name and rating on one line
        System.out.println(name + " -- " + rating);
    }
}
