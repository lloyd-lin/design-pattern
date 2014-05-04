package lg.pattern.decorator.wear.impl;

import lg.pattern.decorator.wear.Decorator;

public class CoatDecorator extends Decorator {

	private String cName;

	public CoatDecorator(String cName) {
		this.cName = cName;
	}

	@Override
	public void dress() {
		super.dress();
		System.out.println("潇洒的披上" + this.cName + "上衣");
	}

}
