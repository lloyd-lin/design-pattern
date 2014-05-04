package lg.pattern.decorator.wear.impl;

import lg.pattern.decorator.wear.Decorator;

public class HatDecorator extends Decorator {

	private String hName;

	public HatDecorator(String hName) {
		this.hName = hName;
	}

	@Override
	public void dress() {
		super.dress();
		System.out.println("优雅带上" + this.hName + "帽");
	}
}
