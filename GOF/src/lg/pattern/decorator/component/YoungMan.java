package lg.pattern.decorator.component;

import lg.pattern.decorator.wear.impl.BottomDecorator;
import lg.pattern.decorator.wear.impl.CoatDecorator;
import lg.pattern.decorator.wear.impl.HatDecorator;
import lg.pattern.decorator.wear.impl.ShoeDecorator;

public class YoungMan extends Person{

	@Override
	public void dress() {
		// TODO Auto-generated method stub
		System.out.println(super.getName() + " 准备出门啦！");
	}
	
	public static void main(String args[]){
		YoungMan xiaoming = new YoungMan();
		xiaoming.setName("小明");
		HatDecorator hat = new HatDecorator("鸭舌");
		CoatDecorator coat = new CoatDecorator("A&F针织衫");
		BottomDecorator bottom = new BottomDecorator("Evisu牛仔");
		ShoeDecorator shoe = new ShoeDecorator("Vans帆布");
		
		hat.setDressedPerson(xiaoming);
		coat.setDressedPerson(hat);
		bottom.setDressedPerson(coat);
		shoe.setDressedPerson(bottom);
		
		shoe.dress();
	}
}
