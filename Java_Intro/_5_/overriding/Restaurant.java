package Java_Intro._5_.overriding;


public class Restaurant extends Business {
    private int rating;

    public void setRating(int userRating) {
        rating = userRating;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String getDescription() {
        return name + " -- " + address + "\n  Rating: " + rating;
    }
}
