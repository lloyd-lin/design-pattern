package lg.pattern.factorymethod.factory;

import lg.pattern.factorymethod.LeiFeng;
import lg.pattern.factorymethod.Student;

public class StudentFactory implements IFactory{

	@Override
	public LeiFeng createLeiFeng() {
		return new Student();
	}

}
