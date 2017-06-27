import java.util.Scanner;

public class Driver {
	
	private static Scanner reader = new Scanner(System.in);
	private static Animal animal = new Animal();
	
	public static void main(String[] args) {
		while(true) {
			int choice = mainMenu();
			if(choice == 1) {
				storeAnimal();
			}else if(choice == 2) {
				retrieveAnimal();
			}else if(choice == 3) {
				matchAnimals();
			}else if(choice == 4) {
				removeAnimal();
			}else if(choice == 5) {
				exit();
			}else {
				System.out.println("Please select an option between 1 and 5.");
			}
		}
	}
	
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
	
	public static void storeAnimal() {
		reader.nextLine();
		
		System.out.println("Please enter the animal's information below.");
		System.out.println("Name: ");
		String name = reader.nextLine();
		
		System.out.println("Type: ");
		String type = reader.nextLine();
		
		System.out.println("Age: ");
		int age = reader.nextInt();
		
		reader.nextLine(); //Fix reader bug before asking for vaccination information.
		
		System.out.println("Vaccinated (y/n)? ");
		String v = reader.nextLine();
		boolean vacc;
		if(v.equals("y")) {
			vacc = true;
		}else {
			vacc = false;
		}
		
		System.out.println("Fixed (y/n)? ");
		String f = reader.nextLine();
		boolean fixed;
		if(f.equals("y")) {
			fixed = true;
		}else {
			fixed = false;
		}
		
		System.out.println("Color: ");
		String color = reader.nextLine();
		
		animal = new Animal(name, type, age, vacc, fixed, color);
	}
	
	public static void retrieveAnimal() {
		System.out.println("Name: " + animal.getName());
		System.out.println("Type: " + animal.getType());
		System.out.println("Age: " + animal.getAge());
		System.out.println("Vaccinated: " + animal.getVacc());
		System.out.println("Fixed: " + animal.getFixed());
		System.out.println("Color: " + animal.getColor());
	}
	
	public static void matchAnimals() {
		//TODO: Implement this.		
	}
	
	public static void removeAnimal() {
		animal.setName("");
		animal.setType("");
		animal.setAge(-1);
		animal.setVacc(false);
		animal.setFixed(false);
		animal.setColor("");
	}
	
	public static void exit() {
		System.exit(868);
	}
}
