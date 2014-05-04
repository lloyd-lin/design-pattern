package lg.pattern.factorymethod;

import lg.pattern.factorymethod.factory.IFactory;
import lg.pattern.factorymethod.factory.StudentFactory;
import lg.pattern.factorymethod.factory.VolunteerFactory;

public class TakeCareOfOld {

	public static void main(String[] args) {
		IFactory f1 = new StudentFactory();
		LeiFeng student = f1.createLeiFeng();
		student.sweep();
		student.wash();
		student.buyRice();
		
		IFactory f2 = new VolunteerFactory();
		LeiFeng volunteer = f2.createLeiFeng();
		volunteer.sweep();
		volunteer.wash();
		volunteer.buyRice();
	}

}
