
public class Fish extends Animal {

	private double length;
	private boolean saltwater;
	private boolean scales;
	
	public Fish(String n, String t, int a, boolean v, boolean f, String c, double l, boolean sw, boolean sc) {
		super(n, t, a, v, f, c);
		
		setLength(l);
		setSaltwater(sw);
		setScales(sc);
	}
	
	public void setLength(double l) {
		length = l;
	}
	
	public void setSaltwater(boolean sw) {
		saltwater = sw;
	}
	
	public void setScales(boolean sc) {
		scales = sc;
	}
	
	
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
