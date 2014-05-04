package lg.pattern.decorator.wear.impl;

import lg.pattern.decorator.wear.Decorator;


public class BottomDecorator extends Decorator {
	private String bName;

	public BottomDecorator(String bName) {
		this.bName = bName;
	}

	@Override
	public void dress() {
		super.dress();
		System.out.println("怒穿" + this.bName + "下装");
	}

}
