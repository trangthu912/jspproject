package Dog.p;

public class Dog {
	protected String color;
	protected String name;
	protected String breed;
	
	public Dog(String color, String name, String breed) {
		this.color = color;
		this.name = name;
		this.breed = breed;
	}
	
	protected void wagging(String wagging ) {
		System.out.println("wagging:" + wagging);
		}
	
}
