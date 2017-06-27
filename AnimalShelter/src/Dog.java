
public class Dog extends Animal {
	
	private String breed;
	private int cuteness;
	private boolean tags;
	
	public Dog(String n, String t, int a, boolean v, boolean f, String c, String b, int cu, boolean tg) {
		super(n, t, a, v, f, c);
		
		setBreed(b);
		setCuteness(cu);
		setTags(tg);
	}
	
	public void setBreed(String b) {
		breed = b;
	}
	
	public void setCuteness(int c) {
		cuteness = c;
	}
	
	public void setTags(boolean tg) {
		tags = tg;
	}
	
	
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
