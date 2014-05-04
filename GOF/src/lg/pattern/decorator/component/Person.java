package lg.pattern.decorator.component;

public abstract class Person {
	private String name;
	
	public abstract void dress();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
