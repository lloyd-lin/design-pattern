package lg.pattern.decorator.wear;

import lg.pattern.decorator.component.Person;

public abstract class Decorator extends Person {

	protected Person person;

	public void setDressedPerson(Person person) {
		this.person = person;
	}

	@Override
	public void dress() {
		if (person != null) {
			person.dress();
		}
	}
}
