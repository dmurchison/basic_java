package Java_Intro._5_.inheritance;


public class Restaurant extends Business {
    private int rating;

    public void setRating(int userRating) {
        rating = userRating;
    }

    public int getRating() {
        return rating;
    }
}
