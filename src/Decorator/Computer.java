package Decorator;

public abstract class Computer {

	String description = "Computer unknown";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double price();
	
}
