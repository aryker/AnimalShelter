/**
 * This is the Fish class. It is a child of the Animal class, which means that it
 * has all of the variables and methods of the Animal class along with the extra
 * variables and methods that we are giving it below.
 * 
 * @author acr
 *
 */
public class Fish extends Animal {

	private double length;     // The length of the fish in centimeters(cm)
	private boolean saltwater; // Whether the fish is a saltwater fish(true) or a freshwater fish(false).
	private boolean scales;    // Whether the fish has scales(true) or not(false)
	
	/**
	 * This is the Fish constructor. It requires all of the information we need for the full
	 * Animal constructor, along with three additional values for length, saltwater, and scales.
	 * 
	 * @param n The fish's name
	 * @param t The animal's type(probably fish in this case)
	 * @param a The fish's age in years
	 * @param v Whether the fish has been vaccinated
	 * @param f Whether the fish has been fixed
	 * @param c The color of the fish
	 * @param l The length of the fish in centimeters
	 * @param sw Whether this is a salt water fish
	 * @param sc Whether this fish has scales
	 */
	public Fish(String n, String t, int a, boolean v, boolean f, String c, double l, boolean sw, boolean sc) {
		
		/* Here we call the constructor of the Fish's parent class(Animal) by using the super directive.
		 * Java requires that all child classes do this inside their constructors. */
		super(n, t, a, v, f, c);
		
		setLength(l);
		setSaltwater(sw);
		setScales(sc);
	}
	
	/**
	 * This is another Fish constructor that allows us to create a Fish variable without
	 * knowing information about a Fish beforehand.
	 */
	public Fish() {
		
		/* Notice that here we are calling the other Animal constructor we created
		 * that allows us to create Animals without knowing any additional information. */
		super();
		
		/* Here we use our set methods to assign values that represent an "empty"
		 * Fish variable. This way there are no variables set to null, so we do
		 * not have to worry about Null Pointer Exceptions. */
		setLength(-1);
		setSaltwater(false);
		setScales(false);
	}
	
	
	/* Here are our fish-specific set methods. See the Animal class for more information on set methods.*/
	public void setLength(double l) {
		length = l;
	}
	
	public void setSaltwater(boolean sw) {
		saltwater = sw;
	}
	
	public void setScales(boolean sc) {
		scales = sc;
	}
	
	
	/* Here are our fish-specific get methods. See the Animal class for more information on get methods.*/
	public double getLength() {
		return length;
	}
	
	public boolean getSaltwater() {
		return saltwater;
	}
	
	public boolean getScales() {
		return scales;
	}
}
