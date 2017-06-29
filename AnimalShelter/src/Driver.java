import java.util.Scanner; /* Import the built-in Java code that allows
 						   * us to use the Scanner class to read user input.*/ 


/**
 * This is the Driver class. The Driver class's job is to actually run
 * the code for the Animal Shelter program. Notice that this is the
 * only class in the AnimalShelter project that has a main method, and
 * that all of the variables and methods in this class are set to
 * static.
 * 
 * @author acr
 *
 */
public class Driver {
	
	private static Scanner reader = new Scanner(System.in); // The Scanner variable that we will use to read user input.
	
	private static Animal animal = new Animal();            /* The Animal variable that we will use to store Animal data.
	 														 * Notice that we are using the empty Animal constructor here
	 														 * because we don't yet know any information about the animal
	 														 * we are creating. This allows us to avoid any Null Pointer
	 														 * Exceptions in our program.*/
	private static Animal [] sam = new Animal[10];
	/* This is the main method. Every Java program requires a main method to
	 * run. When you click the 'Run' button in Eclipse, code will start being
	 * executed on the first line of the main method. 
	 * */
	public static void main(String[] args) {
		
		
		
		for(int i=0; i < 10; i++) {
			sam[i] = new Animal();
			
			
			}
		
		/* We want our program to run until the user exits, so we create
		 * a while loop with the 'true' condition. Remember that a while
		 * loop will continuously run all the code between its two curly
		 * braces until the condition in its parentheses is false. Since
		 * true is never false, the code inside this while loop will run
		 * forever! */
		while(true) {
			
			/* Call the mainMenu method and store its return value in an
			 * integer variable. In this case, the return value of the
			 * mainMenu method will be the user's choice of what menu
			 * option they want to run, so we call the variable 'choice'.
			 * */
			int choice = mainMenu();
			
			/* Next we need to find out what menu option the user chose
			 * and call the appropriate method based on that choice. To
			 * do this, we use an if...else if...else block to evaluate
			 * the user's choice. */
			if(choice == 1) {
				// Option 1 is to store an animal
				storeAnimal();
			}else if(choice == 2) {
				// Option 2 is to retrieve an animal
				retrieveAnimal();
			}else if(choice == 3) {
				// Option 3 is to match animals
				matchAnimals();
			}else if(choice == 4) {
				//Option 4 is to remove an animal
				removeAnimal();
			}else if(choice == 5) {
				//Option 5 is to exit the program
				exit();
			}else {
				/* If the user enters an option other than 1-5, print an error
				 * message that tells them to enter a valid menu option. */
				System.out.println("Please select an option between 1 and 5.");
			}
		}
	}
	
	/**
	 * This is the mainMenu method. This method's job is to print the
	 * main menu to the screen and ask the user to choose an option.
	 * Once the user has made their choice, the mainMenu method returns
	 * that choice to be used elsewhere in the code.
	 * 
	 * @return The user's menu choice.
	 */
	public static int mainMenu() {
		System.out.println("Welcome to AnimalShelter v1.0!");
		System.out.println("Please select an option from the list below:");
		System.out.println("1. Store Animal");
		System.out.println("2. Retrieve Animal");
		System.out.println("3. Match Animal");
		System.out.println("4. Remove Animal");
		System.out.println("5. Exit");
		
		int choice = reader.nextInt();
		return choice;
	}
	
	/**
	 * This is the storeAnimal method. Its job is to ask the user
	 * for all the pieces of information about an Animal, and use
	 * that information to create a completely filled-out Animal
	 * variable.
	 */
	public static void storeAnimal() {
		// This line of code needs to be here in order to fix a bug in Java's Scanner code.
		reader.nextLine();
				
		System.out.println("Please enter the animal's information below.");
		
		//Ask the user for the animals' name.
		System.out.println("Name: ");
		String name = reader.nextLine();
		
		//Ask the user for the animal's type.
		System.out.println("Type: ");
		String type = reader.nextLine();
		
		if(type.equalsIgnoreCase("Dog")){
			System.out.println("Breed: ");
			String Breed = reader.nextLine();
			
			System.out.println("Cuteness(1 to 10): ");
			String Cuteness = reader.nextLine();
			
			System.out.println("Tags(y/n)?: ");
			String Tags = reader.nextLine();
		}
		
		if(type.equalsIgnoreCase("Fish")){
			System.out.println("Length(inch): ");
			String Length = reader.nextLine();
			
			System.out.println("Saltwater(y/n)?: ");
			String Saltwater = reader.nextLine();
			
			System.out.println("Scales(y/n)?: ");
			String Scales = reader.nextLine();
		}
		//Ask the user for the animal's age.
		System.out.println("Age: ");
		int age = reader.nextInt();
		
		reader.nextLine(); //Fix reader bug before asking for vaccination information.
		
		//Ask the user whether the animal has been vaccinated.
		System.out.println("Vaccinated (y/n)? ");
		
		/* Since 'y' and 'n' are strings, we need to use the code
		 * below to check whether the user entered a 'y' or an 'n'
		 * and set a boolean variable to true or false accordingly.
		 * Note that you cannot use == to check String equality.
		 * Instead, you must use the equals method, which is part
		 * of Java's String class. */
		String v = reader.nextLine();
		boolean vacc;
		if(v.equals("y")) {
			vacc = true;
		}else {
			vacc = false;
		}
		
		//Ask the user whether the animal has been fixed.
		System.out.println("Fixed (y/n)? ");
		String f = reader.nextLine();
		boolean fixed;
		if(f.equals("y")) {
			fixed = true;
		}else {
			fixed = false;
		}
		
		//Ask the user for the color of the animal.
		System.out.println("Color: ");
		String color = reader.nextLine();
		
		//Create a new Animal variable using the complete Animal constructor.
		animal = new Animal(name, type, age, vacc, fixed, color);
	}
	
	/**
	 * This is the retrieveAnimal method. Its job is simply to print the
	 * information about an animal to the screen. Notice how we are using
	 * the Animal class's get methods to accomplish this. Notice also how
	 * we can combine Strings in quotes and variables of any type using
	 * the + sign in our print statements.
	 */
	public static void retrieveAnimal() {
		System.out.println("Which animal would you like? (enter a name)");
		reader.nextLine();
		
		String name= reader.nextLine();
		
		Animal a = animal;
		for(int i = 0; i<sam.length; i++) {
			if(sam[i].getName().equals(name)){
				System.out.println("Found a match");
				a = sam[i];
			}
		}
		
		System.out.println("Name: " + a.getName());
		System.out.println("Type: " + a.getType());
		System.out.println("Age: " + a.getAge());
		System.out.println("Vaccinated: " + a.getVacc());
		System.out.println("Fixed: " + a.getFixed());
		System.out.println("Color: " + a.getColor());
	}
	
	/**
	 * This is the matchAnimals method. Our program is not sophisticated
	 * enough to support this functionality yet, so we use a "TODO"
	 * statement to remind ourselves that we need to come back and finish
	 * this later.
	 */
	public static void matchAnimals() {
		System.out.println("Type: ");
		String type = reader.nextLine();
		for(int i = 0; i < sam.length; i++){
		if(animal.getType().equals("dog") && type.equals("dog")){
			System.out.println(animal.getName());
		}
		if(animal.getType().equals("fish") && type.equals("fish")){
			System.out.println(animal.getName());
		}
		}

	}
	
	/**
	 * This is the removeAnimal method. Its job is to clear out all the
	 * information about an animal that may have been stored previously.
	 * Notice how we use the Animal class's set methods to accomplish
	 * this.
	 */
	public static void removeAnimal() {
		animal.setName("");
		animal.setType("");
		animal.setAge(-1);
		animal.setVacc(false);
		animal.setFixed(false);
		animal.setColor("");
	}
	
	/**
	 * This is the exit method. It simply exits the program.
	 * Remember that any number you wish can go in the parentheses
	 * of the System.exit call, but there must be an integer of
	 * some kind.
	 */
	public static void exit() {
		System.exit(868);
	}
}
