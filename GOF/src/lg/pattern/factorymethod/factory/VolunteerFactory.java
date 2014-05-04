package lg.pattern.factorymethod.factory;

import lg.pattern.factorymethod.LeiFeng;
import lg.pattern.factorymethod.Volunteer;

public class VolunteerFactory implements IFactory{

	@Override
	public LeiFeng createLeiFeng() {
		return new Volunteer();
	}

}
