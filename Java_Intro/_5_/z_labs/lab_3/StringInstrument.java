package Java_Intro._5_.z_labs.lab_3;

// Define a class: StringInstrument that is derived from the Instrument class
public class StringInstrument extends Instrument {
    // Declare private fields: numStrings, numFrets
    private int numStrings, numFrets;

    // Define mutator methods -
    //      setNumOfStrings(), setNumOfFrets()
    public void setNumOfStrings(int userNumStrings) {
        numStrings = userNumStrings;
    }

    public void setNumOfFrets(int userNumFrets) {
        numFrets = userNumFrets;
    }

    // Define accessor methods -
    //      getNumOfStrings(), getNumOfFrets()
    public int getNumOfStrings() {
        return numStrings;
    }

    public int getNumOfFrets() {
        return numFrets;
    }

}
