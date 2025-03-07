package Java_Intro._5_.menu_loop_monkey_intake;


public class Monkey extends RescueAnimal {
    // Instance variables
    private String species;
    private String tailLength;
    private String height;
    private String bodyLength;

    // Default constructor
    public Monkey() {
    }

    // Parameterized constructor
    public Monkey(String name, String species, String gender, String age, String weight, String acquisitionDate,
                    String acquisitionCountry, String trainingStatus, boolean reserved, String inServiceCountry,
                    String tailLength, String height, String bodyLength) {
        setName(name);
        setSpecies(species);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
    }

    // Accessor methods
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getTailLength() {
        return tailLength;
    }

    public void setTailLength(String tailLength) {
        this.tailLength = tailLength;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(String bodyLength) {
        this.bodyLength = bodyLength;
    }
}
