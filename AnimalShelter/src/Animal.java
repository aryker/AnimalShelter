
public class Animal {
	private String name;
	private String type;
	private int age;
	private boolean vaccinated;
	private boolean fixed;
	private String color;
	
	public Animal(String n, String t, int a, boolean v, boolean f, String c) {
		setName(n);
		setType(t);
		setAge(a);
		setVacc(v);
		setFixed(f);
		setColor(c);
	}
	
	public Animal() {
		setName("");
		setType("");
		setAge(-1);
		setVacc(false);
		setFixed(false);
		setColor("");
	}
	
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
