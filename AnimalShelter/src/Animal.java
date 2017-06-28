/**
 * This is the Animal class that defines a generic Animal for our Shelter program.
 * You can think of this class as the place where we store information that we
 * need about every animal, no matter what kind it is. All the other classes in
 * this program that are named after specific animals are children of this class,
 * meaning that they will inherit all of the information you see here along with
 * any additional information that we define within the child class itself.
 * 
 * @author acr
 *
 */
public class Animal {
	private String name;        // The name of the animal.
	
	private String type; 		/* The type of animal being stored.
	 							 * This will be used in the future
	 					         * to determine if we are storing a
	 					         * dog or a fish.*/
	
	private int age;            // The age of the animal in years.
	
	private boolean vaccinated; // Whether or not the animal has been vaccinated.
	
	private boolean fixed;      // Whether or not the animal has been fixed.
	
	private String color;       // The color of the animal.
	
	/**
	 * This is the Animal class constructor. A constructor is a special piece of code
	 * that allows us to declare variables of this class elsewhere in our class. We
	 * can create more than one constructor per class depending on how many different
	 * ways we want to be able to create variables of this class type.
	 * 
	 * This constructor requires that we pass in variables for every piece of
	 * information we can store about an animal, in the order that we declared those
	 * variables above.
	 * 
	 * @param n The animal's name
	 * @param t The animal's type 
	 * @param a The animal's age in years
	 * @param v Whether the animal has been vaccinated
	 * @param f Whether the animal has been fixed
	 * @param c The animal's color
	 */
	
	public Animal(String n, String t, int a, boolean v, boolean f, String c) {
		
		/* Here we use our set methods to assign the values passed into the constructor
		 * to the private variables in our Animal class. We do this so that if we need
		 * to change any details about how a value is assigned to an Animal variable
		 * (for example, if we want all animal names to be in all-capital letters) then
		 * we only need to make that change once, in our set method.*/
		setName(n);
		setType(t);
		setAge(a);
		setVacc(v);
		setFixed(f);
		setColor(c);
	}
	
	/**
	 * This is another Animal constructor that we are creating to make it possible to
	 * create Animal variables without knowing all of the information about the animal
	 * beforehand. We actually use this constructor at the top of the Driver class to
	 * avoid any Null Pointer exceptions if the user tries to retrieve an Animal's
	 * information without storing anything first.
	 */
	public Animal() {
		
		/* Here we use our set methods to assign values that represent an "empty"
		 * Animal variable. This way there are no variables set to null, so we do
		 * not have to worry about Null Pointer Exceptions. */
		setName("");
		setType("");
		setAge(-1);
		setVacc(false);
		setFixed(false);
		setColor("");
	}
	
	
	/* These are our set methods. Set methods are used to change the variables for a
	 * class. Notice that there is one set method for each one of our private variables
	 * at the top of the Animal class. Notice also that we are passing a value of the
	 * same type as the corresponding Animal variable into the method. The variable
	 * will be set to the value that we pass into the set method. */
	
	public void setName(String n) {
		name = n;
	} 
	
	public void setType(String t) {
		type = t;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	public void setVacc(boolean v) {
		vaccinated = v;
	}
	
	public void setFixed(boolean f) {
		fixed = f;
	}
	
	public void setColor(String c) {
		color = c;
	}
	
	
	/* These are our get methods. Get methods are used to retrieve the variables for a
	 * class. Notice that there is one get method for each one of our private variables
	 * at the top of the Animal class. Notice also that we are using return values to
	 * ensure that when we call these get methods, the values of the Animal variables
	 * are given to us. */
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;		
	}
	
	public int getAge() {
		return age;
	}
	
	public boolean getVacc() {
		return vaccinated;
	}
	
	public boolean getFixed() {
		return fixed; 
	}
	
	public String getColor() {
		return color;
	}

}
