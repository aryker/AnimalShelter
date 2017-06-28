
/**
 * This is the Dog class. It is a child of the Animal class, which means that it
 * has all of the variables and methods of the Animal class along with the extra
 * variables and methods that we are giving it below.
 * 
 * @author acr
 *
 */
public class Dog extends Animal {
	
	private String breed; // The breed of the dog.
	private int cuteness; // How cute the dog is, on a scale from 1(least cute) to 10(cutest).
	private boolean tags; // Whether or not the dog was wearing any tags when it was rescued.
	
	/**
	 * This is the Dog constructor. It requires all of the information we need for the full
	 * animal constructor, along with three additional values for breed, cuteness, and tags. 
	 * 
	 * @param n The dog's name
	 * @param t The animal's type(probably dog in this case)
	 * @param a The dog's age in years
	 * @param v Whether the dog has been vaccinated
	 * @param f Whether the dog has been fixed
	 * @param c The color of the dog
	 * @param b The dog's breed
	 * @param cu The dog's cuteness rating
	 * @param tg Whether or not the dog was found with tags
	 */
	public Dog(String n, String t, int a, boolean v, boolean f, String c, String b, int cu, boolean tg) {
		
		/* Here we call the constructor of the Dog's parent class(Animal) by using the super directive.
		 * Java requires that all child classes do this inside their constructors. */
		super(n, t, a, v, f, c);
		
		// Use set methods to assign dog-specific information. 
		setBreed(b);
		setCuteness(cu);
		setTags(tg);
	}
	
	
	/**
	 * This is another Dog constructor that allows us to create a Dog variable without
	 * knowing information about a Dog beforehand.
	 */
	public Dog() {
		
		/* Notice that here we are calling the other Animal constructor we created
		 * that allows us to create Animals without knowing any additional information. */
		super();
		
		/* Here we use our set methods to assign values that represent an "empty"
		 * Dog variable. This way there are no variables set to null, so we do
		 * not have to worry about Null Pointer Exceptions. */
		setBreed("");
		setCuteness(-1);
		setTags(false);
	}
	
	/* Here are our dog-specific set methods. See the Animal class for more information on set methods.*/
	public void setBreed(String b) {
		breed = b;
	}
	
	public void setCuteness(int c) {
		cuteness = c;
	}
	
	public void setTags(boolean tg) {
		tags = tg;
	}
	
	
	/* Here are our dog-specific get methods. See the Animal class for more information on get methods.*/
	public String getBreed() {
		return breed;
	}
	
	public int getCuteness() {
		return cuteness;
	}
	
	public boolean getTags() {
		return tags;
	}

}
