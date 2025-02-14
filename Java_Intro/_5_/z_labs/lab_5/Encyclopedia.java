package Java_Intro._5_.z_labs.lab_5;


public class Encyclopedia extends Book {
    // Declare private fields: edition, numVolumes
    private String edition;
    private int numVolumes;

    // Define mutator methods -
    //       setEdition(), setNumVolumes()
    public void setEdition(String userEdition) {
        edition = userEdition;
    }

    public void setNumVolumes(int userNumVolumes) {
        numVolumes = userNumVolumes;
    }

    // Define accessor methods -
    //       getEdition(), getNumVolumes()
    public String getEdition() {
        return edition;
    }

    public int getNumVolumes() {
        return numVolumes;
    }

    // Define a printInfo() method that overrides
    //       the printInfo in Book class
    public void printInfo() {
        System.out.println("Encyclopedia Information: ");
        System.out.println("   Book Title: " + title);
        System.out.println("   Author: " + author);
        System.out.println("   Publisher: " + publisher);
        System.out.println("   Publication Date: " + publicationDate);
        System.out.println("   Edition: " + edition);
        System.out.println("   Number of Volumes: " + numVolumes);
    }
}
