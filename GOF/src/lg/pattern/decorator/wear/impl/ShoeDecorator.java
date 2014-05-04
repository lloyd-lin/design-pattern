package lg.pattern.decorator.wear.impl;

import lg.pattern.decorator.wear.Decorator;

public class ShoeDecorator extends Decorator {

	private String sName;

	public ShoeDecorator(String sName) {
		this.sName = sName;
	}

	@Override
	public void dress() {
		super.dress();
		System.out.println("朵悠悠穿上" + this.sName + "鞋子");
		end();
	}
    //增加独有方法
	public void end() {
		System.out.println("出门GOGOGO！");
	}
}
