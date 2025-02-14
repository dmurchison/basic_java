package Java_Intro._5_.menu_loop_monkey_intake;
import java.util.ArrayList;
import java.util.Scanner;


public class Driver {
    // Instance variables
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();

    public static void main(String[] args) {
        initializeDogList();
        initializeMonkeyList();

        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
	// For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.
        Scanner scanner = new Scanner(System.in);
        String menuSelection = "";
        while (!menuSelection.equalsIgnoreCase("q")) {
            displayMenu();
            menuSelection = scanner.nextLine();
            if (menuSelection.equals("1")) {
                intakeNewDog(scanner);
            } else if (menuSelection.equals("2")) {
                intakeNewMonkey(scanner);
            } else if (menuSelection.equals("3")) {
                reserveAnimal(scanner);
            } else if (menuSelection.equals("4")) {
                printAnimals("dog");
            } else if (menuSelection.equals("5")) {
                printAnimals("monkey");
            } else if (menuSelection.equals("6")) {
                printAnimals("available");
            } else if (menuSelection.equalsIgnoreCase("q")) {
                System.out.println("Goodbye");
            } else {
                System.out.println("Invalid selection. Please try again.");
            }
        }
    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey("Luna", "Squirrel Monkey", "female", "1", "8.7", "07-22-2021", "Peru", "in service", true, "Canada", "20", "30", "40");
        monkeyList.add(monkey1);
    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }

        // Add the code to instantiate a new dog and add it to the appropriate list
        System.out.println("Enter breed:");
        String breed = scanner.nextLine();
        System.out.println("Enter gender:");
        String gender = scanner.nextLine();
        System.out.println("Enter age:");
        String age = scanner.nextLine();
        System.out.println("Enter weight:");
        String weight = scanner.nextLine();
        System.out.println("Enter acquisition date:");
        String acquisitionDate = scanner.nextLine();
        System.out.println("Enter acquisition country:");
        String acquisitionCountry = scanner.nextLine();
        System.out.println("Enter training status:");
        String trainingStatus = scanner.nextLine();
        System.out.println("Is the dog reserved? (true/false):");
        boolean reserved = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Enter in-service country:");
        String inServiceCountry = scanner.nextLine();

        Dog newDog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
        dogList.add(newDog);
        System.out.println("New dog added to the system.");
    }


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
    public static void intakeNewMonkey(Scanner scanner) {
        System.out.println("What is the monkey's name?");
        String name = scanner.nextLine();
        for (Monkey monkey : monkeyList) {
            if (monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis monkey is already in our system\n\n");
                return; // returns to menu
            }
        }

        // Add the code to instantiate a new monkey and add it to the appropriate list
        System.out.println("Enter species:");
        String species = scanner.nextLine();
        System.out.println("Enter gender:");
        String gender = scanner.nextLine();
        System.out.println("Enter age:");
        String age = scanner.nextLine();
        System.out.println("Enter weight:");
        String weight = scanner.nextLine();
        System.out.println("Enter acquisition date:");
        String acquisitionDate = scanner.nextLine();
        System.out.println("Enter acquisition country:");
        String acquisitionCountry = scanner.nextLine();
        System.out.println("Enter training status:");
        String trainingStatus = scanner.nextLine();
        System.out.println("Is the monkey reserved? (true/false):");
        boolean reserved = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Enter in-service country:");
        String inServiceCountry = scanner.nextLine();
        System.out.println("Enter tail length:");
        String tailLength = scanner.nextLine();
        System.out.println("Enter height:");
        String height = scanner.nextLine();
        System.out.println("Enter body length:");
        String bodyLength = scanner.nextLine();

        Monkey newMonkey = new Monkey(name, species, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry, tailLength, height, bodyLength);
        monkeyList.add(newMonkey);
        System.out.println("New monkey added to the system.");
    }

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
    public static void reserveAnimal(Scanner scanner) {
        System.out.println("Enter the animal type (dog/monkey):");
        String animalType = scanner.nextLine();
        System.out.println("Enter the in-service country:");
        String inServiceCountry = scanner.nextLine();

        boolean found = false;
        if (animalType.equalsIgnoreCase("dog")) {
            for (Dog dog : dogList) {
                if (dog.getInServiceLocation().equalsIgnoreCase(inServiceCountry) && !dog.getReserved()) {
                    dog.setReserved(true);
                    System.out.println(dog.getName() + " has been reserved.");
                    found = true;
                    break;
                }
            }
        } else if (animalType.equalsIgnoreCase("monkey")) {
            for (Monkey monkey : monkeyList) {
                if (monkey.getInServiceLocation().equalsIgnoreCase(inServiceCountry) && !monkey.getReserved()) {
                    monkey.setReserved(true);
                    System.out.println(monkey.getName() + " has been reserved.");
                    found = true;
                    break;
                }
            }
        } else {
            System.out.println("Invalid animal type.");
        }

        if (!found) {
            System.out.println("No available " + animalType + " found in " + inServiceCountry + ".");
        }
    }

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved
	// Remember that you only have to fully implement ONE of these lists.
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
    public static void printAnimals(String listType) {
        if (listType.equalsIgnoreCase("dog")) {
            for (Dog dog : dogList) {
                System.out.println("Name: " + dog.getName());
                System.out.println("Status: " + dog.getTrainingStatus());
                System.out.println("Acquisition Country: " + dog.getAcquisitionLocation());
                System.out.println("Reserved: " + dog.getReserved());
                System.out.println();
            }
        } else if (listType.equalsIgnoreCase("monkey")) {
            for (Monkey monkey : monkeyList) {
                System.out.println("Name: " + monkey.getName());
                System.out.println("Status: " + monkey.getTrainingStatus());
                System.out.println("Acquisition Country: " + monkey.getAcquisitionLocation());
                System.out.println("Reserved: " + monkey.getReserved());
                System.out.println();
            }
        } else if (listType.equalsIgnoreCase("available")) {
            for (Dog dog : dogList) {
                if (dog.getTrainingStatus().equalsIgnoreCase("in service") && !dog.getReserved()) {
                    System.out.println("Name: " + dog.getName());
                    System.out.println("Status: " + dog.getTrainingStatus());
                    System.out.println("Acquisition Country: " + dog.getAcquisitionLocation());
                    System.out.println("Reserved: " + dog.getReserved());
                    System.out.println();
                }
            }
            for (Monkey monkey : monkeyList) {
                if (monkey.getTrainingStatus().equalsIgnoreCase("in service") && !monkey.getReserved()) {
                    System.out.println("Name: " + monkey.getName());
                    System.out.println("Status: " + monkey.getTrainingStatus());
                    System.out.println("Acquisition Country: " + monkey.getAcquisitionLocation());
                    System.out.println("Reserved: " + monkey.getReserved());
                    System.out.println();
                }
            }
        } else {
            System.out.println("This option needs to be implemented.");
        }
    }
}

